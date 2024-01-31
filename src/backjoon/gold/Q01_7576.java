package backjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 골드5 > 토마토(7576번)
public class Q01_7576 {

    private static int M, N;
    private static int[][] tomatoBox;
    private static Queue<int[]> queue = new LinkedList<>();
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        tomatoBox = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                tomatoBox[i][j] = Integer.parseInt(st.nextToken());
                if (tomatoBox[i][j] == 1) {
                    queue.add(new int[] {i, j});
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];
            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                if (tomatoBox[nextX][nextY] == 0) {
                    tomatoBox[nextX][nextY] += tomatoBox[nowX][nowY] + 1;
                    queue.add(new int[] {nextX, nextY});
                }
            }
        }

        int max = Integer.MIN_VALUE;
        if (check()) {
            return -1;
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (max < tomatoBox[i][j]) {
                        max = tomatoBox[i][j];
                    }
                }
            }

            return max - 1;
        }


    }

    private static boolean check() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (tomatoBox[i][j] == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
