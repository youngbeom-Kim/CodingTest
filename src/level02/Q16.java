package level02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//프로그래머스 > Level 02 > 위장
public class Q16 {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < clothes.length; i++) {
            if (!map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1], 1);
            } else {
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }

            if (!list.contains(clothes[i][1])) {
                list.add(clothes[i][1]);
            }
        }

        for (int i = 0; i < map.size(); i++) {
            answer *= (1 + map.get(list.get(i)));
        }

        return answer - 1;
    }

    public static void main(String[] args) {

        Q16 sol = new Q16();

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(sol.solution(clothes));

        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(sol.solution(clothes2));

    }
}
