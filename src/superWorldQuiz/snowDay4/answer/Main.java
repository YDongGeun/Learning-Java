package superWorldQuiz.snowDay4.answer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// 1. 고객 생성합니다.
        Customer customer1 = new Customer("John Doe", 30, Gender.MALE);
        Customer customer2 = new Customer("Jane Smith", 28, Gender.FEMALE);
        Customer customer3 = new Customer("Jane ho", 23, Gender.MALE);
        Customer customer4 = new Customer("Bob", 21, Gender.FEMALE);

        // 2. 주문 아이템을 만듭니다.
        OrderItem item1 = new OrderItem(1, "Keyboard", 35.99, 2);
        OrderItem item2 = new OrderItem(2, "Mouse", 19.99, 3);
        OrderItem item3 = new OrderItem(3, "Monitor", 149.99, 1);

        // 3. 주문 ItemList 제작합니다.
        List<OrderItem> orderItems1 = new ArrayList<>();
        orderItems1.add(item1);
        orderItems1.add(item2);
        orderItems1.add(item3);

        List<OrderItem> orderItems2 = new ArrayList<>();
        orderItems2.add(item1);
        orderItems2.add(item3);

        // 4. 주문 List 만듭니다.
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1001, customer1, LocalDate.of(2023, 11, 9), OrderStatus.PAID, orderItems1));
        orders.add(new Order(1002, null, LocalDate.of(2023, 11, 9), OrderStatus.SHIPPED, orderItems2));
        orders.add(new Order(1003, customer3, LocalDate.of(2023, 11, 9), OrderStatus.SHIPPED, orderItems2));
        orders.add(new Order(1004, customer2, LocalDate.of(2023, 11, 9), OrderStatus.ON_ORDER, null));
        orders.add(new Order(1005, customer4, LocalDate.of(2023, 11, 9), OrderStatus.NOT_PAID, null));
        orders.add(new Order(1006, customer1, LocalDate.of(2023, 11, 9), OrderStatus.SHIPPED, orderItems2));

        // 5. 오늘 주문 수 및 정산 진행합니다.
        double totalRevenue = 0;
        int totalOrderCount = 0;
        Set<OrderStatus> validStatus = new HashSet<>();
        validStatus.add(OrderStatus.DELIVERED);
        validStatus.add(OrderStatus.PAID);
        validStatus.add(OrderStatus.SHIPPED);

        for (Order order : orders) {
            try {
                Customer customer = order.getCustomer().orElseThrow(() -> new RuntimeException("고객이 누락 되었습니다."));
                if (validStatus.contains(order.getStatus()))
                    throw new RuntimeException(customer + "님의 주문이 아직 주문 처리 중입니다.");
                List<OrderItem> orderItems = order.getOrderItems().orElseThrow(() -> new RuntimeException(customer + "님의 주문 아이템들이 누락 되었습니다."));

                totalOrderCount++;

                for (OrderItem orderItem : orderItems) {
                    totalRevenue += orderItem.getTotalPrice();
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + " 문제로 해당 주문은 SKIP 합니다.");
            }
        }
        System.out.println("오늘 총 " + totalOrderCount + " 주문을 처리 하여 " + totalRevenue + " 수익을 올렸습니다.");
    }
}
