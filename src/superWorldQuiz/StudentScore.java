package superWorldQuiz;

import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex;
    private static int[] allScores = new int[0];

    private int myIndex;
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex- 1] = score;
    }

    public StudentScore(int score) {
        serialIndex++;
        this.score = score;
        myIndex = serialIndex;
        addAllScore(score);
    }

    private static void addAllScore(int score) {
        int[] newAllScores = Arrays.copyOf(allScores, allScores.length + 1);
        newAllScores[allScores.length] = score;
        allScores = newAllScores;
    }
}
