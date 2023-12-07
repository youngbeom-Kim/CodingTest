package backjoon.bronze.level5;

import java.util.Scanner;

//백준 > 브론즈1 > 평균 (1546번)
public class Q01_1546 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        double[] score = new double[N];
        double M = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = in.nextDouble();
            M = Math.max(M, score[i]);
        }

        for (int i = 0; i < N; i++) {
            sum += score[i] / M * 100;
        }

        System.out.println(sum / N);
    }
}
