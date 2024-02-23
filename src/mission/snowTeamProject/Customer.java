package mission.snowTeamProject;

import java.util.Arrays;

public abstract class Customer {
    protected CustomerLevel customerLevel;
    protected String name;
    protected boolean likeDelivery;
    protected long myMoney;
    protected String modelName;
    protected double discount;
    protected double deliveryCostDis;

    public Customer(String name, boolean likeDelivery, long myMoney, String modelName) {
        this.name = name;
        this.likeDelivery = likeDelivery;
        this.myMoney = myMoney;
        this.modelName = modelName;
        this.discount = 0;
        this.deliveryCostDis = 0;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDeliveryCostDis() {
        return deliveryCostDis;
    }

    public Customer() {}

    public void askSneakersToStaff(Staff staff) throws RuntimeException {
        System.out.printf("Customer : %s에 대해 알려주세요\n", modelName);
        staff.answerSneakersToCustomer(this);
    }

    public void isPayment(long price) throws RuntimeException{
        if (price <= myMoney) System.out.printf("Customer : 네 좋네요, %s 주문 계속 진행할게요.\n", modelName);
        else {
            throw new RuntimeException();
        }
    }

    public boolean getLikeDelivery() {
        return likeDelivery;
    }

    public boolean isDelivery(DeliveryMan deliveryMan) {
        return myMoney >= deliveryMan.getDeliveryCost(this);
    }

    public String getModelName() {
        return this.modelName;
    }

    public long makePaymentOfSneakers(Staff staff) {
        long payment = staff.getModelPrice(this) - ((long) (staff.getModelPrice(this) * discount));
        myMoney -= payment;
        return payment;
    }

    public long makePaymentOfDeliveryCost(DeliveryMan deliveryMan) {
        long payment = (long) (deliveryMan.getDeliveryCost(this) - ((deliveryMan.getDeliveryCost(this)) * deliveryCostDis));
        myMoney -= payment;
        return payment;
    }

    public CustomerLevel getCustomerLevel() {
        return customerLevel;
    }

    public void review(Staff staff) {
        System.out.printf("Customer : 이 신발은 %s 의 특징이 느껴지네요, 잔액 %d 남았습니다.\n\n",
                Arrays.toString(staff.getSneakersInfo(this).getFeatures()),
                myMoney);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerLevel=" + customerLevel +
                ", name='" + name + '\'' +
                ", likeDelivery=" + likeDelivery +
                ", myMoney=" + myMoney +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}

class VIPCustomer extends Customer{

    public VIPCustomer(String name, boolean isDelivery, long myMoney, String modelName) {
        super(name, isDelivery, myMoney, modelName);
        this.customerLevel = CustomerLevel.VIP;
        discount = 0.2;
        deliveryCostDis = 1;
    }

}

class GOLDCustomer extends Customer{
    public GOLDCustomer(String name, boolean isDelivery, long myMoney, String modelName) {
        super(name, isDelivery, myMoney, modelName);
        this.customerLevel = CustomerLevel.GOLD;
        discount = 0.1;
        deliveryCostDis = 0.5;
    }

}

class SILVERCustomer extends Customer{

    public SILVERCustomer(String name, boolean isDelivery, long myMoney, String modelName) {
        super(name, isDelivery, myMoney, modelName);
        this.customerLevel = CustomerLevel.SILVER;
    }
}
