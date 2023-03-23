package level01;

//프로그래머스 > Level 01 > 둘만의 암호
public class Q58 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < skip.length(); i++) {
            char c = skip.charAt(i);
            alpha = alpha.replace(String.valueOf(alpha.charAt((alpha.indexOf(c)))), "");
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alpha.indexOf(c) + index > alpha.length() - 1) {
                c = (char) alpha.charAt(alpha.indexOf(c) + index - alpha.length());
            } else {
                c = (char) alpha.charAt(alpha.indexOf(c) + index);
            }
            answer += c;
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
