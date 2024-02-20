package exercise.chapter_53.learn_Optional;

public class StringNullThrowTest {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            throw new CustomException("CustomException 발생");
        }
    }
}


class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
