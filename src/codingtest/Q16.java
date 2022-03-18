package codingtest;

import java.util.HashMap;

//프로그래머스 > 실패율
public class Q16 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        HashMap<Integer, Integer> map = new HashMap<>();

        int failed = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i + 1 == stages[j]) {
                    count++;
                }
            }
            failed = count/stages.length;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q16 sol = new Q16();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(sol.solution(N, stages));

        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(sol.solution(N2, stages2));

    }
}
