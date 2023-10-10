package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 퇴사 (14501번)
public class Q08_14501 {
    static int N, D, max;
    static int[] term, pay, dp;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        term = new int[N];
        pay = new int[N];
        dp = new int[N];
        D = N;
        max = 0;

        for (int i = 0; i < N; i++) {
            term[i] = in.nextInt();
            pay[i] = in.nextInt();
        }

        for (int i = N; i > 0; i--) {
            dp[i - 1] = (term[i - 1] + i - 1) <= N ? pay[i - 1] : 0;
        }

        recur(N);

        System.out.println(max);
    }

    private static void recur(int date) {

        if (D == 0) {
            return;
        }

        date += term[date - 1];

        if (date <= N) {
            dp[D - 1] += dp[date - 1];
            date += term[date - 1];
        }

        max = Math.max(max, dp[D - 1]);

        D -= 1;

        recur(D);
    }
}
