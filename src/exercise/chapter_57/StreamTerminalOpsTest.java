package exercise.chapter_57;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");

        // 1. forEach(): 출력
        fruits.stream().forEach((fruit) -> System.out.println("for-each 출력: " + fruit));

        // 2. collect: 다른 또는 같은 컬렉션 반환
        Set<String> fruitSet = fruits.stream().collect(Collectors.toSet());
        System.out.println("fruitSet: " + fruitSet);

        // 3. findFirst(): Stream 첫번째 값 산출, Optional
        Optional<String> fruitOptional = fruits.stream().findFirst();
        System.out.println("optional fruit: " + fruitOptional.orElseGet(() -> "기본 과일"));

        // List Integers
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        // sum, average
        System.out.println("sum 값은: " + integers.stream().mapToInt(i -> i).sum());
        System.out.println("Average 값은: " + integers.stream().mapToInt(i -> i).average());

        // count(), max(), min()
        System.out.println("Stream 길이: " + integers.stream().count());
        System.out.println("Stream 가장 큰 값: " + integers.stream().mapToInt(i -> i).max());
        System.out.println("Stream 가장 작은 값: " + integers.stream().mapToInt(i -> i).min());

        // reduce() 이용하여 소모 값 구하기
        int result = integers.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("reduce 구한 값: " + result);

    }
}
