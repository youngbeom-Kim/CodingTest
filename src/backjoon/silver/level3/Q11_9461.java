package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 파도반 수
public class Q11_9461 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {

            int N = in.nextInt();

            int[] answer = new int[N + 5];
            answer[0] = 1;
            answer[1] = 1;
            answer[2] = 1;
            answer[3] = 2;
            answer[4] = 2;

            for (int i = 5; i < N; i++) {
                answer[i] = answer[i - 1] + answer[i - 5];
            }

            System.out.println(answer[N - 1]);
        }
    }
}
