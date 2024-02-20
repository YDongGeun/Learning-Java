package exercise.chapter_56;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {
    public static void main(String[] args) {
        String str = null;

        Optional<String> stringOptional = Optional.ofNullable(str);

//        String str2 = stringOptional.orElseGet(() -> "default").toUpperCase();

        String str2 = stringOptional.orElseThrow(() -> {
            throw new CustomException("CustomException 발생");
        }).toUpperCase();

        System.out.println(str2);
    }
}
