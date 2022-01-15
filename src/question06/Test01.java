package question06;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;
        int num;

        System.out.print("이름 : ");

        name = scan.nextLine();

        System.out.print("횟수 : ");

        num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println(name + "님 안녕하세요~");
        }


    }
}
