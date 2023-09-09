package question.question06;

import java.util.Scanner;

//숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
//천단위 출력하시오.
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
