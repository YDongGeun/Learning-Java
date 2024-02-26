package mission.snow.teamProject;

import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class Staff {
    private Map<String, SneakersInfo> sneakersInfoMap;
    private Map<String, Long> sneakersStockMap;

    private List<SaleInfo> saleInfoList;
    private long salesAmount;

    public Staff(long salesAmount) {
        this.sneakersInfoMap = new HashMap<>();
        this.sneakersStockMap = new HashMap<>();
        this.saleInfoList = new ArrayList<>();
        this.salesAmount = salesAmount;
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public void readFileAndSetSneakerInfoMap() {
        try (BufferedReader fis = new BufferedReader(new FileReader("Learning-Java/Learning-Java/src/mission/snow/teamProject/input/nike-sneaker-characters.txt"))) {

            String line;
            while (true) {
                line = fis.readLine();
                if (line == null) break;

                String[] strArray = line.split("\\|");
                String modelName = strArray[0];
                long price = Long.parseLong(strArray[1]);
                String[] features = strArray[2].split(",");

                SneakersInfo sneakersInfo = new SneakersInfo(modelName, price, features);
                sneakersInfoMap.put(modelName, sneakersInfo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Staff : 운동화 정보 다음과 같이 숙지하였습니다. " + this.sneakersInfoMap);
    }

    public void readFileAndSetSneakersStockMap() {
        try (BufferedReader fis = new BufferedReader(new FileReader("Learning-Java/Learning-Java/src/mission/snow/teamProject/input/nike-sneaker-stocks.txt"))) {

            String line;
            while (true) {
                line = fis.readLine();
                if (line == null) break;

                String[] strArray = line.split("\\|");
                String modelName = strArray[0];
                long stock = Long.parseLong(strArray[1]);

                sneakersStockMap.put(modelName, stock);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Staff : 운동화 재고 정보 다음과 같이 숙지하였습니다. " + this.sneakersStockMap);
    }

    /**
     * 운동화 재고를 기록하고 파일에 저장
     */
    public void printFileAfterSneakersStock() {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Learning-Java/Learning-Java/src/mission/snow/teamProject/output/nike-sneaker-stocks-2.txt"))) {

            for (String key : sneakersStockMap.keySet()) {
                printWriter.printf("%s|%d\n", key, sneakersStockMap.get(key));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Staff : 금일 정산 이후, 운동화 재고를 기록하고 파일에 저장했습니다.");
    }

    /**
     * 판매를 기록하고 파일에 저장
     */
    public void printFileAfterSale() {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Learning-Java/Learning-Java/src/mission/snow/teamProject/output/staff-sales.txt"))) {

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            for (SaleInfo saleInfos : saleInfoList) {
                printWriter.printf("%s|%s|%d|%s|%s\n",
                        saleInfos.getSaleStatus(),
                        saleInfos.getModelName(),
                        saleInfos.getCustomer().makePaymentOfSneakers(this),
                        saleInfos.getCustomer().getCustomerLevel(),
                        dateTimeFormatter.format(saleInfos.getSaleTime()));
            }

            printWriter.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Staff : 금일 정산 이후, 판매를 기록하고 파일에 저장했습니다.");
    }

    /**
     * 직원의 수입을 기록하고 파일에 저장
     */
    public void printFileAfterTodayCount() {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("Learning-Java/Learning-Java/src/mission/snow/teamProject/output/today-sales.txt"), true)) {

            printWriter.write("staff|" + getSalesAmount() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Staff : 금일 정산 이후, 직원의 수입을 기록하고 파일에 저장했습니다.");
    }

    /**
     * 처음 고객 질문에 대한 답변
     * @param customer
     * @throws RuntimeException
     */
    public void answerSneakersToCustomer(Customer customer) throws RuntimeException {
        // 고객들이 찾는 모델 변수
        SneakersInfo getModelInfo = sneakersInfoMap.get(customer.getModelName());

        if (sneakersInfoMap.containsKey(customer.getModelName())) {
            System.out.printf("Staff : 이 %s 운동화는 %s의 특징들과 %d의 가격을 가지고 있습니다\n",
                    getModelInfo.getModelName(),
                    Arrays.toString(getModelInfo.getFeatures()),
                    getModelInfo.getPrice());
        } else {
            Optional<SneakersInfo> sneakersInfoOptional = Optional.ofNullable(sneakersInfoMap.get(customer.getModelName()));
            sneakersInfoOptional.orElseThrow(() -> new RuntimeException("exception"));
        }
    }

    /**
     * 운동화 가격 반환
     * @param customer
     * @return price
     */
    public long getModelPrice(Customer customer) {
        return sneakersInfoMap.get(customer.getModelName()).getPrice();
    }

    /**
     * 남은 재고 반환
     * @param customer
     * @return sneakersStock
     */
    public long getModelStock(Customer customer) {
        return sneakersStockMap.get(customer.getModelName());
    }

    /**
     * 신발 정보 반환
     * @param customer
     * @return sneakersInfo
     */
    public SneakersInfo getSneakersInfo(Customer customer) {
        return sneakersInfoMap.get(customer.getModelName());
    }

    /**
     * 결재 후 재고 변경
     * @param customer
     */
    public void sneakersStockAfterPayment(Customer customer) {
        sneakersStockMap.put(customer.getModelName(), getModelStock(customer) - 1);
    }

    /**
     * 고객과 직원이 주문하는 상황
     * @param customer
     */
    public void takeOrder(Customer customer) {
        long customerPayment;

        System.out.printf("Staff : 고객님 %s 주문 도와드리겠습니다. 가격은 %d 입니다.\n",
                sneakersInfoMap.get(customer.getModelName()).getModelName(),
                sneakersInfoMap.get(customer.getModelName()).getPrice());
        if (customer.getCustomerLevel() != CustomerLevel.SILVER) {
            System.out.printf("Customer : 저 %s 등급이어서 운동화 할인 %.2f 되는 걸로 알고 있습니다.\n", customer.getCustomerLevel(), customer.getDiscount());
        }
        customerPayment = customer.makePaymentOfSneakers(this);
        salesAmount += customerPayment;

        System.out.printf("Staff : 신발 가격 %d 확인하였습니다.\n", customerPayment);

        sneakersStockAfterPayment(customer);
        saleAfterOrder(customer, SaleStatus.SALE, sneakersInfoMap.get(customer.getModelName()).getModelName());
        if (customer.getLikeDelivery()) {
            deliveryAfterOrder(customer, SaleStatus.DELIVERY, sneakersInfoMap.get(customer.getModelName()).getModelName());
        }
        /* 환불 여부 확인 후
          if (customer.isRefund()) {
                refund(customer, SaleStatus.REFUND, sneakersInfoMap.get(customer.getModelName()).getModelName());
          }
         */
    }

    /**
     * 판매 주문 후 판매 목록 리스트에 추가
     * @param customer
     * @param saleStatus
     * @param modelName
     */
    public void saleAfterOrder(Customer customer, SaleStatus saleStatus, String modelName) {
        saleInfoList.add(new SaleInfo(customer, saleStatus, modelName));
    }

    /**
     * 배달 주문 후 판매 목록 리스트 추가
     * @param customer
     * @param saleStatus
     * @param modelName
     */
    public void deliveryAfterOrder(Customer customer, SaleStatus saleStatus, String modelName) {
        saleInfoList.add(new SaleInfo(customer, saleStatus, modelName));
    }

    /**
     * 환불 주문 후 판매 목록 리스트 추가
     * @param customer
     * @param saleStatus
     * @param modelName
     */
    public void refund(Customer customer, SaleStatus saleStatus, String modelName) {
        saleInfoList.add(new SaleInfo(customer, saleStatus, modelName));
    }


}
