package backjoon.silver.level4;

import java.util.PriorityQueue;
import java.util.Scanner;

//백준 > 실버2 > 최소 힙 (1927번)
public class Q04_1927 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();

        PriorityQueue queue = new PriorityQueue();

        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            if (X == 0) {
                if (queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else {
                queue.add(X);
            }
        }

        System.out.print(sb);

    }
}
