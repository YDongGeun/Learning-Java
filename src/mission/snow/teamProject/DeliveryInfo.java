package mission.snow.teamProject;

import java.time.LocalDateTime;

public class DeliveryInfo {
    private SaleStatus saleStatus;
    private Customer customer;
    private String modelName;
    private LocalDateTime DeliveryTime;

    public DeliveryInfo(Customer customer, String modelName) {
        this.saleStatus = SaleStatus.DELIVERY;
        this.customer = customer;
        this.modelName = modelName;
        DeliveryTime = LocalDateTime.now();
    }

    public SaleStatus getSaleStatus() {
        return saleStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getModelName() {
        return modelName;
    }

    public LocalDateTime getDeliveryTime() {
        return DeliveryTime;
    }
}
