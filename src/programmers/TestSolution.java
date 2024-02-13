package programmers;

public class TestSolution {
    public static void main(String[] args) {

        Joystick j = new Joystick();

/*        System.out.println(j.solution("ARRAYS")); // N,O가 최대 12번씩
        System.out.println(j.solution("PROGRAMMERS"));*/

        String name = "AAHAAAAAAAAG"; // 왼쪽 오른쪽 가는데만 10번 +7 +6

        System.out.println(j.nameTableMoveMin(name.toCharArray()));
//        System.out.println(j.solution(name));


    }
}
