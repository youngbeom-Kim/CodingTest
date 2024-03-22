package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 > 실버2 > A -> B(16953번)
public class Q09_16953 {
    private static long A, B, answer;
    private static boolean flag;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        dfs(A, 1);

        if (flag) System.out.println(answer);
        else System.out.println(-1);
    }

    private static void dfs(long num, int cnt) {

        if (num > B) return;
        if (num == B) {
            answer = cnt;
            flag = true;
            return;
        }

        dfs(num * 2, cnt + 1);
        dfs(num * 10 + 1, cnt + 1);

    }
}
