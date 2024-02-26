package mission.snow.teamProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final long TODAY_START_SALES_AMOUNT = 0;

        List<Customer> customerResList = new ArrayList<>();

        Staff staff = new Staff(TODAY_START_SALES_AMOUNT);
        DeliveryMan deliveryMan = new DeliveryMan(TODAY_START_SALES_AMOUNT);

        staff.readFileAndSetSneakerInfoMap();
        staff.readFileAndSetSneakersStockMap();
        deliveryMan.readFileAndSetSneakerDeliveryInfoMap();

        // 고객 대기 등록을 받습니다.
        System.out.println("안녕하세요~, \"고객등급,이름,배송선호 여부,예산,운동화 모델명\" 입력해주세요");

        while (scanner.hasNext()) {
            String response = scanner.nextLine();

            if (response.equals("끝")) {
                System.out.println("고객 대기 목록 명단에 넣었습니다." + customerResList);
                break;
            }

            try {
                String[] responseArray = response.split(",");
                CustomerLevel customerLevel = CustomerLevel.valueOf(responseArray[0]);
                String customerName = responseArray[1];
                boolean isCustomerLikeDelivery = Boolean.parseBoolean(responseArray[2]);
                long cache = Long.parseLong(responseArray[3]);
                String modelName = responseArray[4];

                Customer customer;

                if (customerLevel == CustomerLevel.VIP) {
                    customer = new VIPCustomer(customerName, isCustomerLikeDelivery, cache, modelName);
                } else if (customerLevel == CustomerLevel.GOLD) {
                    customer = new GOLDCustomer(customerName, isCustomerLikeDelivery, cache, modelName);
                } else {
                    customer = new SILVERCustomer(customerName, isCustomerLikeDelivery, cache, modelName);
                }

                customerResList.add(customer);

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("입력 형식이 잘못 되어 고객 등록 넘어갑니다.");
            }
        }

        // 배송을 희망하는 고객
        deliveryMan.readCustomerOfNeedToDelivery(customerResList);
        // 고객이 직원에게 한 명씩 주문을 받습니다.

        for (Customer customer : customerResList) {
            try {
                customer.askSneakersToStaff(staff);
                customer.isPayment(staff.getModelPrice(customer));
                staff.takeOrder(customer);
                if (customer.getLikeDelivery()) deliveryMan.delivery(customer);
                customer.review(staff);
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("Customer: 다음에 올게요.");
            }
        }

        // 정산
        staff.printFileAfterSneakersStock();
        staff.printFileAfterSale();
        staff.printFileAfterTodayCount();
        deliveryMan.printFileAfterTodayCount();
        deliveryMan.printFileAfterDelivery();
    }
}