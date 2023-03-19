package level01;

//프로그래머스 > Level 01 > 둘만의 암호
public class Q58 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            for (int j = 0; j < skip.length(); j++) {
                char skipChar = skip.charAt(j);
                if (sChar + index - skipChar >= 0) {
                    sChar = (char) (sChar + 1);
                }
                if (sChar + index > 'z') {
                    sChar = (char) (sChar + index - 26);
                    if (sChar - skipChar <= 0) {
                        sChar = (char) (sChar + 1);
                    }
                }
            }


            sChar = (char) (sChar + index);

            answer += sChar;

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
