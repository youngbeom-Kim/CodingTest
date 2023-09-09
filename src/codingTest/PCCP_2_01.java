package codingTest;

import java.util.Arrays;

//실습용 로봇
public class PCCP_2_01 {
    public int[] solution(String command) {
        int[] answer = {0, 0};

        char[] arr = command.toCharArray();

        int[] dir = {1, 1, -1, -1};
        int cnt = 0;
        int xy = 1;

        for (int i = 0; i < arr.length; i++) {
            if (cnt < 0) {
                cnt = 3;
            } else if (cnt > 3) {
                cnt = 0;
            }

            if (cnt % 2 == 0) {
                xy = 1;
            } else {
                xy = 0;
            }

            if (arr[i] == 'G') {
                answer[xy] += dir[cnt];
            } else if (arr[i] == 'B') {
                answer[xy] -= dir[cnt];
            } else if (arr[i] == 'R') {
                cnt++;
            } else if (arr[i] == 'L') {
                cnt--;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        PCCP_2_01 sol = new PCCP_2_01();

        String command = "GRGLGRG";
        System.out.println(Arrays.toString(sol.solution(command)));

        String command2 = "GRGRGRB";
        System.out.println(Arrays.toString(sol.solution(command2)));

    }
}
