package programmers;

import java.util.Arrays;

public class Joystick {
    int answer = 0;

    public void fitLetter(char nameLetter, char answerName) {
        while (nameLetter != answerName) {
            if (nameLetter < 78) answerName++;
            else {
                if (answerName == 65) {
                    answerName = 90;
                    answer++;
                }
                answerName--;
            }
            answer++;
        }
    }



    /**
     *    // A에서 시작하여 I의 뒤로 이동하는 최소한의 움직임을 계산하는 메서드
     *     public static int findMinimumMoves(char[] table, int iIndex) {
     *         int clockwiseMoves = findClockwiseMoves(table, iIndex);
     *         int counterclockwiseMoves = findCounterclockwiseMoves(table, iIndex);
     *
     *         return Math.min(clockwiseMoves, counterclockwiseMoves);
     *     }
     *
     *     // A에서 시작하여 시계 방향으로 I의 뒤로 이동하는 움직임을 계산하는 메서드
     *     public static int findClockwiseMoves(char[] table, int iIndex) {
     *         int moves = 0;
     *         for (int current = 0; current != iIndex; current = (current + 1) % table.length) {
     *             moves++;
     *         }
     *         return moves;
     *     }
     *
     *     // A에서 시작하여 반시계 방향으로 I의 뒤로 이동하는 움직임을 계산하는 메서드
     *     public static int findCounterclockwiseMoves(char[] table, int iIndex) {
     *         int moves = 0;
     *         for (int current = 0; current != iIndex; current = (current - 1 + table.length) % table.length) {
     *             moves++;
     *         }
     *         return moves;
     *     }
     * }
     */

    public int solution(String name) {
        int nowCursor;
        char[] answerName = new char[name.length()];
        Arrays.fill(answerName, 'A');

        for (nowCursor = 0; nowCursor < name.length(); nowCursor++) {
            fitLetter(name.charAt(nowCursor), answerName[nowCursor]);
            if (nowCursor != name.length() - 1) answer++;
        }

        return answer;
    }


}
