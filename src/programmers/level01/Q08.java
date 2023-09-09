package programmers.level01;

//프로그래머스 > programmers.level01 > 짝수와 홀수
public class Q08 {
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

        Q08 sol = new Q08();

        int num = 3;
        System.out.println(sol.solution(num));

        num = 4;
        System.out.println(sol.solution(num));

    }
}
