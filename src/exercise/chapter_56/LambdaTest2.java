package exercise.chapter_56;

public class LambdaTest2 {
    public static void main(String[] args) {
        MultipleNum multipleNum = num -> num * 1;

        StringNum stringNum = (str, num) -> {
            for (int i = 0; i < num; i++) {
                System.out.println("stringNum: " + str);
            }
        };
    }
}
