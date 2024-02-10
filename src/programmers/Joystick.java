package programmers;

import java.util.Arrays;

public class Joystick {
    int answer = 0;

    public int upCursor(int alphabet) {
        alphabet++;
        answer++;
        return alphabet;
    }

    public int downCursor(int alphabet) {
        if (alphabet == 65) {
            answer++;
            alphabet = 90;
        } else {
            alphabet--;
            answer++;
        }
        return alphabet;
    }

    public void fitLetter(char nameLetter, int nowCursor, char[] answerName) {
        while (nameLetter != answerName[nowCursor]) {
            if (nameLetter < 78) answerName[nowCursor]++;
            else {
                if (answerName[nowCursor] == 65) {
                    answerName[nowCursor] = 90;
                    answer++;
                }
                answerName[nowCursor]--;
            }
            answer++;
        }
    }

    public int solution(String name) {
        int nowCursor;
        char[] answerName = new char[name.length()];
        Arrays.fill(answerName, 'A');

        for (nowCursor = 0; nowCursor < name.length(); nowCursor++) {
            fitLetter(name.charAt(nowCursor), nowCursor, answerName);
            if (nowCursor != name.length() - 1) answer++;
        }

        return answer;
    }


}
