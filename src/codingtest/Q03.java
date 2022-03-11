package codingtest;

import java.util.ArrayList;
import java.util.Arrays;

//프로그래머스 > 모의고사
public class Q03 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) score[0]++;
            if (answers[i] == second[i % second.length]) score[1]++;
            if (answers[i] == third[i % third.length]) score[2]++;
        }

        int max = Math.max(Math.max(score[0], score[1]), score[2]);

        ArrayList<Integer> list = new ArrayList<Integer>();

        if (max == score[0]) list.add(1);
        if (max == score[1]) list.add(2);
        if (max == score[2]) list.add(3);

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Q03 sol = new Q03();

        int[] answers = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};

        System.out.println(Arrays.toString(sol.solution(answers)));
        System.out.println(Arrays.toString(sol.solution(answers2)));


    }
}
