package question10;

import java.util.Scanner;

//문장을 입력받아 역순으로 출력하시오.
public class Test01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("문장 입력 : ");
        String str = scan.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >=0; i--) {

            reverse += str.charAt(i);

        }

        System.out.println(reverse);

    }
}
