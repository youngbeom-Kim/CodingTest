package codingtest;

//프로그래머스 > 수박수박수박수박수박수?
public class Q06 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < (double) n / 2; i++) {
            if (n % 2 == 1) {
                if (i == n / 2) {
                    answer += "수";
                    break;
                }
            }
            answer += "수박";
        }

        return answer;
    }
    public static void main(String[] args) {

        Q06 sol = new Q06();

        int three = 3;
        int two = 2;


        int n = 3;
        System.out.println(sol.solution(n));

        n = 4;
        System.out.println(sol.solution(n));

    }
}
