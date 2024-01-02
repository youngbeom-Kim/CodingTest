package backjoon.silver.level4;

import java.util.Scanner;

//백준 > 실버2 > 색종이 자르기 (2630번)
public class Q07_2630 {

    private static int[][] paper;
    private static int white;
    private static int blue;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                paper[i][j] = in.nextInt();
            }
        }

        partition(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

    }

    private static void partition(int row, int col, int size) {

        if (colorCheck(row, col, size)) {
            if (paper[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int cutSize = size / 2;

        partition(row, col, cutSize);
        partition(row, col + cutSize, cutSize);
        partition(row + cutSize, col, cutSize);
        partition(row + cutSize, col + cutSize, cutSize);
    }

    private static boolean colorCheck(int row, int col, int size) {

        int color = paper[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != color) {
                    return false;
                }
            }
        }

        return true;
    }
}
