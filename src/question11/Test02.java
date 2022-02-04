package question11;

import java.util.Scanner;

//숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
public class Test02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {

            System.out.print("숫자 : ");
            int num = scan.nextInt();

            list[i] = num;

        }

        for (int i = list.length - 1; i >= 0; i--) {

            System.out.printf("nums[%d] = %d\n", i, list[i]);

        }

    }
}
