package level02;

import java.util.Stack;

//프로그래머스 > Level02 > 짝지어 제거하기
public class Q14 {
    public int solution(String s){

        Stack<String> stack = new Stack<>();

        String a = "";

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.substring(i, i+1));
            if (i > 0 && a.equals(stack.peek())) {
                stack.pop();
                stack.pop();
            }
            if (!stack.isEmpty()) {
                a = stack.peek();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {

        Q14 sol = new Q14();

        String s = "baabaa";
        System.out.println(sol.solution(s));

        String s2 = "cdcd";
        System.out.println(sol.solution(s2));

    }
}
