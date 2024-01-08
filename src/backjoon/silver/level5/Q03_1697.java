package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 > 실버1 > 숨바꼭질(1697번)
public class Q03_1697 {
    private static Queue<Integer> queue;
    private static int result = -1;
    private static int K;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        queue = new LinkedList<>();

        queue.add(N);

        bfs(queue.peek());

        System.out.println(result);
    }

    private static void bfs(int N) {

        int num = queue.poll();

        if (num != K) {
            queue.add(num - 1);
            queue.add(num + 1);
            queue.add(num * 2);
        } else {
            if (result != -1) {
                int cnt = 1;
                while (result > Math.pow(3, cnt)) {
                    if (result > Math.pow(3, cnt)) {
                        result -= Math.pow(3, cnt);
                    }
                    cnt++;
                }
                result = cnt;
            } else {
                result = 0;
            }
            return;
        }

        result++;
        bfs(queue.peek());
    }
}
