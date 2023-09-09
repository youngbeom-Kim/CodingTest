package programmers.level01;

import java.util.Arrays;

//프로그래머스 > programmers.level01 > K번째 수
public class Q02 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int[] exam = new int[commands[i][1] - commands[i][0] + 1];

            int a = commands[i][0] - 1;
            for (int j = commands[i][1] - commands[i][0]; j >= 0; j--) {
                exam[j] += array[a];
                a++;
            }
            Arrays.sort(exam);

            answer[i] = exam[commands[i][2] - 1];

        }

        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Q02 sol = new Q02();
        System.out.println(Arrays.toString(sol.solution(array, commands)));

    }
}
