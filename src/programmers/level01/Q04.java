package programmers.level01;

//프로그래머스 > programmers.level01 > 두 정수 사이의 합
public class Q04 {
    public long solution(int a, int b) {
        long answer = 0;

        int max = 0;
        int min = 0;

        if (a >= b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        long sum = 0;

        for (int i = min; i <= max;  i++) {
            sum += i;
        }

        answer = sum;

        return answer;
    }

    public static void main(String[] args) {

        Q04 sol = new Q04();

        int a = 3;
        int b = 5;
        System.out.println(sol.solution(a, b));

        a = 3;
        b = 3;
        System.out.println(sol.solution(a, b));

        a = 5;
        b = 3;
        System.out.println(sol.solution(a, b));

    }
}
