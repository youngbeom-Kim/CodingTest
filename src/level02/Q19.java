package level02;

import java.util.Arrays;

//프로그래머스 > Level 02 > n^2 배열 자르기
public class Q19 {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};

        int[] temp = new int[n*n];

        temp[0] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = i * n; j < (i + 1) * n; j++) {
                temp[j] = i + 1;
            }
            for (int j = i + 1; j < (i + 1) * (n - 1); j *= (i + 1)) {
                temp[j] = i + 1;
            }
        }

        System.out.println(Arrays.toString(temp));

        return answer;
    }
    public static void main(String[] args) {

        Q19 sol = new Q19();

        int n = 3;
        long left = 2;
        long right = 5;
        System.out.println(Arrays.toString(sol.solution(n, left, right)));

        int n2 = 4;
        long left2 = 7;
        long right2 = 14;
        System.out.println(Arrays.toString(sol.solution(n2, left2, right2)));

    }
}
