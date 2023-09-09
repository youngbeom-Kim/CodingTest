package programmers.level01;

import java.util.HashMap;
import java.util.Map;

//프로그래머스 > Level 01 > 문자열 내 p와 y의 개수
public class Q32 {

    boolean solution2(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

    boolean solution(String s) {
        boolean answer = false;

        Map<String, Integer> map = new HashMap<>();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String cs = Character.toString(c);
            if ((cs.equals("p") || cs.equals("y")) && map.get(cs) == null) {
                map.put(Character.toString(c) , 1);
            } else if (cs.equals("p") || cs.equals("y")) {
                map.put(cs , map.get(cs) + 1);
            }
        }

        if (map.get("p") == map.get("y")) {
            return answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q32 sol = new Q32();

        String s = "pPoooyY";
        System.out.println(sol.solution(s));

        String s2 = "Pyy";
        System.out.println(sol.solution(s2));

    }
}
