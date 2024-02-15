package exercise.chapter_34;

public class VIPCustomer extends Customer{
    // 속성
    static int serialNumVIP = 1;
    private String agentID;
    private double discountRatio;

    // 행위
    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    public void callAgent() {
        System.out.println("담당직원 " + this.agentID + "님 문의드릴게 있어요.");
    }

    public VIPCustomer(String name) {
        super(name, "VIP");
        this.customerID = customerGrade + serialNumVIP++;
        this.bonusPointRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public void setAgentID() {
        this.agentID = agentID;
    }
    @Override
    public void printMyInfo() {
        System.out.print("VIP");
        super.printMyInfo();
    }
}
