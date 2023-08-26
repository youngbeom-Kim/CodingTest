package backjoon.silver.level1;

import java.util.Scanner;

//백준 > 실버5 > 창문 닫기 (13909번)
public class Q10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int cnt = 0;

        for (int i = 1; i * i <= num; i++) {
            cnt++;
        }

        System.out.println(cnt);

    }
}
