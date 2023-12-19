package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q02_11724 {

    static boolean[] visited;
    static int[][] node;
    static int N;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;

        visited = new boolean[N];
        node = new int[N][N];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int U = Integer.parseInt(st.nextToken()) - 1;
            int V = Integer.parseInt(st.nextToken()) - 1;

            node[U][V] = node[V][U] = 1;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == false) {
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    private static void dfs(int num) {

        if (visited[num] == true) {
            return;
        } else {
            visited[num] = true;
            for (int i = 0; i < N; i++) {
                if (node[num][i] == 1) {
                    dfs(i);
                }
            }
        }

    }
}
