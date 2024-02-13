package programmers;

import java.util.Arrays;

public class Joystick {

    static int answer = 0;
    int tableIndex = 0;

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
    
    public int nameTableMoveMin(char[] nameArr) {
        int moveRight = 0;
        int moveLeft = 0;
        int nextCursor = 0;
        int prevCursor = 0;
        int minMove = Integer.MAX_VALUE;

        for (int i = 0; i < nameArr.length; i++) {
            if (nameArr[i] != 'A') {
                nextCursor = i;
                moveRight = Math.abs(nextCursor - prevCursor);
                moveLeft = Math.abs(nameArr.length - nextCursor + prevCursor);
                minMove = Math.min(minMove, Math.min(moveRight, moveLeft));
                prevCursor = nextCursor;
            }
        }

        answer += minMove;

        return answer;
    }

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
