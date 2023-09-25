package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 계단오르기 (2579번)
public class Q03_2579 {
    static int cnt;
    static int[] stair;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        stair = new int[N + 1];
        stair[0] = 0;

        for (int i = 1; i <= N; i++) {
            stair[i] = in.nextInt();
        }

        System.out.println(recur(0, 0));

    }

    private static int recur(int i, int check) {


        return stair[0];
    }
}
