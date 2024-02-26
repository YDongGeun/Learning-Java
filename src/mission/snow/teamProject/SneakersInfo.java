package mission.snow.teamProject;

import java.util.Arrays;

public class SneakersInfo {
    String modelName;
    long price;
    String[] features;

    public SneakersInfo(String modelName, long price, String[] features) {
        this.modelName = modelName;
        this.price = price;
        this.features = features;
    }

    public String getModelName() {
        return modelName;
    }

    public long getPrice() {
        return price;
    }

    public String[] getFeatures() {
        return features;
    }

    @Override
    public String toString() {
        return "SneakersInfo{" +
                "modelName='" + modelName + '\'' +
                ", price=" + price +
                ", features=" + Arrays.toString(features) +
                '}';
    }
}
