package codingtest;

//프로그래머스 > 신규 아이디 추천
public class Q17 {
    public String solution(String new_id) {
        String answer = "";
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
