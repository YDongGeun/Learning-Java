package exercise.chapter_65;

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
    @MyAnnotation(name = "가격 계산 하기")
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    @MyAnnotation(name = "생성자")
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

    @MyAnnotation(name = "Equal")
    public boolean equal(Object object) {
        if (object == null) return false;
        if (object instanceof Customer) {
            Customer customer = (Customer) object;
            return customer.customerID == this.customerID;
        } else {
            return false;
        }
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
