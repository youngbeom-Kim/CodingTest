package programmers.level01;

//프로그래머스 > programmers.level01 > 신규 아이디 추천
public class Q16 {
    public String solution2(String new_id) {

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

    public String solution(String new_id) {

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        String word = new_id.toLowerCase();

        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        String s = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 97 && c <= 122 || c >= 48 && c <= 57 || c == '-' || c == '_' || c == '.') {
                s += c;
            }
        }

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        for (int i = 0; i < s.length(); i++) {
            s = s.replace("..", ".");
        }
        //정규표현식 > \\. 마침표 , {2,} 2회이상
        //word2 = word2.replaceAll("\\.{2,}", ".");


        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        //정규표현식 > ^ 첫번째 문자 , $ 맨뒤에 문자
        s = s.replaceAll("^[.]|[.]$" , "");


        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (s.equals("")) {
            for (int i = 0; i < new_id.length(); i++) {
                s += "a";
            }
        }

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (s.length() >= 16) {
            s = s.substring(0, 15);
            s = s.replaceAll("[.]$", "");
        }


        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (s.length() <= 2) {
            while (s.length() < 3) {
                s += s.charAt(s.length() - 1);
            }
        }


        return s;
    }

    public static void main(String[] args) {

        Q16 sol = new Q16();

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
