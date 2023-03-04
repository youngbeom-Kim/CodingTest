package level01;

import java.util.Arrays;

//프로그래머스 > Level01 > 최대공약수와 최소공배수
public class Q44 {
    public int[] solution(int n, int m) {

        int min = 0;

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) min = i;
        }

        int max = (n * m) / min;

        int[] answer = {min, max};

        return answer;
    }
    public static void main(String[] args) {

        Q44 sol = new Q44();

        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(sol.solution(n, m)));

        int n2 = 2;
        int m2 = 5;
        System.out.println(Arrays.toString(sol.solution(n2, m2)));

    }
}
