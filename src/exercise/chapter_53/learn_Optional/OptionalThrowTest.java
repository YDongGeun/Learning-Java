package exercise.chapter_53.learn_Optional;

import java.util.Optional;

public class OptionalThrowTest {
    public static void main(String[] args) {
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        int length = stringOptional.orElseThrow(() -> {
            throw new CustomException("CustomException 발생");
        }).length();
        System.out.println(length);
    }
}
