package question.question06;

import java.util.Scanner;

//숫자 10개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
//천단위 출력하시오.
//입력받을 숫자의 개수도 입력받으시오.
public class Test04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        System.out.print("입력할 숫자 갯수 : ");

        int count = scan.nextInt();

        for (int i=0; i < count; i++) {

            System.out.print("숫자 : ");

            int num = scan.nextInt();

            if (num % 2 == 0) {
                even += num;
            }
            if (num % 2 == 1) {
                odd += num;
            }
        }

        System.out.println();
        System.out.printf("짝수의 합 : %d%n", even);
        System.out.printf("홀수의 합 : %d", odd);

    }
}
