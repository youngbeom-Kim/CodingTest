package level01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//프로그래머스 > Level 01 > 카드 뭉치
public class Q56 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";

        Queue qCard1 = new LinkedList(Arrays.asList(cards1));
        Queue qCard2 = new LinkedList(Arrays.asList(cards2));
        Queue qGoal = new LinkedList(Arrays.asList(goal));

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(qCard1.peek())) {
                qCard1.poll();
                qGoal.poll();
            } else if (goal[i].equals(qCard2.peek())) {
                qCard2.poll();
                qGoal.poll();
            } else {
                break;
            }
        }

        if (qGoal.isEmpty()) {
            answer = "Yes";
        }

        return answer;
    }
    public static void main(String[] args) {

        Q56 sol = new Q56();

        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(sol.solution(cards1, cards2, goal));

        String[] cards1_2 = {"i", "water", "drink"};
        String[] cards2_2 = {"want", "to"};
        String[] goal2 = {"i", "want", "to", "drink", "water"};
        System.out.println(sol.solution(cards1_2, cards2_2, goal2));

    }
}
