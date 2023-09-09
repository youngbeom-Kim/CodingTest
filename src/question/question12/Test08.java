package question.question12;

import java.util.Scanner;

//배열에 요소를 삭제하시오.
public class Test08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.print("삭제 위치 : ");
        int del = scan.nextInt();

        String str = "원본 : [";
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 5 + 1);
            str += nums[i];
            if (i == nums.length - 1) {
                str += "]";
                break;
            }
            str += ", ";
        }

        System.out.println(str);

        for (int i = del + 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = 0;

        String result = "결과 : [";
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
            if (i == nums.length - 1) {
                result += "]";
                break;
            }
            result += ", ";
        }

        System.out.println(result);

    }
}
