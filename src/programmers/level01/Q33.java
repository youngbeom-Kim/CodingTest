package programmers.level01;

import java.util.Arrays;

//프로그래머스 > level 01 > 하샤드 수
public class Q33 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

        long a = x;

        for (int i = 0; i < n; i++) {
            answer[i] = x;
            x = x + a;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q33 sol = new Q33();

        int x = 2;
        int n = 5;
        System.out.println(Arrays.toString(sol.solution(x, n)));

        int x2 = 4;
        int n2 = 3;
        System.out.println(Arrays.toString(sol.solution(x2, n2)));

        int x3 = -4;
        int n3 = 2;
        System.out.println(Arrays.toString(sol.solution(x3, n3)));

    }
}
