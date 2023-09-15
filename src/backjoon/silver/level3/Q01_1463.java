package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 1로 만들기 (1463번)
public class Q01_1463 {

    static Integer[] arr;

    public static void main(String[] args) {

        int M = 0;

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        arr = new Integer[N + 1];
        arr[0] = arr[1] = 0;

        if (M == 0) {
            System.out.println(recursion(N));
        } else {
            System.out.println(recursion(N, 0));
        }


    }

    private static int recursion(int N, int cnt) {
        if (N < 2) {
            return cnt;
        }

        return Math.min(recursion(N / 2, cnt + 1 + (N % 2)), recursion(N / 3, cnt + 1 + (N % 3)));
    }

    private static int recursion(int N) {

        if (arr[N] == null) {
            if (N % 3 == 0) {
                arr[N] = Math.min(recursion(N / 3), recursion(N - 1)) + 1;
            } else if (N % 2 == 0) {
                arr[N] = Math.min(recursion(N / 2), recursion(N - 1)) + 1;
            } else {
                arr[N] = recursion(N - 1) + 1;
            }
        }

        return arr[N];

    }
}
