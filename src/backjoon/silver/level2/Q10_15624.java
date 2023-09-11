package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 피보나치 수 7
public class Q10_15624 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        int[] fibo = new int[1000001];
        fibo[1] = 1;

        for (int i = 2; i <= cnt; i++) {
            fibo[i] = (fibo[i - 2] + fibo[i - 1]) % 1000000007;
        }

        System.out.println(fibo[cnt]);

    }
}
