package level01;

import java.util.Arrays;

//프로그래머스 > Level 01 > 자연수뒤집어배열
public class Q31 {
    public int[] solution(long n) {

        //String + int를 할 경우 String으로 인식
        String s = "" + n;
        int[] answer = new int[s.length()];

        int cnt = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 48;
            answer[cnt] = num;
            cnt--;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q31 sol = new Q31();

        int N = 12345;
        System.out.println(Arrays.toString(sol.solution(N)));

        int N2 = 987;
        System.out.println(Arrays.toString(sol.solution(N2)));

    }
}
