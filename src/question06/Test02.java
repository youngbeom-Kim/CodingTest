package question06;

import java.util.Scanner;

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
