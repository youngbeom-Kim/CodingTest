package question.question08;

import java.util.Scanner;

//*으로 역직각삼각형을 만드시오.
//행의 갯수를 입력받으시오.
public class Test03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("행의 갯수 : ");
        int row = scan.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
