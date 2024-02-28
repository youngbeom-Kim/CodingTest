package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 모든 수열(10974번)
public class Q15_10974 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N + 1];
        boolean[] visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            visited[i] = true;
            permutation(arr, visited, N, i, 1);
            visited[i] = false;
        }

    }

    private static void permutation(int[] arr, boolean[] visited, int N, int start, int depth) {
        arr[depth] = start;

        if (depth == N) {
            for (int i = 1; i <= N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            permutation(arr, visited, N, i, depth + 1);
            visited[i] = false;
        }
    }
}
