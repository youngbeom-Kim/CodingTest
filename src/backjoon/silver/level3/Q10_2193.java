package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 이친수
public class Q10_2193 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long[] answer = new long[N + 1];

        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= N; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }

        System.out.println(answer[N]);
    }
}
