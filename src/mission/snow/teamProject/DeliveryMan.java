package mission.snow.teamProject;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DeliveryMan {
    private long salesAmount;
    private Map<String, SneakersDeliveryInfo> sneakersDeliveryInfoMap;
    private List<Customer> needToDelivery;
    private List<DeliveryInfo> deliveryInfoList;

    public DeliveryMan(long salesAmount) {
        this.salesAmount = salesAmount;
        this.sneakersDeliveryInfoMap = new HashMap<>();
        this.needToDelivery = new ArrayList<>();
        this.deliveryInfoList = new ArrayList<>();
    }

    public void readFileAndSetSneakerDeliveryInfoMap() {
        try (BufferedReader fis = new BufferedReader(new FileReader("Learning-Java/Learning-Java/src/mission/snow/teamProject/input/nike-sneaker-delivery-infos.txt"))) {

            String line;
            while (true) {
                line = fis.readLine();
                if (line == null) break;

                String[] strArray = line.split("\\|");
                String modelName = strArray[0];
                int deliveryTimeOfHours = Integer.parseInt(strArray[1]);
                long cost = Long.parseLong(strArray[2]);

                SneakersDeliveryInfo sneakersDeliveryInfo = new SneakersDeliveryInfo(modelName, deliveryTimeOfHours, cost);
                sneakersDeliveryInfoMap.put(modelName, sneakersDeliveryInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Delivery_man : 운동화 정보 다음과 같이 숙지하였습니다. " + this.sneakersDeliveryInfoMap);
    }

    public void readCustomerOfNeedToDelivery(List<Customer> customerList) {
        for (Customer customer : customerList) {
            if (customer.isDelivery(this)) needToDelivery.add(customer);
        }
        System.out.println("Delivery_man : 배송을 희망한 고객을 다음과 같이 숙지하였습니다. " + this.needToDelivery);
    }

    public void printFileAfterDelivery() {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Learning-Java/Learning-Java/src/mission/snow/teamProject/output/delivery-manager-record.txt"))) {

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            for (DeliveryInfo deliveryInfos : deliveryInfoList) {
                printWriter.printf("%s|%s|%d|%s|%s\n",
                        deliveryInfos.getSaleStatus(),
                        deliveryInfos.getModelName(),
                        deliveryInfos.getCustomer().makePaymentOfDeliveryCost(this),
                        deliveryInfos.getCustomer().getCustomerLevel(),
                        dateTimeFormatter.format(deliveryInfos.getDeliveryTime()));
            }

            printWriter.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Delivery_man : 배송을 완료하고 배달관리자 수입을 기록하고 파일에 저장했습니다.");
    }

    public void printFileAfterTodayCount() {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Learning-Java/Learning-Java/src/mission/snow/teamProject/output/today-sales.txt"), true)) {

            printWriter.write("delivery-man|\n" + getSalesAmount());

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Delivery_man : 금일 정산 이후, 배송 관리자의 수입을 기록하고 파일에 저장했습니다.");
    }

    public void delivery(Customer customer) {
        long customerPayment;
        System.out.printf("Delivery_man : %s 상품이 배송 중입니다. 배송 비용은 %d 입니다.\n",
                sneakersDeliveryInfoMap.get(customer.getModelName()).getModelName(),
                sneakersDeliveryInfoMap.get(customer.getModelName()).getDeliveryCost());
        if (customer.getCustomerLevel() != CustomerLevel.SILVER) {
            System.out.printf("Customer : 저 %s 등급이어서 배송 할인 %d%s 되는 걸로 알고 있습니다.\n", customer.getCustomerLevel(), (long) (customer.getDeliveryCostDis() * 100), "%");
            System.out.printf("Delivery_man : 네, 배송비 %d 입니다.\n", customer.makePaymentOfDeliveryCost(this));
        }
        customerPayment = customer.makePaymentOfDeliveryCost(this);
        salesAmount += customerPayment;

        deliveryAfterOrder(customer, sneakersDeliveryInfoMap.get(customer.getModelName()).getModelName());
    }

    public void deliveryAfterOrder(Customer customer, String modelName) {
        deliveryInfoList.add(new DeliveryInfo(customer, modelName));
    }
    public long getSalesAmount() {
        return salesAmount;
    }

    public long getDeliveryCost(Customer customer) {
        return sneakersDeliveryInfoMap.get(customer.getModelName()).getDeliveryCost();
    }

    public int getDeliveryTimeOfHours(Customer customer) {
        return sneakersDeliveryInfoMap.get(customer.getModelName()).getDeliveryTimeOfHours();
    }
}
