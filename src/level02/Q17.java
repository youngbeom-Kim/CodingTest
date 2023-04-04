package level02;

import java.util.*;

//프로그래머스 > Level 02 > 기능 개발
public class Q17 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] temp = new int[100];
        int day = 0;

        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (speeds[i] * day) < 100) {
                day++;
            }
            temp[day]++;
        }

        int count = 0;

        for (int n : temp) {
            if (n != 0) {
                count++;
            }
        }

        int[] answer = new int[count];

        count = 0;
        for (int n : temp) {
            if (n != 0) {
                answer[count++]  = n;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q17 sol = new Q17();

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(sol.solution(progresses, speeds)));

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(sol.solution(progresses2, speeds2)));

    }
}
