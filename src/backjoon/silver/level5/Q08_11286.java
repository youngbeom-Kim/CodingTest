package backjoon.silver.level5;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//백준 > 실버1 > 절댓값 힙(11286번)
public class Q08_11286 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        StringBuilder sb = new StringBuilder();

        Queue<Integer> qu = new PriorityQueue<>((o1, o2) -> {
           if (Math.abs(o1) == Math.abs(o2)) {
               return o1 - o2;
           }
           return Math.abs(o1) - Math.abs(o2);
        });

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();

            if (x != 0) {
                qu.add(x);
            } else {
                if (qu.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(qu.poll()).append("\n");
                }
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
