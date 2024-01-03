package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q01_1074 {

    private static int x = 0;
    private static int y = 0;
    private static int result = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Z(r, c, (int)Math.pow(2, N));

        System.out.println(result);
    }

    private static void Z(int r, int c, int n) {

        n /= 2;

        if (r < x + n && c < y + n) {
            result += (n * n * 0);
        } else if (r < x + n && c >= y + n) {
            y += n;
            result += (n * n * 1);
        } else if (r >= x + n && c < y + n) {
            x += n;
            result += (n * n * 2);
        } else if (r >= x + n && c >= y + n) {
            x += n;
            y += n;
            result += (n * n * 3);
        }

        if (n == 1) return;

        Z(r, c, n);
    }
}
