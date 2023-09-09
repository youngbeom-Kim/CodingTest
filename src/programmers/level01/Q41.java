package programmers.level01;

//프로그래머스 > Level01 > 문자열 다루기 기본
public class Q41 {
    public boolean solution(String s) {
        boolean answer = true;

        char[] cArr = s.toCharArray();

        if (cArr.length > 6 || cArr.length < 4 || cArr.length == 5) {
            return answer = false;
        }

        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] < 48 || cArr[i] > 57) {
                answer = false;
            } else {
                continue;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q41 sol = new Q41();

        String s = "a234";
        System.out.println(sol.solution(s));

        String s2 = "1234";
        System.out.println(sol.solution(s2));

    }
}
