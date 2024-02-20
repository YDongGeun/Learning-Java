package programmers.H_Index;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = citations.length - 1; i >= 0; i--) {
            answer++;
            if (citations[i] < answer) {
                return answer -= 1;
            } else if (citations[i] == answer) {
                return answer;
            }
        }
        return answer;
    }
}
