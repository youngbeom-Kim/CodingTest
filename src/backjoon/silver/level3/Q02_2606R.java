package backjoon.silver.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 > 실버3 > 바이러스
public class Q02_2606R {

    private static boolean[] visited;
    private static int[][] arr;
    private static int N;
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        System.out.println(dfs(1));

    }

    private static int dfs(int depth) {

        visited[depth] = true;

        for (int i = 1; i <= N; i++) {
            if (arr[depth][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }

        return count;
    }
}

