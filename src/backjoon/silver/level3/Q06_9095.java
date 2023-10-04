package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 1, 2, 3 더하기
public class Q06_9095 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[11];

        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i < arr.length; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            sb.append(arr[N]).append("\n");
        }

        System.out.println(sb);

    }
}
