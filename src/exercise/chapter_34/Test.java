package exercise.chapter_34;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("철수");
        VIPCustomer vipCustomer = new VIPCustomer("돈마니");
        Customer customer2 = new Customer("영희");

        customer.printMyInfo();
        vipCustomer.printMyInfo();
        customer2.printMyInfo();
    }
}
