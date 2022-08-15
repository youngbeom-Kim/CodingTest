package level02;

import java.math.BigInteger;

public class Q03_1 {
    public long solution(int w, int h) {

        long totalCount = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

        return totalCount - diagonalCount;

    }

    public static void main(String[] args) {

        Q03 sol = new Q03();

        int w = 8;
        int h = 12;
        System.out.println(sol.solution(w, h));

    }
}
