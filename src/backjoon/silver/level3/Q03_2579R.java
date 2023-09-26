package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 계단오르기 (2579번)
public class Q03_2579R {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] dp = new int[N + 1];
        int[] stair = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            stair[i] = in.nextInt();
        }

        dp[1] = stair[1];

        if (N >= 2) {
            dp[2] = stair[1] + stair[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
        }

        System.out.println(dp[N]);

    }
}
