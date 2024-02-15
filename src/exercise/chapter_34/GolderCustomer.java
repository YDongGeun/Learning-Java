package exercise.chapter_34;

public class GolderCustomer extends Customer {

    private double discountRatio;

    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    GolderCustomer(String name) {
        super(name, "GOLD");
        this.customerID = customerGrade + Customer.serialNums++;
        this.bonusPoint = 0;
        this.bonusPointRatio = 0.03;
        this.discountRatio = 0.03;
    }

    public void printMyInfo() {
        System.out.print("GOLD");
        super.printMyInfo();
    }
}
