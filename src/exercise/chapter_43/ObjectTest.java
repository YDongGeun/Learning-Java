package exercise.chapter_43;

public class ObjectTest {
    public static void main(String[] args) {
        Customer customer = new Customer("민철");
        Customer goldCustomer = new GolderCustomer("지민");
        Staff staff = new Staff();
        VIPCustomer vipCustomer = new VIPCustomer("동근");

        System.out.println(customer.toString());
        System.out.println(goldCustomer.toString());
        System.out.println(staff.toString());
        System.out.println(vipCustomer.toString());
    }
}
