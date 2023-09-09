package programmers.level01;

import java.util.LinkedHashMap;
import java.util.Map;

//프로그래머스 > programmers.level01 > 성격 유형 검사하기
public class Q28 {
        public String solution(String[] survey, int[] choices) {
            String answer = "";

            //점수를 세기위한 배열
            Map<String, Integer> map = new LinkedHashMap<>();
            String[] type = {"R", "C", "J", "A", "T", "F", "M", "N"};
            int[] score = {3, 2, 1, 0, 1, 2, 3};

            //맵에 유형 집어넣기
            for (int i = 0; i < type.length; i++) {
                map.put(type[i], 0);
            }

            //점수내기
            for (int i = 0; i < survey.length; i++) {
                char front = survey[i].charAt(0);
                char back = survey[i].charAt(1);
                if (choices[i] < 4) {
                    map.put(String.valueOf(front), map.get(String.valueOf(front)) + score[choices[i] - 1]);
                } else if (choices[i] > 4) {
                    map.put(String.valueOf(back), map.get(String.valueOf(back)) + score[choices[i] - 1]);
                } else {
                    continue;
                }
            }

            //점수 비교해서 answer 뽑기
            for (int i = 0; i < map.size() / 2; i++) {
                if (map.get(type[i]) > map.get(type[i + 4]) || map.get(type[i]) == map.get(type[i + 4])) {
                    answer += type[i];
                } else {
                    answer += type[i + 4];
                }
            }

            return answer;
        }

        public static void main(String[] args) {

            Q28 sol = new Q28();

            String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
            int[] choices = {5, 3, 2, 7, 5};
            System.out.println(sol.solution(survey, choices));

            String[] survey2 = {"TR", "RT", "TR"};
            int[] choices2 = {7, 1, 3};
            System.out.println(sol.solution(survey2, choices2));

        }
}
