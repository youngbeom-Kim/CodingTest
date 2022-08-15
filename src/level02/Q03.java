package level02;

// 프로그래머스 > level02 > 멀쩡한 사각형
public class Q03 {
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

        Q03 sol = new Q03();

        int w = 8;
        int h = 12;
        System.out.println(sol.solution(w, h));

    }
}
