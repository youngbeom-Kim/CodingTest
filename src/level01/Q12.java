package level01;

import java.util.ArrayList;

//프로그래머스 > level01 > 3진법 뒤집기
public class Q12 {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (n >= 1) {
            list.add(n % 3);
            n = n / 3;
        }

        int count = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            answer += list.get(i) * Math.pow(3, count);
            count++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q12 sol = new Q12();

        int n = 45;
        System.out.println(sol.solution(n));

        n = 125;
        System.out.println(sol.solution(n));

    }
}
