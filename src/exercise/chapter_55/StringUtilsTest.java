package exercise.chapter_55;

public class StringUtilsTest {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'o';

        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("isEmpty? " + isEmpty);

        String strReverse = StringUtils.reverse(str);
        System.out.println(strReverse);

        int countChar = StringUtils.CharChecker.countChar(str, target);
        System.out.println("'o' 몇개? " + countChar);

        boolean containChar = StringUtils.CharChecker.containsChar(str, target);
        System.out.println("'o'가 있는지? " + containChar);

    }
}
