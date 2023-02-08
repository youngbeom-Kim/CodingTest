package level01;

//프로그래머스 > level01 > 내적
public class Q14 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Q14 sol = new Q14();

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(sol.solution(a, b));

        int[] a2 = {-1, 0, 1};
        int[] b2 = {1, 0, -1};
        System.out.println(sol.solution(a2, b2));

    }
}
