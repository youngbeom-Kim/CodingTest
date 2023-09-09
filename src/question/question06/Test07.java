package question.question06;

import java.util.Scanner;

//시작/종료 숫자를 사용자에게 입력받아 출력하시오.
public class Test07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("시작 숫자 : ");
        int a = scan.nextInt();

        System.out.print("종료 숫자 : ");
        int b = scan.nextInt();

        String str = "";
        int sum = 0;

        for (int i = a; i <= b; i++) {

            str += i;

            if (i == b) {
                if (b % 2 == 0) {
                    sum -= i;
                }
                if (b % 2 == 1) {
                    sum += i;
                }
                str += " = ";
                break;
            }

            if (i % 2 == 0) {
                sum -= i;
                str += " + ";
            }
            if (i % 2 == 1) {
                sum += i;
                str += " - ";
            }

        }

        System.out.println(str + sum);

    }
}
