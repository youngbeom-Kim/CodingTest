package level02;

import java.math.BigInteger;

// 프로그래머스 > level02 > 멀쩡한 사각형
public class Q02 {
    public long solution2(int w, int h) {

        long totalCount = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

        return totalCount - diagonalCount;

    }
    public long solution(int w, int h) {
        long answer = 1;

        int min = (w < h) ? w : h;
        int gcd = 0;

        for (int i = 1; i <= min; i++) {
            if (w % i == 0 && h % i == 0) {
                gcd = i;
            }
        }

        answer = ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);

        return answer;
    }

    public static void main(String[] args) {

        Q02 sol = new Q02();

        int w = 8;
        int h = 12;
        System.out.println(sol.solution(w, h));

    }
}
