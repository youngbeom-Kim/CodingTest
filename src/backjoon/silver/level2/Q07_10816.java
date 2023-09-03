package backjoon.silver.level2;

import java.util.HashMap;
import java.util.Scanner;

//백준 > 실버4 > 숫자 카드 2 (10816번)
public class Q07_10816 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int having = in.nextInt();
            if (map.get(having) == null) {
                map.put(having, 1);
            } else {
                map.put(having, map.get(having) + 1);
            }
        }

        int M = in.nextInt();

        int[] arr = new int[M];

        for (int i = 0; i < M; i++) {
            int check = in.nextInt();
            if (map.get(check) == null) {
                arr[i] = 0;
            } else {
                arr[i] = map.get(check);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i == arr.length - 1) {
                break;
            }
            System.out.print(" ");
        }
    }
}
