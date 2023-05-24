package level02;

import java.util.*;
import java.util.stream.Collectors;

//프로그래머스 > Level 02 > 타겟 넘버
public class Q25 {
    public int solution2(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> queue = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));

        while (queue.peek() < K && queue.size() > 1) {
            int sum = 0;
            sum = queue.poll() + (queue.poll() * 2);
            queue.add(sum);
            answer++;
        }

        if (queue.peek() < K) {
            return -1;
        }

        return answer;
    }

    //런타임 에러
    public int solution(int[] scoville, int K) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        Arrays.sort(scoville);

        for (int i = 0; i < scoville.length; i++) {
            list.add(scoville[i]);
        }

        while (list.get(0) < K) {

            if (list.get(0) < K) {
                int sum = list.get(0) + (list.get(1) * 2);
                list.add(sum);
                int count = 0;
                while (list.get(0) < K && count < 2) {
                    list.remove(0);
                    count++;
                }
                count = 0;
                answer++;
            }

            Collections.sort(list);

        }

        return answer;
    }
    public static void main(String[] args) {

        Q25 sol = new Q25();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(sol.solution2(scoville, K));

    }
}
