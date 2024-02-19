package exercise.chapter_50;

public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("메인메소드 시작");

        try {
            int i = 0;
            int data = 50 / i;
            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수가 없습니다.");
            System.out.println("data: " + 0);
            e.printStackTrace();
        }

        System.out.println("메인메소드 종료");
    }
}
