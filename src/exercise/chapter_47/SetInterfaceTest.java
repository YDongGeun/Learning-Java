package exercise.chapter_47;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {
        // Set인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        // Add
        fruitSet.add("Orange");
        fruitSet.add("Apple");
        fruitSet.add("Mango");
        fruitSet.add("Grape");
        fruitSet.add("Banana");

        System.out.println("fruitSet: " + fruitSet);
    }
}
