package backjoon.silver.level1;

import java.util.*;

//백준 > 실버 5 > 방 번호
public class Q05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] nums = new int[10];

        for (char c : in.next().toCharArray()) {
            int num = c - '0';
            if (num == 9) {
                num= 6;
            }
            nums[num]++;
        }

        nums[6] = nums[6]/2 + nums[6]%2;

        Arrays.sort(nums);
        System.out.println(nums[9]);

    }
}
