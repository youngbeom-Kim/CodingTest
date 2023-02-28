package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//프로그래머스 > Level1 > 문자열 내림차순으로 배치하기
public class Q40 {
    public String reverseStr(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    public String solution(String s) {
        String answer = "";

        List<String> List = new ArrayList<>();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - count);
            String cs = Character.toString(c);
            List.add(cs);
            count++;
        }

        Collections.sort(List, Collections.reverseOrder());

        for (String as : List) {
            answer += as;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q40 sol = new Q40();

        String s = "Zbcdefg";
//      System.out.println(sol.solution(s));
        System.out.println(sol.reverseStr(s));

        String s2 = "ZbcdWRWWefag";
//      System.out.println(sol.solution(s2));
        System.out.println(sol.reverseStr(s2));

    }
}
