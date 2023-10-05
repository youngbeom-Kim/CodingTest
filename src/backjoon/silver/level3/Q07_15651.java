package backjoon.silver.level3;

import java.util.Scanner;

public class Q07_15651 {

    static int[] arr;
    static int N, M;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        dfs(0, 0);

    }

    private static void dfs(int a, int depth) {

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

    }
}
