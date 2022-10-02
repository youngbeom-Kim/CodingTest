package level02;

//프로그래머스 > level02 > 숫자의 표현
public class Q10 {
    public int solution(int n) {
        int answer = 0;

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    sum = 0;
                    break;
                } else if (sum > n) {
                    sum = 0;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q10 sol = new Q10();

        int n = 15;
        System.out.println(sol.solution(n));

    }
}
