package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 > 실버2 > 나무 자르기
public class Q05_2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = 0;
        int max = 0;

        int[] tree = new int[N];

        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(br.readLine());

            if (max < tree[i]) max = tree[i];
        }

        while (min < max) {

            int mid = (min + max) / 2;
            int sum = 0;

            for (int num : tree) {
                if (num - mid > 0) {
                    sum += num - mid;
                }
            }

            if (sum < M) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }

        System.out.println(min - 1);

    }
}
