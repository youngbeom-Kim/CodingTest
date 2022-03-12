package codingtest;

//두 정수 사이의 합
public class Q05 {
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

        Q05 sol = new Q05();

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
