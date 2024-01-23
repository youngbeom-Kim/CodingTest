package backjoon.silver.level5;

import java.util.Scanner;

public class Q07_5525 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        String P = in.next();

        String check = "";

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                check += "IOI";
            } else {
                check += "OI";
            }
        }

        int cnt = 0;

        int index = 0;

        while (index >= 0 && P.indexOf(check) > 0) {

            index = P.indexOf(check, index + 2);

            if (index > 0) cnt++;

        }

        System.out.println(cnt);

    }
}
