package exercise.chapter_50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 {
    public static void main(String[] args) {
        System.out.println("실행");

        try {
            FileInputStream fs = new FileInputStream("Learning-Java/Learning-Java/src/exercise/chapter_50/test.txt");

            int i;
            while ((i = fs.read()) != -1) {
                System.out.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("입출력 과정에서 문제 발생");
            e.printStackTrace();
        }

        System.out.println("종료");
    }
}
