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
        for (int i = 0; i < word2.length(); i++) {
            word2 = word2.replace("..", ".");
        }
        //정규표현식 > \\. 마침표 , {2,} 2회이상
        //word2 = word2.replaceAll("\\.{2,}", ".");


        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        //정규표현식 > ^ 첫번째 문자 , $ 맨뒤에 문자
        word2 = word2.replaceAll("^[.]|[.]$" , "");


        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (word2.equals("")) {
            for (int i = 0; i < new_id.length(); i++) {
                word2 += "a";
            }
        }

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (word2.length() >= 16) {
            word2.substring(0, 15);
        }
        word2 = word2.replaceAll("[.]$", "");


        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (word2.length() < 3) {
            char c = word2.charAt(word2.length() - 1);
            for (int i = 0; i < word2.length(); i++) {
                if (word2.length() == 3) {
                    break;
                }
                word2 += c;
            }
        }


        return word2;
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
