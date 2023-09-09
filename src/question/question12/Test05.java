package question.question12;

import java.util.Scanner;

//문장에서 각 문자의 연속된 횟수를 알아내시오.
public class Test05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("입력 : ");
        String data = scan.nextLine();

        int count = 1;
        char c, c2 = 0;

        for (int i = 0; i < data.length(); i++) {
            c = data.charAt(i);

            if (i != data.length() - 1) {
                c2 = data.charAt(i + 1);
            } else {
                System.out.printf("'%s' : 발견횟수 %d회\n", c, count);
            }

            if (c == c2) {
                count++;
            } else {
                System.out.printf("'%s' : 발견횟수 %d회\n", c, count);
                count = 1;
            }
        }

    }
}
