package codingtest;

import java.util.Locale;

//프로그래머스 > 신규 아이디 추천
public class Q17_1 {
    public String solution(String new_id) {

        //1단계
        String temp = new_id.toLowerCase();

        //2단계
        temp = temp.replaceAll("[^-_.a-z0-9]", "");

        //3단계
        temp = temp.replaceAll("[.]{2,}", ".");

        //4단계
        temp = temp.replaceAll("^[.]|[.]$", "");

        //5단계
        if (temp.equals("")) temp += "a";

        //6단계
        if (temp.length() >= 16) {
            temp = temp.substring(0, 15);
            temp = temp.replaceAll("^[.]|[.]$", "");
        }

        //7단계
        if (temp.length() <= 2) {
            while (temp.length() < 3) {
                temp += temp.charAt(temp.length() - 1);
            }
        }

        return temp;
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
