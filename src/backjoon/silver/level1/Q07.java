package backjoon.silver.level1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 > 실버5 > 요세푸스 문제 0 (11866번)
public class Q07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int cnt = 1;

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            if (cnt == K) {
                sb.append(queue.poll());
                if (queue.size() > 0) {
                    sb.append(", ");
                }
                cnt = 1;
            } else {
                queue.add(queue.poll());
                cnt++;
            }
        }

        sb.append(">");

        System.out.println(sb);

    }
}
