package exercise.chapter_53.learn_Optional;

public class StringNullDefault {

    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("NullPointException 발생. 기본값으로 사용합니다.");
            str = "";
            int length = str.length();
            System.out.println(length);
        }
    }
}
