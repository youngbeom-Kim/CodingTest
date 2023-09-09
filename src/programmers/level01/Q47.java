package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//프로그래머스 > Level01 > 문자열 내 마음대로 정렬하기
public class Q47 {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;

        String str = "";

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i].charAt(n) == answer[j].charAt(n)) {
                    if (answer[i].compareTo(answer[j]) > 0) {
                        str = answer[j];
                        answer[j] = answer[i];
                        answer[i] = str;
                    }
                } else if (Character.toString(answer[i].charAt(n)).compareTo(Character.toString(answer[j].charAt(n))) > 0) {
                    str = answer[j];
                    answer[j] = answer[i];
                    answer[i] = str;
                }
            }
        }

        return answer;
    }
    public String[] solution1(String[] strings, int n) {
        String[] answer = {};

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }

        return answer;
    }
    public static void main(String[] args) {

        Q47 sol = new Q47();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(sol.solution1(strings, n)));

        String[] strings2 = {"abce", "abcd", "cdx"};
        int n2 = 2;
        System.out.println(Arrays.toString(sol.solution1(strings2, n2)));

    }
}
