package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 피보나치 함수(1003번)
public class Q17_1003 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[41];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        int T = in.nextInt();

        while (T-- > 0) {

            int N = in.nextInt();

            if (N == 0) {
                sb.append("1 0");
            } else if (N == 1) {
                sb.append("0 1");
            } else {
                sb.append(arr[N - 2] + " " + arr[N - 1]);
            }

            sb.append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
