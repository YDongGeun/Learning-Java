package exercise.chapter_55;

public class StringUtils {

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // 정적 내부 클래스로 구현.
    public static class CharChecker {
        public static int countChar(String str, char targetChar) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) count++;
            }
            return count;
        }

        public static boolean containsChar(String str, char targetChar) {
            return countChar(str, targetChar) > 0;
        }
    }
}
