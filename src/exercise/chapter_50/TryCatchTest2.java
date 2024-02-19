package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args) {

        System.out.println("메인메소드 시작");

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("I");
        stringList.add("Love");
        stringList.add(null);
        stringList.add("Coding");

        for (int i = 0; i < stringList.size() + 5; i++) {
            try {
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("null은 들어갈 수 없습니다.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index는 Array Bound를 넘어갈 수 없습니다.");
                break;
            }
        }

        System.out.println("메인메소드 종료");
    }
}
