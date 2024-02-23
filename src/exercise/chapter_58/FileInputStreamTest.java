package exercise.chapter_58;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args){
        // FileInputStream
        try(FileInputStream fis = new FileInputStream("src/exercise/chapter_56/test_korean.txt")){

            int i;
            while((i = fis.read()) != -1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
