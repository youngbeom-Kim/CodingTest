package question.question07;

import java.util.Scanner;

//숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
public class Test09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        int a = scan.nextInt();

        System.out.print("두번째 숫자 : ");
        int b = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (i == 1) {
                    System.out.printf("%d의 약수 : 1", a);
                } else {
                    System.out.printf(", %d", i);
                }

            }
        }

        System.out.println();

        for (int i = 1; i<=b; i++) {
            if (b % i == 0) {
                if (i == 1) {
                    System.out.printf("%d의 약수 : 1", b);
                } else {
                    System.out.printf(", %d", i);
                }
            }
        }

        System.out.println();

        int big = 0;

        if (a > b) {
            big = a;
        } else if (b > a) {
            big = b;
        }

        for (int i = 1; i <= big; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i == 1) {
                    System.out.printf("%d와 %d의 공약수 : 1", a, b);
                } else {
                    System.out.printf(", %d", i);
                }
            }
        }

    }
}
