package codingTest;

public class PCCP_3_01 {
    public int solution (int[] bandage, int health, int[][] attacks) {
        int answer = 0;

        int time = attacks[attacks.length - 1][0];

        int max = health;
        int cnt = 0;
        int cast = 1;

        for (int i = 1; i <= time; i++) {
            if (i == attacks[cnt][0]) {
                health -= attacks[cnt][1];
                cnt++;
                cast = 1;
            } else if (cast == bandage[0]) {
                health += bandage[2] + bandage[1];
                cast = 1;
            } else {
                health += bandage[1];
                cast++;
            }

            if (health > max) {
                health = max;
            }
        }

        if (health <= 0) {
            return -1;
        }

        answer = health;

        return answer;
    }
    public static void main(String[] args) {

        PCCP_3_01 sol = new PCCP_3_01();

        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        System.out.println(sol.solution(bandage, health, attacks));

        int[] bandage2 = {3, 2, 7};
        int health2 = 20;
        int[][] attacks2 = {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(sol.solution(bandage2, health2, attacks2));

        int[] bandage3 = {4, 2, 7};
        int health3 = 20;
        int[][] attacks3 = {{1, 15}, {5, 16}, {8, 6}};
        System.out.println(sol.solution(bandage3, health3, attacks3));

        int[] bandage4 = {1, 1, 1};
        int health4 = 5;
        int[][] attacks4 = {{1, 2}, {3, 2}};
        System.out.println(sol.solution(bandage4, health4, attacks4));

    }
}
