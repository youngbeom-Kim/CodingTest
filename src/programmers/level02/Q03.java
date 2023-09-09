package programmers.level02;

//프로그래머스 > Level02 > 124 나라의 숫자
public class Q03 {
    public String solution(int n) {
        String answer = "";

        String[] numbers = {"4", "1", "2"};

        int num = n;

        while (num > 0) {
            int remainder = n % 3;
            num = num / 3;

            if (remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q03 sol = new Q03();

        int n = 1;
        System.out.println(sol.solution(n));

        int n2 = 2;
        System.out.println(sol.solution(n2));

        int n3 = 3;
        System.out.println(sol.solution(n3));

        int n4 = 4;
        System.out.println(sol.solution(n4));

    }
}
