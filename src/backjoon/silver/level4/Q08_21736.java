package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 실버2 > 헌내기는 친구가 필요해(21736번)
public class Q08_21736 {

    private static int N, M;
    private static boolean[][] visited;
    private static String[][] map;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        map = new String[N][M];

        int x = 0;
        int y = 0;

        for (int i = 0; i < N; i++) {
            String route = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = route.substring(j, j + 1);
                if (map[i][j].equals("I")) {
                    x = i;
                    y = j;
                    visited[x][y] = true;
                }
            }
        }

        int friends = bfs(x, y);

        if (friends == 0) {
            System.out.println("TT");
        } else {
            System.out.println(friends);
        }

    }

    private static int bfs(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[] {x, y});

        int friends = 0;

        while(!queue.isEmpty()) {

            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                if (map[nextX][nextY].equals("P") && !visited[nextX][nextY]) {
                    friends++;
                    queue.add(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                } else if (map[nextX][nextY].equals("O") && !visited[nextX][nextY]) {
                    queue.add(new int[] {nextX, nextY});
                    visited[nextX][nextY] = true;
                }
            }

        }

        return friends;

    }
}
