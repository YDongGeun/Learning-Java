package exercise;

public class StringFormat {
    public static void main(String[] args) {
        String str = "string";
        String result;

        // String
        result = String.format("문자 서식: %s, %S", str, str);
        // %s 소문자, %S 대문자
        System.out.println(result);

        // int
        int myInt = 10;
        result = String.format("정수 서식: %05d", myInt);
        // %05d 5자리 정수로 만듦.
        System.out.println(result);

        // float
        float myFloat = 12.545678f;
        result = String.format("실수 서식: %f, %.1f, %.2f, %.3f, %.4f",
                                myFloat, myFloat, myFloat, myFloat, myFloat);
        // %.2f 둘째자리에서 반올림
        System.out.println(result);
    }
}
