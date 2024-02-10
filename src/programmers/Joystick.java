package programmers;

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

    public void changeLetter(char nameLetter, char answerLetter) {
        while (nameLetter != answerLetter) {
            answerLetter++;
            answer++;
        }
    }

    public int solution(String name) {
        int nowCursor;
        char[] answerName = new char[name.length()];

        for (int i = 0; i < answerName.length; i++) {
            answerName[i] = 'A';
        }

        for (nowCursor = 0; nowCursor < name.length(); nowCursor++) {
            changeLetter(name.charAt(nowCursor), answerName[nowCursor]);
            answer++;
        }

        return answer;
    }
}
