package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 수 이어 쓰기 1 (1748번)
public class Q06_1748 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            sb.append("").append(i);
        }

        System.out.println(sb.length());

    }
}
