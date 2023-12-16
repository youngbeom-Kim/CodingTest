package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q01_1012 {

    static int[][] arr;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        arr = new int[N][M];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            arr[X][Y] = 1;
        }

        while (T-- > 0) {

            int cnt = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {

                    if (arr[i][j] == 1) {
                        check(i, j);
                        cnt++;
                    }

                }
            }

            System.out.println(cnt);

        }

    }

    private static void check(int i, int j) {

        arr[i][j] = 0;

        xCheck(i, j);
        yCheck(i, j);

    }

    private static void xCheck(int i, int j) {

        if (i - 1 < 0 || i + 1 > N) {
            return;
        }

        if (arr[i - 1][j] == 1) {
            check(i - 1, j);
        }
        if (arr[i + 1][j] == 1) {
            check(i + 1, j);
        }

    }

    private static void yCheck(int i, int j) {

        if (j - 1 < 0 || j + 1 > M) {
            return;
        }

        if (arr[i][j - 1] == 1) {
            check(i, j - 1);
        }
        if (arr[i][j + 1] == 1) {
            check(i, j + 1);
        }

    }
}
