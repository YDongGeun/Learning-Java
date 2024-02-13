package mission.chapter_29_cafe;

public class Barista {

    // 행위
    public void noticeOrder(String coffeeName) {
        System.out.println("바리스타: 커피 주문 확인, 커피: " + coffeeName);
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        return new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
    }

    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작 완료, 커피: " + coffeeName);
    }
}
