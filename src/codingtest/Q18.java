package codingtest;

import java.util.Arrays;

//프로그래머스 > 로또의 최고 순위와 최저 순위
public class Q18 {
    public int[] solution(int[] lottos, int[] win_nums) {

        int count = 0;
        int zero = 0;

        int[] answer = new int[2];

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
        }

        int best = zero + count;

        if (best == 6) {
            answer[0] = 1;
        } else if (best == 5) {
            answer[0] = 2;
        } else if (best == 4) {
            answer[0] = 3;
        } else if (best == 3) {
            answer[0] = 4;
        } else if (best == 2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }

        if (count == 6) {
            answer[1] = 1;
        } else if (count == 5) {
            answer[1] = 2;
        } else if (count == 4) {
            answer[1] = 3;
        } else if (count == 3) {
            answer[1] = 4;
        } else if (count == 2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q18 sol = new Q18();

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(sol.solution(lottos, win_nums)));

        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_nums2 = {38, 19, 20, 40, 15, 25};
        System.out.println(Arrays.toString(sol.solution(lottos2, win_nums2)));

        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_nums3 = {20, 9, 3, 45, 4, 35};
        System.out.println(Arrays.toString(sol.solution(lottos3, win_nums3)));

    }
}
