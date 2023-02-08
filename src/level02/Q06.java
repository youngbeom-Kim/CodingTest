package level02;

import java.util.Arrays;

//프로그래머스 > level02 > 최솟값 만들기
public class Q06 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            int a = A[i];
            int b = B[B.length - i - 1];
            answer += a * b;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q06 sol = new Q06();

        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(sol.solution(A, B));

        int[] A2 = {1, 2};
        int[] B2 = {3, 4};
        System.out.println(sol.solution(A2, B2));

    }
}
