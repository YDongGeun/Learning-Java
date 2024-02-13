package mission.chapter_29_cafe;

public class Cashier {
    // 속성
    private long salesAmount;

    // 행위
    public long checkCoffeePrice(String coffeeName) {
        long price;
        switch (coffeeName) {
            case "Americano":
                price = 5000;
                break;
            case "Latte":
                price = 6500;
                break;
            case "Cappuccino":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    public void replyCoffeePrice(String coffeeName, long price) {
        if (price == 0) {
            System.out.println("캐시어: 죄송합니다. 손님이 말하신 " + coffeeName + "는 지금 없습니다.");
        } else System.out.println("캐시어: 말하신 커피 " + coffeeName + "은  가격이 " + price + "원 입니다.");
    }

    public void addAmount(long money) {
        this.salesAmount += money;
    }

    public void sayOrder(String coffeeName) {
        System.out.println("캐시어: 커피 " + coffeeName + " 주문이 들어왔습니다.");
    }

    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문하신 커피 " + coffeeName + "가 준비완료 되었습니다.");
    }

    public long getSalesAmount() {
        return salesAmount;
    }

    public void setSaleAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public Coffee wrapUpCoffee(Coffee coffee) {
        coffee.wrapUp();
        return coffee;
    }
}
