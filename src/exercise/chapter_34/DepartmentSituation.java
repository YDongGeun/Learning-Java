package exercise.chapter_34;

public class DepartmentSituation {
    public static void main(String[] args) {
        // 상황

        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);

        Customer cs = new VIPCustomer("동근");

        Customer[] customerQueue = {
                cs, new Customer("철수"), new Customer("영희"), cs, new VIPCustomer("맹구"),
                new VIPCustomer("지우"), cs, new Customer("코난"), new Customer("짱구"),
                cs, new GolderCustomer("뚱이"), new GolderCustomer("웅이"), new GolderCustomer("상민")
        };

        for(Customer customer: customerQueue) {
            customer.printMyInfo();
            int cash = staff.helpPayment(customer, price);
            System.out.println("내가 내는 금액 : " + cash + "\n");
            staff.addSalesAmount(cash);
        }

        staff.printMySalesAmount();
    }
}
