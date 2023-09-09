package programmers.level01;

import java.util.HashMap;

//프로그래머스 > programmers.level01 > 완주하지 못한 선수
public class Q01 {

    public String solution(String[] participant, String[] completion) {

        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
                break;
            }
        }


        return answer;

    }

    public static void main(String[] args) {

        Q01 sol = new Q01();

        //ex1
        String[] part = {"leo", "kiki", "eden"};
        String[] com = {"eden", "kiki"};
        System.out.println(sol.solution(part, com));

        //ex2
        String[] part2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] com2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(sol.solution(part2, com2));

        //ex3
        String[] part3 = {"mislav", "stanko", "misalv", "ana"};
        String[] com3 = {"stanko", "ana", "mislav"};
        System.out.println(sol.solution(part3, com3));



    }
}


