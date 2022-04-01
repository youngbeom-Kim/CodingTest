package codingtest;

import java.util.Locale;

//프로그래머스 > 신규 아이디 추천
public class Q17 {
    public String solution(String new_id) {
        String answer = "";

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String word = new_id.toLowerCase();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for (int i = 0; i < word.length(); i++) {

        }

        return answer;
    }

    public static void main(String[] args) {

        Q17 sol = new Q17();

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
