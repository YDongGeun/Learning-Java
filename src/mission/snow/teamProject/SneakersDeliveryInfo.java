package mission.snow.teamProject;

public class SneakersDeliveryInfo {
    private String modelName;
    private int deliveryTimeOfHours;
    private long deliveryCost;

    public SneakersDeliveryInfo(String modelName, int deliveryTimeOfHours, long deliveryCost) {
        this.modelName = modelName;
        this.deliveryTimeOfHours = deliveryTimeOfHours;
        this.deliveryCost = deliveryCost;
    }

    public String getModelName() {
        return modelName;
    }

    public int getDeliveryTimeOfHours() {
        return deliveryTimeOfHours;
    }

    public long getDeliveryCost() {
        return deliveryCost;
    }

    @Override
    public String toString() {
        return "SneakersDeliveryInfo{" +
                "modelName='" + modelName + '\'' +
                ", deliveryTimeOfHours=" + deliveryTimeOfHours +
                ", deliveryCost=" + deliveryCost +
                '}';
    }
}
