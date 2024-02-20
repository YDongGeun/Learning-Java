package exercise.chapter_53;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {
        // 현재시간 추가
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // 특정 일/월/년 가져오기, 요일
        LocalDate past = LocalDate.of(2002, 1, 21);
        System.out.println(past);
        System.out.println(past.getDayOfWeek());

        // 날짜 포멧 바꾸기
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd--------yy");
        String dateStr = past.format(dateTimeFormatter);

        System.out.println(past);
        System.out.println(dateStr);
    }
}
