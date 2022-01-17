package question06;

import java.util.Scanner;

//시작/종료 숫자를 사용자에게 입력받아 출력하시오.
public class Test06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("시작 숫자 : ");
        int a = scan.nextInt();

        System.out.print("종료 숫자 : ");
        int b = scan.nextInt();

        String str = "";
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
            str += i;
            if (i == b) {
                break;
            }
            str += " + ";
        }

        System.out.println(str + " = " + sum);

    }
}
