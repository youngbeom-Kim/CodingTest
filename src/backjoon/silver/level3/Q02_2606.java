package backjoon.silver.level3;

import java.util.Scanner;

public class Q02_2606 {

    static int[] virus;
    static int[][] comList;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int com = in.nextInt();
        int line = in.nextInt();

        virus = new int[com + 1];
        comList = new int[line + 1][2];

        for (int i = 0; i < line; i++) {
            comList[i][0] = in.nextInt();
            comList[i][1] = in.nextInt();
        }

        dfs(1);

    }

    private static void dfs(int i) {

        virus[i] = 1;

        for (int com : comList[i]) {
            if (virus[com] == 0) {
                dfs(com);
            }
        }

    }
}
