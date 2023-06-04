package level02;

import java.util.Arrays;

//프로그래머스 > Level 02 > 주차 요금 계산
public class Q28 {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        return answer;
    }
    public static void main(String[] args) {

        Q28 sol = new Q28();

        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(sol.solution(fees, records)));

        int[] fees2 = {120, 0, 60, 591};
        String[] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        System.out.println(Arrays.toString(sol.solution(fees2, records2)));

        int[] fees3 = {1, 461, 1, 10};
        String[] records3 = {"00:00 1234 IN"};
        System.out.println(Arrays.toString(sol.solution(fees3, records3)));

    }
}
