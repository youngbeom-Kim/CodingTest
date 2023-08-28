package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 괄호 (9012번)
public class Q02_9012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        String[] answers = new String[T];

        for (int i = 0; i < T; i++) {
            String VPS = in.next();
            String[] arr = VPS.split("");
            int cnt = 0;
            for (String paren : arr) {
                cnt += paren.equals("(") ? 1 : -1;
            }
            if (cnt == 0) {
                answers[i] = "YES";
            } else {
                answers[i] = "NO";
            }
        }

        for (String answer : answers) {
            System.out.println(answer);
        }

    }
}
