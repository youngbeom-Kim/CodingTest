package level02;

import java.util.*;

//프로그래머스 > Level02 > 오픈채팅방
public class Q02 {
    public String[] solution(String[] record) {
        String[] answer = {};

        //uid
        Map<String, String> id = new HashMap<>();

        for (String str : record) {
            String[] ss = str.split(" ");
            if ("Leave".equals(ss[0])) continue;
            id.put(ss[1], ss[2]);
        }

        List<String> result = new ArrayList<>();

        for(String str : record) {
            String[] ss = str.split(" ");

            if ("Enter".equals(ss[0])) {
                result.add(id.get(ss[1]) + "님이 들어왔습니다.");
            } else if ("Leave".equals(ss[0])) {
                result.add(id.get(ss[1]) + "님이 나갔습니다.");
            }
        }

        answer = new String[result.size()];
        answer = result.toArray(answer);

        return answer;
    }

    public static void main(String[] args) {

        Q02 sol = new Q02();

        String[] record = {"Enter uid1234 Muzi",
                        "Enter uid4567 Prodo",
                        "Leave uid1234",
                        "Enter uid1234 Prodo",
                        "Change uid4567 Ryan"};
        System.out.println(Arrays.toString(sol.solution(record)));

    }
}
