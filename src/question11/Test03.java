package question11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
//
public class Test03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("학생 수 : ");
        int count = scan.nextInt();

        String[] names = new String[count];

        for (int i = 0; i < count; i++) {

            System.out.print("학생명 : ");

            String name = scan.next();

            names[i] = name;

        }

        System.out.println();
        System.out.printf("입력한 학생은 총 %d입니다.\n", count);

        int n = 1;

        for (int i = names.length - 1; i >= 0; i--) {

            System.out.printf("%d. %s\n", n, names[i]);
            n++;

        }

    }
}
