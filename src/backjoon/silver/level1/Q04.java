package backjoon.silver.level1;

import java.util.Arrays;
import java.util.Scanner;

//백준 > 실버5 > 좌표 정렬
public class Q04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int[][] arr = new int[num][2];

        for (int i = 0; i < num; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
