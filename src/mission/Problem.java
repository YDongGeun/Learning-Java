package mission;

import java.util.Arrays;

class Problem {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = resultArr(arr1);
        int[] result4 = new int[0];
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {58, 172, 746, 89};
        int[] result2 = resultArr(arr2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = {9, 8, 7};
        int[] result3 = resultArr(arr3);
        System.out.println(Arrays.toString(result3));

        int[] arr4 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 1111, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444, 2222, 333, 4444};
        result4 = resultArr(arr4);
        System.out.println(Arrays.toString(result4));
    }

    public static int[] resultArr(int[] arr) {
        int[] newArr;
        if ((arr.length > 0) && ((arr.length & (arr.length - 1)) == 0)) {
            return arr;
        } else {
            int a = 1;
            newArr = arr.clone();
            while (a < newArr.length) {
                /**
                 * int x = 5;  // 이진수로 표현하면 0000 0101
                 * x <<= 2;   // 왼쪽으로 2 비트 시프트: 0001 0100 (결과: 20)
                 */
                a <<= 1;
            }
            newArr = new int[a];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            return newArr;
        }
    }

    /**
     * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
     * 정수 배열 arr이 매개변수로 받고 arr에 최소한의 개수로 0을 추가한 배열을 return 하는 함수를 만들어주세요.
     * ( 단, 이때 함수는 static으로 정의해야합니다. )
     */
}
