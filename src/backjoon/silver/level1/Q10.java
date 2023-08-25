package backjoon.silver.level1;

import java.util.Scanner;

//백준 > 실버5 > 창문 닫기 (13909번)
public class Q10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int[] nums = new int[num + 1];

        for (int i = 2; i < nums.length; i++) {
            int cnt = 1;
            while (i * cnt < nums.length) {
                nums[i * cnt]++;
                cnt++;
            }
        }

        int total = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                total++;
            }
        }

        System.out.println(total);

    }
}
