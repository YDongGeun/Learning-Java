package exercise.chapter_56;

public class LambdaTest1 {
    public static void main(String[] args) {
        MultipleNum multipleNum1 = (x) -> x * 1;
        MultipleNum multipleNum2 = (i) -> i * 2;
        MultipleNum multipleNum3 = (x) -> { return x * 3; };
        MultipleNum multipleNum4 = (int myInt) -> { return myInt * 4; };


        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));
        System.out.println(multipleNum4.calculate(5));

    }

}
