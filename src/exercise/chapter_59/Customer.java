package exercise.chapter_59;

import java.io.Serializable;

public class Customer implements Serializable {
    // 속성
    private final long serialVersionUID = 1L;
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

    public Customer(String name) {
        this(name, "SILVER");
        this.customerID = customerGrade + serialNums++;
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public Customer(String name, String ID) {
        this.name = name;
        this.customerID = ID;
    }

    public void printMyInfo() {
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return String.format("Customer(customerID = %s, name = %s, customerGrade = %s, bonusPoint = %d)",
                this.customerID, this.name, this.customerGrade, this.bonusPoint);
    }
}
