package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 실버1 > 숨바꼭질(1697번)
public class Q03_1697 {
    private static Queue<Integer> queue1, queue2;
    private static boolean[] visited = new boolean[400001];
    private static int result = 0;
    private static int K;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();

        queue1.add(N);

        bfs(queue1.peek());

        System.out.println(result);
    }

    private static void bfs(int num) {

        if (result % 2 == 0) {
            num = queue1.poll();
        } else {
            num = queue2.poll();
        }

        if (num != K) {
            if (visited[num] == false) {
                if (result % 2 == 0) {
                    if (num - 1 > 0) queue2.add(num - 1);
                    queue2.add(num + 1);
                    queue2.add(num * 2);
                } else {
                    if (num - 1 > 0) queue1.add(num - 1);
                    queue1.add(num + 1);
                    queue1.add(num * 2);
                }
            }
        } else {
            return;
        }

        visited[num] = true;

        if (queue1.isEmpty() || queue2.isEmpty()) {
            result++;
        }

        if (result % 2 == 0) {
            bfs(queue1.peek());
        } else {
            bfs(queue2.peek());
        }
    }
}
