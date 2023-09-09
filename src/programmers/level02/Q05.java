package programmers.level02;

//프로그래머스 > programmers.level02 > 이진 변환 반복하기
public class Q05 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        String num = "";
        int conv = 0;
        int count = 0;


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                num += c;
            } else {
                count++;
            }
            if (i == s.length() - 1) {
                conv++;
                s = Integer.toBinaryString(num.length());
                if (num.equals("1")) {
                    break;
                }
                num = "";
                i = -1;
            }
        }

        answer[0] = conv;
        answer[1] = count;

        return answer;
    }

    public static void main(String[] args) {

        Q05 sol = new Q05();

        String s = "110010101001";
        System.out.println(sol.solution(s));

        String s1 = "01110";
        System.out.println(sol.solution(s1));

        String s2 = "1111111";
        System.out.println(sol.solution(s2));

    }
}
