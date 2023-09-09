package programmers.level01;

import java.util.Stack;

//프로그래머스 > Level 01 > 햄버거 만들기
public class Q57 {
    public int solution(int[] ingredient) {
        int answer = 0;

        /*
        시간초과 오류 발생
        String str = "";

        for (int i = 0; i < ingredient.length; i++) {
            str += ingredient[i];
        }

        while (str.contains("1231")) {
            str = str.replace("1231", "");
            answer++;
        }
        */

        Stack<Integer> stack = new Stack<>();
        String str = "";

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);

            if (stack.size() >= 4) {
                if (stack.get(stack.size() - 1) == 1 &&
                    stack.get(stack.size() - 2) == 3 &&
                    stack.get(stack.size() - 3) == 2 &&
                    stack.get(stack.size() - 4) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q57 sol = new Q57();

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(sol.solution(ingredient)); // 2

        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(sol.solution(ingredient2)); // 0

    }
}
