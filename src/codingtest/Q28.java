package codingtest;

//프로그래머스 > 시저 암호
public class Q28 {

    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += c;
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                if (c + n > 'z') {
                    answer += (char)(c - 26 + n);
                } else {
                    answer += (char)(c + n);
                }
            }
            if (c >= 'A' && c <= 'Z') {
                if (c + n > 'Z') {
                    answer += (char)(c - 26 + n);
                } else {
                    answer += (char)(c + n);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q28 sol = new Q28();

        String s = "AB";
        int n = 1;
        System.out.println(sol.solution(s, n));

        String s1 = "z";
        int n1 = 1;
        System.out.println(sol.solution(s1, n1));

        String s2 = "a B z";
        int n2 = 4;
        System.out.println(sol.solution(s2, n2));

    }
}
