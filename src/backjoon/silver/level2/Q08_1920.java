package backjoon.silver.level2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//백준 > 실버 4 > 수 찿기 (1920번)
public class Q08_1920 {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int M = in.nextInt();

        int[] answers = new int[M];

        for (int i = 0; i < M; i++) {
            int answer = in.nextInt();

            answers[i] = searchAnswer(answer, arr);

        }

        for (int answer : answers) {
            System.out.println(answer);
        }

    }

    private static int searchAnswer(int answer, int[] arr) {

        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (answer < arr[mid]) {
                max = mid - 1;
            } else if (answer > arr[mid]) {
                min = mid + 1;
            } else {
                return 1;
            }

        }

        return 0;

    }
}
