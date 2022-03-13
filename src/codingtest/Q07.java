package codingtest;

//프로그래머스 > 문자열을 정수로 바꾸기
public class Q07 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        Q07 sol = new Q07();

        String s = "1234";
        System.out.println(sol.solution(s));

        String s2 = "-1234";
        System.out.println(sol.solution(s2));

    }
}
