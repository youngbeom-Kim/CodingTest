package question07;

import java.util.Scanner;

//최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
//9자리가 넘어가면 동작 금지
//9자리 이하는 동작 가능
public class Test04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //9자리 이하의숫자 입력
        System.out.print("숫자 입력 : ");
        int num = scan.nextInt();

        //몇자리 수인지 체크
        int length = (int) (Math.log10(num) + 1);

        //짝수와 홀수의 합을 넣을 데이터
        int even = 0;
        int odd = 0;

        //9자리 이하의 숫자만 동작 가능
        if (length < 10) {

            for (int i=length; i>=0; i--) {

                int a = (int) (num / Math.pow(10, i));

                if (a % 2 == 0) {
                    even += a;
                    num -= a * Math.pow(10, i);
                } else if (a % 2 == 1) {
                    odd += a;
                    num -= a * Math.pow(10, i);
                }
            }

            System.out.println("짝수의 합 : " + even);
            System.out.println("홀수의 합 : " + odd);

        } else {
            System.out.println("9자리 이하만 동작 가능");
        }

    }
}
