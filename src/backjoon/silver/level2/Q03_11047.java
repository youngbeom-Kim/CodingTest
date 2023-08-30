package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 동전 0 (11047번)
public class Q03_11047 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            int coin = in.nextInt();
            coins[i] = coin;
        }

        int sum = 0;

        while (K != 0) {
            int min = 100000000;
            int i = 0;
            for (i = 0; i < coins.length; i++) {
                int data = K / coins[i];
                if (min > data && data > 0) {
                    min = data;
                } else {
                    i--;
                    break;
                }
            }

            sum += min;
            K -= min * coins[i];
        }

        System.out.println(sum);

    }
}
