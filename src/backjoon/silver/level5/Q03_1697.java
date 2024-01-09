package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 실버1 > 숨바꼭질(1697번)
public class Q03_1697 {
    private static int[] visited = new int[100001];
    private static int N;
    private static int K;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    private static void bfs(int N) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(N);

        visited[N] = 1;

        while(!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = num + 1;
                } else if (i == 1) {
                    next = num - 1;
                } else {
                    next = num * 2;
                }

                if (next == K) {
                    System.out.println(visited[num]);
                    return;
                }

                if (num >= 0 && num < visited.length && visited[next] == 0) {
                    queue.add(next);
                    visited[next] = visited[num] + 1;
                }
            }
        }


    }
}
