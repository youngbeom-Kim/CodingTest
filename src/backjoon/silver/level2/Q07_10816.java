package backjoon.silver.level2;

import java.util.Arrays;
import java.util.Scanner;

//백준 > 실버4 > 숫자 카드 2 (10816번) (잠시 보류)
public class Q07_10816 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int data = in.nextInt();
            arr[i] = data;
        }

        Arrays.sort(arr);

        int M = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int answer = in.nextInt();

            sb.append(upperBound(arr, answer) - lowerBound(arr, answer));
            if (i != M - 1) {
                sb.append(' ');
            }
        }

        System.out.println(sb);

    }

    private static int lowerBound(int[] arr, int key) {

        int min = 0;
        int max = arr.length;

        while (min < max) {

            int mid = (min + max) / 2;

            if (key <= arr[mid]) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;

    }

    private static int upperBound(int[] arr, int key) {

        int min = 0;
        int max = arr.length;

        while (min < max) {

            int mid = (min + max) / 2;

            if (key < arr[mid]) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }

}
