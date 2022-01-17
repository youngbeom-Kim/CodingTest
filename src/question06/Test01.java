package question06;

import java.util.Scanner;

//사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
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
