package backjoon.silver.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//백준 > 실버4 > 카드2(2164번)
public class Q16_2164 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(queue.size() != 1) {
            queue.poll();
            if (queue.size() == 1) break;
            queue.add(queue.poll());
        }

        System.out.println(queue.peek());
    }
}
