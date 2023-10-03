package backjoon.silver.level3;

import java.util.Scanner;

public class Q05_15650R {
    static int[] arr;
    static int N, M;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        bTrack(1, 0);

    }

    private static void bTrack(int a, int depth) {

        if (depth == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }


        for (int i = a; i < N; i++) {
            arr[depth] = i;
            bTrack(i + 1,  depth + 1);
        }

    }

}
