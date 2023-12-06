package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 2*n 타일링
public class Q12_11726 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] answer = new int[N + 1];

        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i <= N; i++) {
            answer[i] = (answer[i - 2] + answer[i - 1]) % 10007;
        }

        System.out.println(answer[N]);
    }
}
