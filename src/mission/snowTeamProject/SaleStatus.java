package mission.snowTeamProject;

public enum SaleStatus {
    SALE("판매 완료"),
    DELIVERY("배송 완료"),
    REFUND("환불 완료");

    private final String koreanStatus;
    SaleStatus(String koreanStatus) {
        this.koreanStatus = koreanStatus;
    }
}
