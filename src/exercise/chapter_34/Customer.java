package exercise.chapter_34;

public class Customer {
    // 속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;

    protected int bonusPoint;
    protected double bonusPointRatio;

    // 행위
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(String name) {
        this(name, "SILVER");
        this.customerID = customerGrade + serialNums++;
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    Customer(String name, String customerGrade) {
        this.name = name;
        this.customerGrade = customerGrade;
    }

    public void printMyInfo() {
        System.out.printf("Customer(customerID = %s, name = %s, customerGrade = %s, bonusPoint = %d\n",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }
}
