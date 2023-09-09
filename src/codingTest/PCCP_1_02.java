package codingTest;

//체육 대회 (dfs, 순열 조합) - 보류
public class PCCP_1_02 {
    public int solution(int[][] ability) {

        int answer = 0;

        for (int i = 0; i < ability.length; i++) {
            permutation(0, ability);
        }

        return answer;
    }

    private void permutation(int depth, int[][] ability) {



    }

    public static void main(String[] args) {

        PCCP_1_02 sol = new PCCP_1_02();

        int[][] ability = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};
        System.out.println(sol.solution(ability));

        int[][] ability2 = {{20, 30}, {30, 20}, {20, 30}};
        System.out.println(sol.solution(ability2));

    }

}
