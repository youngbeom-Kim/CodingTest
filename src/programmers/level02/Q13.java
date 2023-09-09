package programmers.level02;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 > Level 2 > N개의 최소 공배수
public class Q13 {
    public int solution(int[] arr) {
        int answer = 0;

        //숫자를 담을 리스트 만들기
        List<Integer> list = new ArrayList<>();

        //리스트안에 배열 숫자 담기
        for (int num : arr) {
            list.add(num);
        }

        //최대공약수를 덮어씌우기 위해 for문밖에 생성
        int gcd = 0;

        //최소공배수 구하기
        for (int i = 1; i < list.size(); i++) {

            int fnum = list.get(i);
            int bnum = list.get(i - 1);

            //두 숫자의 최대공약수 구하기
            for (int j = 1; j <= fnum && j <= bnum; j++) {
                if (fnum % j == 0 && bnum % j == 0) gcd = j;
            }

            //두 숫자의 최소공배수 구하기
            int lcm = fnum * (bnum / gcd);

            //다시 비교하기 위해서 최소공배수 넣기
            list.add(lcm);

            //비교한 두 숫자 삭제
            if (list.size() > 2) {
                list.remove(0);
                list.remove(0);
            }

            //배열을 다시 처음부터
            i = 0;

            answer = lcm;

        }

        return answer;
    }
    public static void main(String[] args) {

        Q13 sol = new Q13();

        int[] arr = {2, 6, 8, 14};
        System.out.println(sol.solution(arr));

        int[] arr2 = {1, 2, 3};
        System.out.println(sol.solution(arr2));

        int[] arr3 = {12, 32, 45, 67, 72};
        System.out.println(sol.solution(arr3));

        int[] arr4 = {13, 26};
        System.out.println(sol.solution(arr4));

        int[] arr5 = {17, 34};
        System.out.println(sol.solution(arr5));

        int[] arr6 = {3, 4, 9, 16};
        System.out.println(sol.solution(arr6));

    }

}
