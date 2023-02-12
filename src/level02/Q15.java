package level02;

// 프로그래머스 > Level 2 > 점프와 순간 이동
public class Q15 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 == 1) {
                n = n - 1;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(new Q15().solution(n));
        //1# > 2* > 4* > 5#

        int n2 = 6;
        System.out.println(new Q15().solution(n2));
        //1# > 2* > 3# > 6*

        int n3 = 5000;
        System.out.println(new Q15().solution(n3));
        //5000* > 2500* > 1250* > 625# > 624* > 312* > 156* > 78* > 39* > 38# > 19* > 18# > 9* > 8# > 4* > 2* > 1#

    }

}
