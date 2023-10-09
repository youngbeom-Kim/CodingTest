package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 퇴사 (14501번)
public class Q08_14501 {
    static int N, max;
    static int cnt = 1;
    static int[] term, pay;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        term = new int[N];
        pay = new int[N];
        max = 0;

        for (int i = 0; i < N; i++) {
            term[i] = in.nextInt();
            pay[i] = in.nextInt();
        }

        recur(1, 0);

        System.out.println(max);
    }

    private static void recur(int date, int paid) {

        if (cnt == N) {
            return;
        }

        if ((term[date - 1] - 1) + date > N) {
            max = Math.max(max, paid);
            cnt += 1;
            recur(cnt, 0);
        }

        paid += pay[date - 1];

        recur(date + term[date - 1], paid);
    }
}
