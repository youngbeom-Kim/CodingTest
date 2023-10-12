package codingTest;

import java.util.Arrays;

//프로그래머스 > PCCP 모의고사 1회 3번 > 유전 법칙
public class PCCP_1_03 {

    static String[] pea;
    public String[] solution(int[][] queries) {
        String[] answer = new String[queries.length];

        pea = new String[]{"RR", "Rr", "rr", "RR", "Rr", "rr"};
        int[] cnt = {5, 2, 1, 1, 2, 5};

        for (int i = 0; i < queries.length; i++) {
            answer[i] = data(queries[i], cnt);
        }

        return answer;
    }

    private String data(int[] gene, int[] cnt) {

        if (gene[0] > 2) {
            for (int i = 0; i < cnt.length; i++) {
                gene[1] -= cnt[i] * (int) Math.pow(4, gene[0] - 3);
                if (gene[1] <= 0) {
                    return pea[i];
                }
            }
        }

        if (gene[0] == 1) {
            return "Rr";
        } else if (gene[0] == 2) {
            if (gene[1] == 1) {
                return pea[0];
            } else if (gene[1] == 4) {
                return pea[2];
            } else {
                return pea[1];
            }
        }

        return null;
    }

    public static void main(String[] args) {

        PCCP_1_03 sol = new PCCP_1_03();

        int[][] queries = {{3, 5}};
        //System.out.println(Arrays.toString(sol.solution(queries)));

        int[][] queries2 = {{3, 8}, {2, 2}};
        //System.out.println(Arrays.toString(sol.solution(queries2)));

        int[][] queries3 = {{3, 5}, {2, 3}, {3, 9}};
        System.out.println(Arrays.toString(sol.solution(queries3)));

        int[][] queries4 = {{4, 26}};
        //System.out.println(Arrays.toString(sol.solution(queries4)));

    }
}
