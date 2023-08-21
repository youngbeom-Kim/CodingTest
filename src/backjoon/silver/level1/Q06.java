package backjoon.silver.level1;

import java.util.Scanner;

//백준 > 실버5 > 막대기 (1094번)
public class Q06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stick = 64;

        int X = in.nextInt();
        int data = 0;
        int cnt = 0;

        while (true) {
            if (X == 64) {
                cnt = 1;
                break;
            } else if (X == data) {
                break;
            }
            stick = stick / 2;
            if (X >= stick) {
                data += stick;
                cnt++;
            }
            if (data > X) {
                data -= stick;
                cnt--;
            }
        }

        System.out.println(cnt);

    }
}
