package codingtest;

//프로그래머스 > 신고 결과 받기
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Q24 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        String[] deReport = Arrays.stream(report).distinct().toArray(String[]::new);

        //신고자와 피신고자를 담을 해쉬맵생성
        HashMap<String, Integer> reporter = new HashMap<>();
        HashMap<String, Integer> beReport = new HashMap<>();

        //해쉬맵에 기본값 추가
        for (String id : id_list) {
            reporter.put(id, 0);
            beReport.put(id, 0);
        }

        String person1 = "";
        String person2 = "";

        HashMap<String, String> reported = new HashMap<>();

        for (int i = 0; i < deReport.length; i++) {
            person1 = report[i].substring(0, report[i].indexOf(" "));
            person2 = report[i].substring((report[i].indexOf(" ") + 1), report[i].length());
            reported.put(person1, person2);
        }

        for (int i = 0; i < reported.size(); i++) {

        }

        System.out.println(reporter);
        System.out.println(beReport);

        return answer;
    }

    public static void main(String[] args) {

        Q24 sol = new Q24();

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
