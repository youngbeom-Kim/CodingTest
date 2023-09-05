package backjoon.silver.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 > 실버 4 > 수 찿기 (1920번)
public class Q08_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int data = Integer.parseInt(br.readLine());

        int[] arr = new int[data];

        for (int i = 0; i < data; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int value = Integer.parseInt(br.readLine());

        int[] answers = new int[value];

        for (int i = 0; i < value; i++) {
            int answer = Integer.parseInt(br.readLine());

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
