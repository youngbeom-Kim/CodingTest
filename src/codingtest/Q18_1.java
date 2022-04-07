package codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//프로그래머스 > 로또의 최고 순위와 최저 순위
public class Q18_1 {
    public int[] solution(int[] lottos, int[] win_nums) {

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        int zeroCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }

        int sameCount = 0;
        for (int winNum : win_nums) {
            if (map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (zeroCount + sameCount);
        int minRank = 7 - sameCount;
        if (maxRank > 6) maxRank = 6;
        if (minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }

    public static void main(String[] args) {

        Q18_1 sol = new Q18_1();

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

