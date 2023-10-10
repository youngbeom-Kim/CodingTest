package backjoon.silver.level3;

import java.util.Scanner;

//백준 > 실버3 > 퇴사 (14501번)
public class Q08_14501R {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //날짜 (스케쥴 갯수)
        int N = in.nextInt();

        //T(교육 기간) 값 집합
        int[] T = new int[N];
        //P(급여) 값 집합
        int[] P = new int[N];
        //날짜 별로 최대 벌 수 있는 값
        int[] dp = new int[N + 1];

        //값 집어넣기
        for (int i = 0; i < N; i++) {
            T[i] = in.nextInt();
            P[i] = in.nextInt();
        }

        //dp값 구하기
        for (int i = 0; i < N; i++) {
            //날짜 범위를 넘기는 않는 경우
            if (i + T[i] <= N) {
                dp[i + T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i]);
            }
            //그 날 일할 수 없다면 전날의 최대 값을 가져옴
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }

        System.out.println(dp[N]);
    }
}
