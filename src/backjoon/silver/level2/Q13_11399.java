package backjoon.silver.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 > 실버4 > ATM(11399번)
public class Q13_11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                arr[i] += arr[i - 1];
            }
            answer += arr[i];
        }

        System.out.println(answer);
    }
}
