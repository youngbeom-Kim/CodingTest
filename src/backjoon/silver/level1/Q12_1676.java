package backjoon.silver.level1;

import java.util.Scanner;

//백준 > 실버5 > 팩토리 0의 개수
public class Q12_1676 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long num = 1;

        int N = in.nextInt();

        for (long i = 1; i <= N; i++) {
            num *= i;
        }

        String str = String.valueOf(num);

        int cnt = 0;

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != '0') {
                break;
            }
            cnt++;
        }

        System.out.println(cnt);

    }
}
