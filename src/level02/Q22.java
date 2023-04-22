package level02;

import java.util.Arrays;

//프로그래머스 > Level 02 > 구명보트
public class Q22 {
    public int solution(int[] people, int limit) {
        int answer = 0;

        //배열을 정렬
        Arrays.sort(people);

        //최소값을 구하기 위한 수
        int cnt = 0;

        //탐욕법 알고리즘
        for (int i = people.length - 1; cnt <= i; i--) {
            //최소값과 최대값의 합이 limit를 넘지 않는다면 cnt++
            if (people[cnt] + people[i] <= limit) cnt++;
            //결과값 +1
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q22 sol = new Q22();

        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(sol.solution(people, limit));

        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        System.out.println(sol.solution(people2, limit2));

    }
}
