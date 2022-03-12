package codingtest;

//프로그래머스 > 가운데 글자 가져오기
public class Q04 {
    public String solution(String s) {
        String answer = "";

        int sub = (int)(s.length() / 2);

        if (s.length() % 2 == 1) {
            answer = s.substring(sub, sub + 1);
        } else {
            answer = s.substring(sub - 1, sub + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Q04 sol = new Q04();

        String s = "abcde";
        String s2= "qwer";

        System.out.println(sol.solution(s));
        System.out.println(sol.solution(s2));

    }
}
