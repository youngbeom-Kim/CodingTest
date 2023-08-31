package backjoon.silver.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//백준 > 실버4 > 로프 (2217번)
public class Q04_2217 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Integer[] ropes = new Integer[N];

        int min = 10000;
        int weight = 0;

        for (int i = 0; i < N; i++) {
            int rope = in.nextInt();
            ropes[i] = rope;
        }

        Arrays.sort(ropes, Collections.reverseOrder());

        for (int i = 1; i <= ropes.length; i++) {
            if (min > ropes[i - 1]) {
                min = ropes[i - 1];
            }
            if (weight < min * i) {
                weight = min * i;
            }
            if (weight < ropes[i - 1]) {
                weight = ropes[i - 1];
            }
        }

        System.out.println(weight);

    }
}
