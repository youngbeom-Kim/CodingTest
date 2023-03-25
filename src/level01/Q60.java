package level01;

import java.util.Arrays;
import java.util.HashMap;

//프로그래머스 > Level 01 > 개인정보 수집 유효기간
public class Q60 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        HashMap<String, Integer> map = new HashMap<>();

        return answer;
    }

    public static void main(String[] args) {

        Q60 sol = new Q60();

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(sol.solution(today, terms, privacies)));

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(sol.solution(today2, terms2, privacies2)));

    }
}
