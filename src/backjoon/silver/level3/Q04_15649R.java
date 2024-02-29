package backjoon.silver.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 > 실버3 > N과 M(1) (15649번)
public class Q04_15649R {

    private static int[] arr;
    private static boolean[] visited;
    private static int N;
    private static int M;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            visited[i] = true;
            bTrack(i, 1);
            visited[i] = false;
        }

    }

    private static void bTrack(int start, int depth) {

        arr[depth] = start;

        if (depth == M) {
            for (int i = 1; i <= M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            bTrack(i, depth + 1);
            visited[i] = false;
        }

    }
}
