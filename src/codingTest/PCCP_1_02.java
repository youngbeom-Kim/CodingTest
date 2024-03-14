package codingTest;

//체육 대회 (dfs, 순열 조합) - 보류
public class PCCP_1_02 {
    private static int answer;
    public int solution(int[][] ability) {

        answer = 0;

        permutation(0, new boolean[ability.length], ability, 0);

        return answer;
    }

    private void permutation(int score, boolean[] check, int[][] ability, int depth) {
        if (depth == ability[0].length) {
            answer = Math.max(score, answer);

            return;
        }

        for (int i = 0; i < ability.length; i++) {
            if (!check[i]) {
                check[i] = true;
                permutation(score + ability[i][depth], check, ability, depth + 1);
                check[i] = false;
            }
        }

    }

    public static void main(String[] args) {

        PCCP_1_02 sol = new PCCP_1_02();

        int[][] ability = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};
        System.out.println(sol.solution(ability));

        int[][] ability2 = {{20, 30}, {30, 20}, {20, 30}};
        System.out.println(sol.solution(ability2));

    }

}
