package question07;

import java.util.Scanner;

//사용자가 입력한 범위의 숫자까지 369 게임의 결과를 출력하시오.
//최대 3자리까지만 입력하시오.
public class Test01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("최대 숫자 : ");

        int count = scan.nextInt();

        String str = "";

        for (int i=1; i<=count; i++) {
            if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
                str += "짝 ";
            } else if (i /*여기*/ == 2) {
                str += "짝짝 ";
            } else {
                str += i + " ";
            }
        }

        System.out.println(str);

    }
}
