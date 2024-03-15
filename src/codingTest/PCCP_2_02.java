package codingTest;

import java.util.PriorityQueue;

public class PCCP_2_02 {
    public int solution(int[] ability, int number) {
        int answer = 0;


        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < ability.length; i++) {
            queue.add(ability[i]);
        }

        while(number-- > 0) {
            int a = queue.poll();
            int b = queue.poll();
            queue.add(a + b);
            queue.add(a + b);
        }

        for (int num : queue) {
            answer += num;
        }

        return answer;
    }
}

