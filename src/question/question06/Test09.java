package question.question06;

import java.util.Scanner;

//숫자를 N개를 입력받아 아래와 같이 출력하시오.
//누적값이 100을 넘어가는 순간 루프를 종료하시오.
//짝수는 더하고 홀수는 빼시오.
//루프를 종료할 누적값을 사용자가 입력할 수 있도록 하시오.
public class Test09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "";
        int sum = 0;

        System.out.print("누적값 : ");
        int end = scan.nextInt();

        for (int i=0;;i++) {

            System.out.print("숫자 : ");
            int num = scan.nextInt();

            if (i == 0) {
                if (num % 2 == 0) {
                    str += num;
                    sum += num;
                } else if (num % 2 == 1) {
                    str += "- " + num;
                    sum -= num;
                }
            } else if (num % 2 == 0) {
                str += " + " + num;
                sum += num;
            } else if (num % 2 == 1) {
                str += " - " + num;
                sum -= num;
            }

            if (sum >= end) {
                str += " = ";
                break;
            }

        }

        System.out.println(str + sum);

    }
}
