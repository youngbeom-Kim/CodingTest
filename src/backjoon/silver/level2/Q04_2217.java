package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 로프 (2217번)
public class Q04_2217 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int min = 10000;
        int weight = 0;

        for (int i = 1; i <= N; i++) {
            int rope = in.nextInt();
            if (min > rope) {
                min = rope;
            }
            if (weight < min * i) {
                weight = min * i;
            }
            if (weight < rope) {
                weight = rope;
            }
        }

        System.out.println(weight);

    }
}
