package question.question11;

import java.util.Scanner;

//난수로 채워진 배열에서 첫번째 방부터 연속으로 2개씩 더한 결과를 출력하시오.
//난수 범위 : 1 ~ 10이내
public class Test04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("배열의 길이 : ");
        int num = scan.nextInt();

        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {

            nums[i] = (int)(Math.random() * 10 + 1);
        }

        rand(nums);
        add(nums);

    }

    private static void add(int[] nums) {

        String str = "result = [ ";
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            i++;
            int b = nums[i];
            sum = a + b;
            str += sum;
            if (i == nums.length - 1) {
                str += " ]";
                break;
            }
            str += ", ";

        }

        System.out.println(str);

    }

    private static void rand(int[] nums) {

        String str = "nums = [ ";

        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
            if (i == nums.length - 1) {
                str += " ]";
                break;
            }
            str += ", ";
        }

        System.out.println(str);

    }
}
