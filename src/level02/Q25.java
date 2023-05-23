package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//프로그래머스 > Level 02 > 타겟 넘버
public class Q25 {

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
        System.out.println(sol.solution(scoville, K));

    }
}
