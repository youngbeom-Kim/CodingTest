package level02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//프로그래머스 > Level 02 > H-Index
public class Q23 {
    public int solution(int[] citations) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < citations.length; i++) {
            list.add(citations[i]);
        }

        list.sort(Comparator.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == i + 1) {
                answer = i + 1;
                break;
            }
            if (list.get(i) < i + 1) {
                answer = i;
                break;
            }
        }

        if (answer == 0 && citations[0] > 0) {
            answer = citations.length;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q23 sol = new Q23();

        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(sol.solution(citations));

        int[] citations2 = {3, 4, 5, 11, 15, 16, 17, 18, 19, 20};
        System.out.println(sol.solution(citations2));

        int[] citations3 = {10, 10, 10, 10, 10};
        System.out.println(sol.solution(citations3));

        int[] citations4 = {0, 0, 0, 0, 0};
        System.out.println(sol.solution(citations4));

    }
}
