package backjoon.silver.level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 > 실버5 > 카드1
public class Q13_2161 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 1;

        while (!queue.isEmpty()) {
            if (cnt % 2 == 1) {
                sb.append(queue.poll()).append(" ");
            } else {
                queue.add(queue.poll());
            }
            cnt++;
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);

    }
}
