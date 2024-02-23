package exercise.chapter_57;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest {

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


        // List Integers
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        // filler: 길이가 6이상인 과일만 선택
        fruits.stream().filter(fruit -> fruit.length() >= 6)
                .forEach(fruit -> System.out.println("Filter 적용: " + fruit));

        // distinct: 종복된 과일 제거
        List<String> fruitList = fruits.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct 적용: " + fruitList);

        // map: 과일 이름을 대문자로 변환 (현업에서 많이 씀)
        List<String> fruitListMap1 = fruits.stream().map(f -> f.toUpperCase()).collect(Collectors.toList());
        List<Integer> fruitListMap2 = fruits.stream().map(f -> f.length()).collect(Collectors.toList());
        System.out.println("Map 적용(대문자 변환): " + fruitListMap1);
        System.out.println("Map 적용(길이 변환): " + fruitListMap2);

        // limit: 처음 3개의 과일만 선택
        List<String> fruitListLimit = fruits.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limit 적용(3개만 가져옴): " + fruitListLimit);

        // skip: 처음 2개의 과일을 제외한 나머지 과일 선택
        List<String> fruitListSkip = fruits.stream().skip(2).collect(Collectors.toList());
        System.out.println("Skip 적용(맨 앞 2개를 제외): " + fruitListSkip);

        // sorted: 과일을 알파벳 순으로 정렬
        List<String> fruitListSorted1 = fruits.stream().sorted().collect(Collectors.toList());
        // sorted: String 길이 짧은 순으로 정렬
        List<String> fruitListSorted2 = fruits.stream().sorted( (fruit1, fruit2) -> fruit1.length() - fruit2.length() ).collect(Collectors.toList());

        System.out.println("정렬(알파벳 순): " + fruitListSorted1);
        System.out.println("정렬(길이: 오름차순): " + fruitListSorted2);
    }
}
