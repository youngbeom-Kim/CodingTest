package backjoon.bronze.level4;

import java.util.Scanner;

//백준 > 브론즈2 > 벌집 (2292번)
public class Q01_2292 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int cnt = 1;
        int num = 0;

        while (N - 1 > 0) {
            num = num + 6;
            N -= num;
            cnt++;
        }

        System.out.println(cnt);

    }
}
