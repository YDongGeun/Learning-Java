package exercise.chapter_43;

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

    @Override
    public String toString() {
        return String.format("GOLDCustomer(customerID = %s, name = %s, customerGrade = %s, bonusPoint = %d, discountRatio = %.2f)",
                this.customerID, this.name, this.customerGrade, this.bonusPoint, this.discountRatio);
    }
}
