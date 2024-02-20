package exercise.chapter_53.learn_Enum;

public class DayTest {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;

//        System.out.println("요일: " + monday.getKoreanName());

        Day day = Day.SATURDAY;
        switch (day) {
            case MONDAY:
                System.out.println("한 주의 시작!" + day.getKoreanName());
            case TUEDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("오늘은 평일입니다." + day.getKoreanName());
            case FRIDAY:
                System.out.println("다음날이 주말입니다." + day.getKoreanName());
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다." + day.getKoreanName());
        }
    }
}
