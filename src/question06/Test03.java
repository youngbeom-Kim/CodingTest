package question06;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 : ");

        int num = scan.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {
            sum += i;
        }

        System.out.printf("1 ~ %d = %d", num, sum);

    }
}
