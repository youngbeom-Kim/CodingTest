package codingtest;

//프로그래머스 > 짝수와 홀수
public class Q09 {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 1) {
            answer = "Odd";
        } else {
            answer = "Even";
        }

        return answer;
    }

    public static void main(String[] args) {

        Q09 sol = new Q09();

        int num = 3;
        System.out.println(sol.solution(num));

        num = 4;
        System.out.println(sol.solution(num));

    }
}
