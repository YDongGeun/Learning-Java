package mission.snowTeamProject;

import java.time.LocalDateTime;

public class SaleInfo {
    private SaleStatus saleStatus;
    private Customer customer;
    private String modelName;
    private LocalDateTime saleTime;


    public SaleInfo(Customer customer, SaleStatus saleStatus, String modelName) {
        saleTime = LocalDateTime.now();
        this.saleStatus = saleStatus;
        this.customer = customer;
        this.modelName = modelName;
    }


    public LocalDateTime getSaleTime() {
        return saleTime;
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
}
