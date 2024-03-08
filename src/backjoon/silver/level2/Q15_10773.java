package backjoon.silver.level2;

import java.util.Scanner;
import java.util.Stack;

//백준 > 실버4 > 제로(10773번)
public class Q15_10773 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int K = in.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int num = in.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }

        int answer = 0;

        for (int nums : stack) {
            answer += nums;
        }

        System.out.println(answer);

    }
}
