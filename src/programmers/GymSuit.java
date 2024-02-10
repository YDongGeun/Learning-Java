package programmers;

class GymSuit {
    public int GymSuitSolution(int n, int[] lost, int[] reserve) {
        // 모든 학생들의 체육복 상태를 부여
        int[] student = new int[n];
        int answer = n;

        // 체육복을 도난당한 학생들에게 -1의 상태를 부여
        for (int l : lost) student[l - 1]--;
        // 여벌의 체육복을 가져온 학생들에게 1의 상태를 부여
        for (int r : reserve) student[r - 1]++;

        // 학생 수만큼 반복문 진행
        for (int i = 0; i < student.length; i++) {
            // 도난 당한 학생들의 대상으로 조건문 실행

            if (student[i] == -1) {
                // 만약 본인 번호보다 하나 작은 학생에게서 여벌의 체육복을 빌리는 경우
                if (i - 1 >= 0 && student[i - 1] == 1) {

                    student[i - 1]--; // 여벌의 체육복을 빌려준 학생들에게 0의 상태를 부여
                    student[i]++; // 체육복을 빌린 학생들에게 0의 상태를 부여

                    // 만약 본인 번호보다 하나 큰 학생에게서 여벌의 체육복을 빌리는 경우
                } else if (i + 1 < student.length && student[i + 1] == 1) {

                    student[i + 1]--; // 여벌의 체육복을 빌려준 학생들에게 0의 상태를 부여
                    student[i]++; // 체육복을 빌린 학생들에게 0의 상태를 부여

                    // 만약 인근 번호의 학생들이 여벌의 체육복이 없는 경우
                } else {
                    answer--; // 수업에 참여할 수 있는 인원 감소
                }
            }
        }

        return answer;
    }
}

