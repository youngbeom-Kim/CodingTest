package programmers.level01;

import java.util.*;

//프로그래머스 > Level01 > 실패율
public class Q54 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        HashMap<Integer, Double> map = new HashMap<>();

        int player = stages.length;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                answer[stages[i] - 1] += 1;
            }
        }

        for (int i = 1; i <= answer.length; i++) {
            if (player == 0) {
                map.put(i, 0.0);
                continue;
            }
            map.put(i, answer[i - 1] / (double) player);
            player = player - answer[i - 1];
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        Collections.sort(keySet, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        for (int i = 0; i < keySet.size(); i++) {
            answer[i] = keySet.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {

        Q54 sol = new Q54();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(sol.solution(N, stages)));

        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(sol.solution(N2, stages2)));

        int N3 = 5;
        int[] stages3 = {3, 3, 3, 3};
        System.out.println(Arrays.toString(sol.solution(N3, stages3)));

    }
}
