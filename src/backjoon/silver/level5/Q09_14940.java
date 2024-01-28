package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 실버1 > 쉬운 최단거리(14940번)
public class Q09_14940 {

    private static boolean[][] visited;
    private static int[][] map;
    private static int N, M;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M ; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    x = i;
                    y = j;
                } else if (map[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        bfs(x, y);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }

    private static void bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x, y});

        visited[x][y] = true;
        map[x][y] = 0;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;

                if (map[nextX][nextY] != 0 && !visited[nextX][nextY]) {
                    queue.add(new int[] {nextX, nextY});
                    map[nextX][nextY] += map[nowX][nowY];
                    visited[nextX][nextY] = true;
                }
            }
        }

    }
}
