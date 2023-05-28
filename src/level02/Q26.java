package level02;

import java.util.Arrays;

//프로그래머스 > Level 02 > 주식 가격
public class Q26 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int cnt = 0;
            for (int j = i + 1; j < prices.length; j++) {
                cnt++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q26 sol = new Q26();

        int[] prices = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(sol.solution(prices)));

    }
}
