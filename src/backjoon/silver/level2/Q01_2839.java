package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 설탕 가게 (2839번)
public class Q01_2839 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] sugar = {5, 3};

        int N = in.nextInt();
        int sCnt = 0;
        int sNum = 0;

        for (int i = 0; i < sugar.length; i++) {
            sNum = N / sugar[i];
            sCnt += sNum;
            N -= sNum * sugar[i];

            if (N == 0) {
                break;
            }
        }

        if (N != 0) {
            sCnt = -1;
        }

        System.out.println(sCnt);

    }
}
