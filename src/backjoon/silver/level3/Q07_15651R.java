package backjoon.silver.level3;

import java.util.Scanner;

public class Q07_15651R {

    static int[] arr;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        dfs(0);

        System.out.println(sb);

    }

    private static void dfs(int depth) {

        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i] + " ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            arr[depth] = i;
            dfs(depth + 1);
        }

    }
}
