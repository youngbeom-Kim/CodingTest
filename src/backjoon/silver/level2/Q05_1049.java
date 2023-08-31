package backjoon.silver.level2;

import java.util.Arrays;
import java.util.Scanner;

//백준 > 실버4 > 기타줄 (1049번)
public class Q05_1049 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int line = in.nextInt();
        int brand = in.nextInt();
        int Min = 1000;

        int[] bundle = new int[brand];
        int[] single = new int[brand];

        for (int i = 0; i < brand; i++) {
            bundle[i] = in.nextInt();
            single[i] = in.nextInt();
        }

        Arrays.sort(bundle);
        Arrays.sort(single);

        Min = Math.min(((line/6) + 1) * bundle[0], line * single[0]);
        Min = Math.min(Min, (line/6) * bundle[0] + (line%6) * single[0]);

        System.out.println(Min);

    }
}
