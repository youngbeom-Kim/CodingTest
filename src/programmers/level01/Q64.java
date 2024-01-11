package programmers.level01;

import java.util.HashMap;

public class Q64 {
    public static int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;

        HashMap<Integer, Integer> map = new HashMap<>();

        int cnt = 1;

        for (int i = 0; i < attacks.length; i++) {
            map.put(attacks[i][0], attacks[i][1]);
        }

        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            if (map.containsKey(i)) {
                answer -= map.get(i);
                cnt = 1;
            } else {
                if (health < answer) {
                    answer = health;
                }
                if (health > answer) {
                    if (bandage[0] == cnt) {
                        answer += bandage[1] + bandage[2];
                        cnt = 1;
                    } else {
                        answer += bandage[1];
                        cnt++;
                    }
                }
            }

            if (answer <= 0) {
                return -1;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(Q64.solution(bandage, health, attacks));

        int[] bandage2 = {3, 2, 7};
        int health2 = 20;
        int[][] attacks2 = {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(Q64.solution(bandage2, health2, attacks2));

        int[] bandage3 = {4, 2, 7};
        int health3 = 20;
        int[][] attacks3 = {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(Q64.solution(bandage3, health3, attacks3));

        int[] bandage4 = {1, 1, 1};
        int health4 = 5;
        int[][] attacks4 = {{1, 2}, {3, 2}};
        System.out.println(Q64.solution(bandage4, health4, attacks4));
    }
}
