package programmers.level01;

import java.util.Arrays;

//프로그래머스 > programmers.level01 > 예산
public class Q11 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                budget -= d[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q11 sol = new Q11();

        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(sol.solution(d, budget));

        int[] d2 = {2, 2, 3, 3};
        budget = 10;
        System.out.println(sol.solution(d2, budget));

    }
}
