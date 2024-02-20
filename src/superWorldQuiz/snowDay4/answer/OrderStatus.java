package superWorldQuiz.snowDay4.answer;

enum OrderStatus {
    PAID("주문 완료"),
    SHIPPED("배송 완료"),
    DELIVERED("배송 완료"),
    NOT_PAID("결제 전"),
    ON_ORDER("주문 중");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}