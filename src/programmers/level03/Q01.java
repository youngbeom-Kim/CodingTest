package programmers.level03;

//프로그래머스 > Level 03 > 가장 긴 펠린드롬
public class Q01 {
    private int solution(String s) {

        //펠린드롬 문자열 길이
        for (int i = s.length(); i > 0; i--) {
            //펠린드롬 문자 비교 시작점
            for (int j = 0; i + j <= s.length(); j++) {
                boolean check = true;
                for (int k = 0; k < i / 2; k++) {
                    if (s.charAt(j + k) != s.charAt(i + j - k - 1)) {
                        check = false;
                        break;
                    }
                }
                if (check) return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

        Q01 sol = new Q01();

        String s = "abcdcba";
        System.out.println(sol.solution(s));

        String s1 = "abacde";
        System.out.println(sol.solution(s1));

        String s2 = "dcabacebd";
        System.out.println(sol.solution(s2));

    }
}
