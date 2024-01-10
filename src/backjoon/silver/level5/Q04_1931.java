package backjoon.silver.level5;

import java.util.Arrays;
import java.util.Scanner;

//백준 > 실버1 > 회의실 배정(1931번)
public class Q04_1931 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[][] time = new int[N][2];

        for (int i = 0; i < N; i++) {
            time[i][0] = in.nextInt();
            time[i][1] = in.nextInt();
        }

        Arrays.sort(time, (o1, o2) -> {
            if (o1[1] == o2[1]) return o1[0] - o2[1];
            return o1[1] - o2[1];
        });

        int end = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (time[i][0] >= end) {
                end = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
