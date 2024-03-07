package backjoon.silver.level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 > 실버3 > 소수 구하(1929번)
public class Q18_1929 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;

        for (int i = 2; i * i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = N; i <= M; i++) {
            if (!arr[i]) System.out.println(i);
        }

    }
}
