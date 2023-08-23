package backjoon.silver.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//백준 > 실버5 > 점수 계산 (2822번)
public class Q09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total = 0;

        int[] arr = new int[8];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int score = in.nextInt();
            arr[i] = score;
        }

        while (list.size() < 5) {
            int max = 0;

            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
                if (i == arr.length - 1) {
                    total += max;
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == max) {
                            list.add(j + 1);
                            arr[j] = 0;
                            break;
                        }
                    }
                }
            }
        }

        Collections.sort(list);

        System.out.println(total);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(" ");
            }
        }

    }
}
