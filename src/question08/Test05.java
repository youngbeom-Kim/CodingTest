package question08;

import java.util.Scanner;

//*을 이용하여 트리모양을 출력하시오.
//행의 갯수를 입력받으시오.
public class Test05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("행의 갯수 : ");
        int row = scan.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
