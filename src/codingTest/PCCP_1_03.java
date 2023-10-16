package codingTest;

import java.util.Arrays;

//프로그래머스 > PCCP 모의고사 1회 3번 > 유전 법칙
public class PCCP_1_03 {

    public String[] solution(int[][] queries) {
        String[] answer = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            answer[i] = queries[i][0] == 1 ? "Rr" : recur(queries[i][0], queries[i][1]);
        }

        return answer;
    }

    private String recur(int n, int p) {

        int cnt = (int) Math.pow(4, n - 1);

        if (p <= cnt / 4) return "RR";
        if (p > cnt / 4 * 3) return "rr";
        if (n == 2) return "Rr";
        if (p > cnt / 4 && p <= cnt / 2) return recur(n - 1, p - cnt / 4);
        return recur(n - 1, p - cnt / 2);
    }

    public static void main(String[] args) {

        PCCP_1_03 sol = new PCCP_1_03();

        int[][] queries = {{3, 5}};
        System.out.println(Arrays.toString(sol.solution(queries)));

        int[][] queries2 = {{3, 8}, {2, 2}};
        System.out.println(Arrays.toString(sol.solution(queries2)));

        int[][] queries3 = {{3, 5}, {2, 3}, {3, 9}};
        System.out.println(Arrays.toString(sol.solution(queries3)));

        int[][] queries4 = {{4, 26}};
        System.out.println(Arrays.toString(sol.solution(queries4)));

    }
}
