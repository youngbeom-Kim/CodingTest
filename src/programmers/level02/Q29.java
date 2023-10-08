package programmers.level02;

import java.util.*;

//프로그래머스 > Level 02 > 뒤에 있는 큰 수 찾기
public class Q29 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q29 sol = new Q29();

        int[] numbers = {2, 3, 3, 5};
        System.out.println(Arrays.toString(sol.solution(numbers)));

        int[] numbers2 = {9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(sol.solution(numbers2)));

    }
}