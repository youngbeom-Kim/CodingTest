package question.question06;

import java.util.Scanner;

//숫자 2개를 입력 받아 시작 숫자에서 종료 숫자까지 1씩 증가하며 출력하시오.
public class Test02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("시작 숫자 : ");

        int a = scan.nextInt();

        System.out.print("종료 숫자 : ");

        int b = scan.nextInt();

        System.out.print("증가 숫자 : ");

        int c = scan.nextInt();

        for (int i = a; i <= b; i += c) {
            System.out.println(i);
        }

    }
}
