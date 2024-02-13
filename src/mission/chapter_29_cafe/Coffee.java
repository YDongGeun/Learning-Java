package mission.chapter_29_cafe;

public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장됨 여부

    // 행위
    public void wrapUp() {
        this.isWrappedUp = true;
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        this.isWrappedUp = false;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
