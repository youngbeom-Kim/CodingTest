package level01;

import java.util.stream.IntStream;

//프로그래머스 > Level 01 > 나머지가 1이 되는 수 찾기
public class Q36 {

    //람다식으로 푼 것
    public int solution2(int n) {
        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
    }

    //내가 푼 것
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q36 sol = new Q36();

        int n = 10;
        System.out.println(sol.solution(n));

        int n2 = 12;
        System.out.println(sol.solution(n2));

    }
}
