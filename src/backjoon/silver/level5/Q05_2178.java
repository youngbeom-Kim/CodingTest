package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 실버1 > 미로 탐색(2178번)
public class Q05_2178 {

    private static int[][] map;
    private static boolean[][] visited;
    private static int N, M;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(s.substring(j, j + 1));
            }
        }

        visited = new boolean[N][M];
        visited[0][0] = true;

        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);

    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x, y});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                if (!visited[nextX][nextY] && map[nextX][nextY] == 1) {
                    queue.add(new int[] {nextX, nextY});
                    map[nextX][nextY] += map[nowX][nowY];
                    visited[nextX][nextY] = true;
                }
            }
        }

    }
}
