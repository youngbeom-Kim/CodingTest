package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 2*n 타일링
public class Q12_11726 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long[] answer = new long[N + 1];

        answer[0] = 0;
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i <= N; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        System.out.println(answer[N] % 10007);

    }
}
