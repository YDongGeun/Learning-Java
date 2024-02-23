package programmers.BestBiggerNum;

import java.util.*;

public class Solution {
    public String solution(int[] numbers) {
        Arrays.sort(numbers);
        int temp = numbers[numbers.length - 1];
        StringBuilder sb = new StringBuilder();

        for (int i = numbers.length - 1; i >= 0; i--) {
            if ((numbers[i] / 10) > temp) {
                temp = numbers[i];
                sb.append(temp);
            } else {
                sb.append(numbers[i]);
            }
        }

        return sb.toString();
    }
}
