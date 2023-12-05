package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 파도반 수열
public class Q11_9461 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {

            int N = in.nextInt();

            long[] answer = new long[101];
            answer[1] = 1;
            answer[2] = 1;
            answer[3] = 1;


            for (int i = 4; i <= N; i++) {
                answer[i] = answer[i - 2] + answer[i - 3];
            }

            sb.append(answer[N] + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
