package codingTest;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

//외톨이 알파벳
public class PCCP_1_01 {
    public String solution(String input_string) {
        String answer = "";

        String[] arr = input_string.split("");

        HashMap<String, Boolean> map = new HashMap<>();

        Set<String> set = new TreeSet<>();

        String temp = "";

        for (String s : arr) {
            if (!temp.equals(s)) {
                if (map.containsKey(s)) {
                    set.add(s);
                }
                map.put(s, true);
            }
            temp = s;
        }

        if (set.isEmpty()) {
            return "N";
        }

        for (String s : set) {
            answer += s;
        }

        return answer;
    }
    public static void main(String[] args) {

        PCCP_1_01 sol = new PCCP_1_01();

        String input_string = "edeaaabbccd";
        System.out.println(sol.solution(input_string));

        String input_string2 = "eeddee";
        System.out.println(sol.solution(input_string2));

        String input_string3 = "string";
        System.out.println(sol.solution(input_string3));

        String input_string4 = "zbzbz";
        System.out.println(sol.solution(input_string4));

    }
}
