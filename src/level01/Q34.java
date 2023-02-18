package level01;

//프로그래머스 > Level 01 > 정수 제곱근 판별
public class Q34 {
    public long solution(long n) {
        long answer = - 1;

        if (Math.sqrt(n) % 1 == 0) {
            return answer = (long) Math.pow((Math.sqrt(n) + 1), 2);
        }

        return answer;
    }
    public static void main(String[] args) {

        Q34 sol = new Q34();

        int n = 121;
        System.out.println(sol.solution(n));

        int n2 = 3;
        System.out.println(sol.solution(n2));

    }

}
