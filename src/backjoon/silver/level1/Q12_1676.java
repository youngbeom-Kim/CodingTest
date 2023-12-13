package backjoon.silver.level1;

import java.util.Scanner;

//백준 > 실버5 > 팩토리얼 0의 개수
public class Q12_1676 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int cnt = 0;

        while (N > 1) {
            cnt += N / 5;
            N = N / 5;
        }

        System.out.println(cnt);

    }
}
