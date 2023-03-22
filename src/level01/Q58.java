package level01;

//프로그래머스 > Level 01 > 둘만의 암호
public class Q58 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < skip.length(); i++) {
            for (int j = 0; j < alpha.length(); j++) {
                if (skip.charAt(i) == alpha.charAt(j)) {
                    alpha = alpha.replace(String.valueOf(alpha.charAt(j)), String.valueOf(""));
                    break;
                }
            }
        }

        System.out.println(alpha);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(alpha.indexOf(c));

        }

        return answer;
    }

    public static void main(String[] args) {

        Q58 sol = new Q58();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(sol.solution(s, skip, index));

    }
}
