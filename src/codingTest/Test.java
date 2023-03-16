package codingTest;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
    public int solution(int K, String[] user_scores) {
        int answer = 0;

        HashMap<String, Integer> map = new HashMap<>();

        int[] arr = new int[K];

        for (int i = 0; i < user_scores.length; i++) {

            String user = user_scores[i].substring(0, user_scores[i].indexOf(" "));
            int score = Integer.parseInt(user_scores[i].substring(user_scores[i].indexOf(" ") + 1, user_scores[i].length()));

            map.put(user, score);
            arr[i] = score;

            if (map.size() > K) {
                for (int j = 0; j < arr.length; j++) {

                }
            }
        }


        return answer;
    }

    public int solution2(int[] dots, int[] lines) {
        int answer = 0;



        return answer;
    }

    public int[] solution3(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        int cnt = 1;

        for (int i = 0; i < N; i++) {
            map.put(cnt, coffee_times[cnt - 1]);
            cnt++;
        }

        if (N == 1) {
            for (int i = 0; i < coffee_times.length; i++) {
                answer[i] = i + 1;
            }

            return answer;
        }

        int count = 0;
        boolean stop = true;

        while (stop) {
            for (int i = 1; i <= map.size(); i++) {
                if (map.get(i) > 0) {
                    map.put(i, map.get(i) -1);
                }
                if (map.get(i) == 0) {
                    map.put(i, map.get(i) - 1);
                    if (cnt <= coffee_times.length) {
                        map.put(cnt, coffee_times[cnt - 1]);
                        cnt++;
                    }
                    answer[count] = i;
                    count++;
                }
            }
            if (answer[coffee_times.length - 1] != 0) {
                stop = false;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Test sol = new Test();

        //1
        int K = 3;
        String[] user_score = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        //System.out.println(sol.solution(K, user_score));

        int K2 = 3;
        String[] user_score2 = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"};
        //System.out.println(sol.solution(K2, user_score2));

        int K3 = 2;
        String[] user_score3 = {"cheries2 200", "alex111 100", "coco 150", "puyo 120"};
        //System.out.println(sol.solution(K3, user_score3));

        //2
        int[] dots = {1, 5, 8};
        int[] lines = {1, 3, 4, 6};
        System.out.println(sol.solution2(dots, lines));

        int[] dots2 = {1, 3, 4, 6, 7, 10};
        int[] lines2 = {2, 2, 2, 2};
        System.out.println(sol.solution2(dots2, lines2));

        //3
        int N = 3;
        int[] coffee_times = {4, 2, 2, 5, 3};
        System.out.println(Arrays.toString(sol.solution3(N, coffee_times)));

        int N2 = 1;
        int[] coffee_times2 = {100, 1, 50, 1, 1};
        System.out.println(Arrays.toString(sol.solution3(N2, coffee_times2)));

    }
}
