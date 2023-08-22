package backjoon.silver.level1;

import java.util.*;

//백준 > 실버5 > 스네이크버드 (16435번)
public class Q08 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int L = in.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            queue.add(in.nextInt());
        }

        while (queue.poll() <= L) {
            L++;
            if (queue.peek() == null) {
                break;
            }
        }

        System.out.println(L);

    }
}
