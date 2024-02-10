package mission;

public class MovieRating {
    public static void main(String[] args) {
        int myAge = 0;
        if (myAge < 0) {
            System.out.println("유아 관람불가");
        } else if (myAge >= 0 && myAge < 12) {
            System.out.println("전체 관람가");
        } else if (myAge >= 12 && myAge < 15) {
            System.out.println("12세 이상 관람가");
        } else if (myAge >= 15 && myAge < 19) {
            System.out.println("15세 이상 관람불가");
        } else if (myAge >= 19) {
            System.out.println("청소년 관람불가");
        }
    }
}
