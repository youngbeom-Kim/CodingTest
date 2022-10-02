package level02;

//프로그래머스 > level02 > 피보나치 수
public class Q11 {
    public int solution(int n) {
        int answer =  0;

        int n1 = 0;
        int n2 = 1;
        int num = 1234567;

        for (int i = 2; i <= n; i++) {
            answer = n1 + n2 % num;
            n1 = n2 % num;
            n2 = answer % num;
        }

        return answer % num;
    }

    public static void main(String[] args) {

        //0 = 0, 1 = 1
        //2 = 0 + 1 = 1
        //3 = 1 + 1 = 2
        //4 = 1 + 2 = 3
        //5 = 2 + 3 = 5
        //6 = 3 + 5 = 8
        //7 = 5 + 8 = 13

        Q11 sol = new Q11();

        int n = 3;
        System.out.println(sol.solution(n));

        int n2 = 100;
        System.out.println(sol.solution(n2));

    }
}
