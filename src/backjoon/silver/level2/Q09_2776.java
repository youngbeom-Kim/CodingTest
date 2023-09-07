package backjoon.silver.level2;

import java.util.Arrays;
import java.util.Scanner;

//백준 > 실버4 > 암기왕 (2776번)
public class Q09_2776 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {

            StringBuilder sb = new StringBuilder();

            int N = in.nextInt();
            int[] one = new int[N];

            for (int j = 0; j < one.length; j++) {
                one[j] = in.nextInt();
            }

            Arrays.sort(one);

            int M = in.nextInt();

            for (int j = 0; j < M; j++) {
                int answer = in.nextInt();

                int result = searchAnswer(one, answer);

                if (result > 0) {
                    sb.append("1").append('\n');
                } else {
                    sb.append("0").append('\n');
                }

            }

            sb.deleteCharAt(sb.length() - 1);

            System.out.println(sb);
        }

    }

    private static int searchAnswer(int[] one, int answer) {

        int min = 0;
        int max = one.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (answer < one[mid]) {
                max = mid - 1;
            } else if (answer > one[mid]) {
                min = mid + 1;
            } else {
                return 1;
            }

        }

        return 0;

    }
}
