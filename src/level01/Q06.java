package level01;

//프로그래머스 > level01 > 문자열을 정수로 바꾸기
public class Q06 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        Q06 sol = new Q06();

        String s = "1234";
        System.out.println(sol.solution(s));

        String s2 = "-1234";
        System.out.println(sol.solution(s2));

    }
}
