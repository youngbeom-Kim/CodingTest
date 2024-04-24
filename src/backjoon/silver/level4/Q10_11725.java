package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//백준 > 실버2 > 트리의 부모 찾기
public class Q10_11725 {

    private static int[] parent;
    private static boolean[] visited;
    private static ArrayList<Integer>[] node;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        parent = new int[N + 1];
        visited = new boolean[N + 1];
        node = new ArrayList[N + 1];

        for (int i = 0; i < N + 1; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            node[a].add(b);
            node[b].add(a);
        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }

    private static void dfs(int index) {
        visited[index] = true;
        for (int i : node[index]) {
            if (!visited[i]) {
                parent[i] = index;
                dfs(i);
            }
        }
    }
}
