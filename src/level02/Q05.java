package level02;

import java.util.Arrays;

//프로그래머스 > level02 > 최댓값과 최솟값
public class Q05 {
    public String solution(String s) {
        String answer = "";

        //값을 넣어둘 배열
        String strings[] = s.split(" ");
        int nums[] = new int[strings.length];

        //기존 String값을 int로 변환 후 오름차순으로 정렬
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
            if (i == strings.length - 1) {
                Arrays.sort(nums);
            }
        }

        //int인 값을 String으로 변환 후 값 넣어주기
        answer = String.valueOf(nums[0]) + " " + String.valueOf(nums[nums.length - 1]);

        return answer;
    }

    public static void main(String[] args) {

        Q05 sol = new Q05();

        String s = "1 2 3 4";
        System.out.println(sol.solution(s));

        String s1 = "-1 -2 -3 -4";
        System.out.println(sol.solution(s1));

        String s2 = "-1 -1";
        System.out.println(s2);

    }
}
