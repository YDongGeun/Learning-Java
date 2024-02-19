package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        // Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        //Map에 데이터 들을 넣음
        fruitMap.put("Orange", 5);
        fruitMap.put("Banana", 10);
        fruitMap.put("Apple", 3);
        fruitMap.put("Kiwi", 15);

        System.out.println("fruitMap : " + fruitMap);


        // get(key) (값을 가져오기. 만약 키에 해당하는 값이 없다면 null반환 또는 Error.
        int appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("apple count : " + appleCount);
        System.out.println("banana count : " + bananaCount);

        // conatains(key) (주어진 키가 존재하는지 확인.)
        Boolean isApple = fruitMap.containsKey("Apple");
        boolean isMango = fruitMap.containsKey("Mango");

        System.out.println("is apple? : " + isApple);
        System.out.println("is mango? : " + isMango);

        // remove(key)
        fruitMap.remove("Apple");
        System.out.println("fruitMap : " + fruitMap);

        // size
        System.out.println("fruitMap 사이즈 : " + fruitMap.size());

        // keySet() Map -> Set 반환. 이때 'Set : 키들의 지합'
        System.out.println("Set으로 반환 : " + fruitMap.keySet());
    }
}
