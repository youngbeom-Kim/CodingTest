package backjoon.silver.level2;

import java.util.Scanner;
import java.util.Stack;

//백준 > 실버4 > 괄호 (9012번)
public class Q02_9012 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        String[] answers = new String[T];

        for (String answer : answers) {
            System.out.println(answer);
        }

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String paren = in.next();

            for (int j = 0; j < paren.length(); j++) {
                char c = paren.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else if  (stack.empty()){
                    answers[i] = "NO";
                    break;
                } else {
                    stack.pop();
                }

            }

            if (stack.empty()) {
                answers[i] = "YES";
            } else {
                answers[i] = "NO";
            }

        }

        for (String answer : answers) {
            System.out.println(answer);
        }

    }
}
