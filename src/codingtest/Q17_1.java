package codingtest;

import java.util.Locale;

//프로그래머스 > 신규 아이디 추천
public class Q17_1 {
    public String solution(String new_id) {

        String answer = "";

        //1단계
        String temp = new_id.toLowerCase();

        //2단계
        temp = temp.replaceAll("[^-_.a-z0-9]", "");

        return answer;
    }

    public static void main(String[] args) {

        Q17_1 sol = new Q17_1();

        String new_id = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(sol.solution(new_id));

        new_id = "z-+.^.";
        System.out.println(sol.solution(new_id));

        new_id = "=.=";
        System.out.println(sol.solution(new_id));

        new_id = "123_.def";
        System.out.println(sol.solution(new_id));

        new_id = "abcdefghijklmn.p";
        System.out.println(sol.solution(new_id));
    }
}
