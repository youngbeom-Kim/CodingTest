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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                arr[X][Y] = 1;
            }

            int cnt = 0;

            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {

                    if (arr[n][m] == 1) {
                        check(n, m);
                        cnt++;
                    }

                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);

    }

    private static void check(int n, int m) {

        arr[n][m] = 0;

        xCheck(n, m);
        yCheck(n, m);

    }

    private static void xCheck(int n, int m) {

        if (n - 1 > 0) {
            if (arr[n - 1][m] == 1) {
                check(n - 1, m);
            }
        }

        if (n + 1 < N) {
            if (arr[n + 1][m] == 1) {
                check(n + 1, m);
            }
        }

    }

    private static void yCheck(int n, int m) {

        if (m - 1 > 0) {
            if (arr[n][m - 1] == 1) {
                check(n, m - 1);
            }
        }

        if (m + 1 < M) {
            if (arr[n][m + 1] == 1) {
                check(n, m + 1);
            }
        }

    }
}
