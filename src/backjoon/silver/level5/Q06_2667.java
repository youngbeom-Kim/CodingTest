package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q06_2667 {

    private static int[][] map;
    private static int N;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(s.substring(j, j + 1));
            }
        }

        bfs(0, 0);

        System.out.println(sb);
    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();

        int complex = 0;

        String complexCnt = "";

        for (int i = x; i < N; i++) {
            for (int j = y; j < N; j++) {
                if (map[i][j] == 1) {

                    complex++;
                    int cnt = 0;

                    queue.add(new int[] {i, j});

                    while (!queue.isEmpty()) {

                        int[] now = queue.poll();
                        int nowX = now[0];
                        int nowY = now[1];

                        for (int k = 0; k < 4; k++) {
                            int nextX = nowX + dx[k];
                            int nextY = nowY + dy[k];

                            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N) continue;

                            if (map[nextX][nextY] == 1) {
                                queue.add(new int[] {nextX, nextY});
                                map[nextX][nextY] = 0;
                                cnt++;
                            }

                        }

                    }

                    complexCnt += cnt + "\n";

                }
            }
        }

        sb.append(complex).append("\n").append(complexCnt);

    }
}
