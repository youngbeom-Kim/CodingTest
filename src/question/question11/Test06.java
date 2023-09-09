package question.question11;

import java.util.Scanner;

//1 ~ 20 사이의 난수를 20개 답고 있는 배열을 생성한 뒤 배열을 탐색하여 범위에 만족하는 숫자만 출력하시오.
//난수를 20개 발생 후 배열에 넣는다.
//난수는 1 ~ 20 사이
public class Test06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 20 + 1);
        }

        System.out.print("최대 범위 : ");
        int max = scan.nextInt();

        System.out.print("최소 범위 : ");
        int min = scan.nextInt();

        String str = "";

        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
            if (i == nums.length - 1) {
                break;
            }
            str += ", ";
        }

        System.out.println("원본 : " + str);

        String result = "";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min && nums[i] < max) {
                result += nums[i];
                if (i == nums.length) {
                    break;
                }
                result += ", ";
            }

        }

        System.out.println("결과 : " + result);














    }
}
