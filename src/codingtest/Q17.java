package codingtest;

import java.util.Locale;

//프로그래머스 > 신규 아이디 추천
public class Q17 {
    public String solution(String new_id) {
        String answer = "";

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String word1 = new_id.toLowerCase();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String word2 = "";

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            if (c >= 97 && c <= 122 || c >= 48 && c <= 57 || c == '-' || c == '_' || c == '.') {
                word2 += c;
            }
        }

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.


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
