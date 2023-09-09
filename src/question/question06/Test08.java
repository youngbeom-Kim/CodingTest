package question.question06;

import java.util.Scanner;

//누적값이 넘어가는 순간 루프를 종료하시오.
//1부터 더한 누적값을 사용자가 입력할 수 있도록 하십시오.
public class Test08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("누적값 : ");

        int end = scan.nextInt();

        String str = "";
        int sum = 0;

        for (int i=1;;i++) {
            sum += i;
            str += i;
            if (sum >= end) {
                str += " = ";
                break;
            }
            str += " + ";
        }

        System.out.println(str + sum);

    }
}
