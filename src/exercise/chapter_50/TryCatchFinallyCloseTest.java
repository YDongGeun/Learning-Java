package exercise.chapter_50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("실행");

        try (FileInputStream fs = new FileInputStream("Learning-Java/Learning-Java/src/exercise/chapter_50/test.txt")) {

            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }

            int myInt = 0;
            int data = 100 / myInt;

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제 발생");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();
        }

        System.out.println("종료");

        while (true) {
            Thread.sleep(1000);
        }
    }
}
