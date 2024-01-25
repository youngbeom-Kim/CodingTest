package backjoon.silver.level5;

import java.util.Scanner;

//백준 > 실버1 > IOIOI(5525번)
public class Q07_5525 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        char[] P = in.next().toCharArray();

        int[] check = new int[M];
        int cnt = 0;

        for (int i = 1; i < M - 1; i++) {
            if (P[i] == 'O' && P[i + 1] == 'I') {
                check[i + 1] = check[i - 1] + 1;

                if (P[i - 1] == 'I' && check[i + 1] >= N) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
