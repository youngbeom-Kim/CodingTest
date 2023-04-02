package level02;

import java.util.*;

//프로그래머스 > Level 02 > 귤 고르기
public class Q18 {
    public int solution(int k, int[] tangerine) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            if (!map.containsKey(tangerine[i])) {
                map.put(tangerine[i], 1);
            } else {
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < map.get(list.get(i)); j++) {
                tangerine[cnt] = list.get(i);
                cnt++;
            }
        }

        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count.size() == 0) {
                count.add(tangerine[i]);
            } else if (tangerine[i - 1] != tangerine[i]) {
                count.add(tangerine[i]);
            }
        }

        return count.size();
    }
    public static void main(String[] args) {

        Q18 sol = new Q18();

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(sol.solution(k, tangerine));

        int k2 = 4;
        int[] tangerine2 = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(sol.solution(k2, tangerine2));

        int k3 = 2;
        int[] tangerine3 = {1, 1, 1, 1, 2, 2, 2, 3};
        System.out.println(sol.solution(k3, tangerine3));

    }
}
