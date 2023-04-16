package level02;

//프로그래머스 > Level 02 > 괄호 회전하기
public class Q21 {
    public int solution(String s) {
        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {

        Q21 sol = new Q21();

        String s = "[](){}";
        System.out.println(sol.solution(s));

        String s2 = "}]()[{";
        System.out.println(sol.solution(s2));

        String s3 = "[)(]";
        System.out.println(sol.solution(s3));

        String s4 = "}}}";
        System.out.println(sol.solution(s4));

    }
}
