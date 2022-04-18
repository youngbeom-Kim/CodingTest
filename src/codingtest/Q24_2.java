package codingtest;

//프로그래머스 > 신고 결과 받기
import java.util.*;

public class Q24_2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {id_list.length};
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            index.put(id_list[i], i);
        }

        for (String re : report) {
            String[] id = re.split(" ");
            String fromId = id[0];
            String toId = id[1];
        }


        return answer;
    }

    public static void main(String[] args) {

        Q24_2 sol = new Q24_2();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(sol.solution(id_list, report, k)));

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        System.out.println(Arrays.toString(sol.solution(id_list2, report2, k2)));

    }
}
