package exercise.chapter_53.learn_Optional;

import java.util.Optional;

public class OptionalDefaultTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optionalS = Optional.ofNullable(str);

        // str이 null이면 orElseGet 기본값을 가져오겠다.라는 뜻? 정도로 이해..
        int length = optionalS.orElseGet( () -> "" ).length();

        System.out.println(length);
    }
}
