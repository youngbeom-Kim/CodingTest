package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 바이러스
public class Q02_2606R {

    static boolean[] virus;
    static int[][] comList;
    static int com, line;
    static int count = 0;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        com = in.nextInt();
        line = in.nextInt();

        virus = new boolean[com + 1];
        comList = new int[com + 1][com + 1];

        for (int i = 0; i < line; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            comList[a][b] = comList[b][a] = 1;
        }

        System.out.println(dfs(1));

    }

    private static int dfs(int i) {

        virus[i] = true;

        for (int j = 1; j <= com; j++) {
            if (comList[i][j] == 1 && virus[j] == false) {
                count++;
                dfs(j);
            }
        }

        return count;

    }
}

