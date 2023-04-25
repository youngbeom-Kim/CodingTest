package level02;

import java.util.HashMap;
import java.util.Map;

//프로그래머스 > Level 2 > 할인 행사
public class Q24 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        //원하는 상품 맵에 담기
        Map<String, Integer> wMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            wMap.put(want[i], number[i]);
        }

        //비교하기
        for (int i = 0; i < discount.length; i++) {

            //할인 상품이 원하는 상품에 없다면 제외
            int check = 0;
            for (int j = 0; j < want.length; j++) {
                if (discount[i].equals(want[j])) {
                    check++;
                    break;
                }
            }


            //할인 상품에 원하는 상품이 있다면 for문 실행
            if (check != 0) {

                Map<String, Integer> map = new HashMap<>();

                for (int j = 0; j < 10; j++) {
                    if (map.get(discount[i + j]) == null) {
                        map.put(discount[i + j], 1);
                    } else {
                        map.put(discount[i + j], map.get(discount[i + j]) + 1);
                    }

                    if (map.get(discount[i + j]) > wMap.get(discount[i + j])) {
                        break;
                    }

                }

                int result = 0;

                for (int j = 0; j < want.length; j++) {
                    if (wMap.get(want[j]) == map.get(want[j])) {
                        result++;
                    }
                }

                if (result == want.length) {
                    answer = i + 1;
                    break;
                }

            }

        }

        return answer;
    }
    public static void main(String[] args) {

        Q24 sol = new Q24();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(sol.solution(want, number, discount));

        String[] want2 = {"apple"};
        int[] number2 = {10};
        String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        System.out.println(sol.solution(want2, number2, discount2));

    }
}
