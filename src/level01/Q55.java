package level01;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q55 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        /*
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {

            list.add(score[i]);

            Collections.sort(list, Collections.reverseOrder());

            if (list.size() < k) {
                answer[i] = score[0];
            } else {
                answer[i] = list.get(k - 1);
            }

        }
        */

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if (queue.size() > k) {
                queue.poll();
            }
            answer[i] = queue.peek();
        }

        return answer;
    }

    public static void main(String[] args) {

        Q55 sol = new Q55();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(sol.solution(k, score)));

        int k2 = 4;
        int[] score2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(sol.solution(k2, score2)));

        int k3 = 1;
        int[] score3 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(sol.solution(k3, score3)));

    }
}
