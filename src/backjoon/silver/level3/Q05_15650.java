package backjoon.silver.level3;

import java.util.Scanner;

public class Q05_15650 {
    static boolean[] visit;
    static int[] arr;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        visit = new boolean[N];
        arr = new int[M];

        bTrack(N, M, 0);

    }

    private static void bTrack(int N, int M, int depth) {

        if (depth == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < M; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                bTrack(N, M, depth + 1);
                visit[i] = false;
            }
        }

    }

}
