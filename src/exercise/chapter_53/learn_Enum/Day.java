package exercise.chapter_53.learn_Enum;

public enum Day {
    SUNDAY("일요일"),
    MONDAY("월요일"),
    TUEDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");

    private final String koreanName;

    Day(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getKoreanName() {
        return koreanName;
    }
}
