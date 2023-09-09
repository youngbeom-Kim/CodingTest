package question.question12;

import java.util.Scanner;

//배열에 요소를 삽입하시오.
public class Test07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];

        System.out.print("삽입 위치 : ");
        int add = scan.nextInt();

        System.out.print("값 : ");
        int num = scan.nextInt();

        String str = "원본 : [";
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 9 + 1);
            str += nums[i];
            if (i == nums.length - 1) {
                str += "]";
                break;
            }
            str += ", ";
        }

        for (int i = nums.length - 2; i >= add; i--) {
            nums[i+1] = nums[i];
        }

        nums[add] = num;

        String result = "결과 : [";
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
            if (i == nums.length - 1) {
                result += "]";
                break;
            }
            result += ", ";
        }

        System.out.println(str);
        System.out.println(result);

    }
}
