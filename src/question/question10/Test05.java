package question.question10;

import java.util.Scanner;

//숫자를 입력받아 3자리마다 , 를 붙이시오.
//%.d 사용하지 말것
public class Test05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 : ");

        String num = scan.nextLine();
        String str = "";
        int count = 0;

        for (int i = num.length(); i > 0; i--) {

            char reverse = num.charAt(i - 1);
            str += reverse;
            count++;
            if (i == 1) {
                break;
            } else if (count % 3 == 0) {
                str += ",";
            }

        }

        for (int i = str.length(); i > 0; i--) {

            char rereverse = str.charAt(i - 1);

            System.out.print(rereverse);

        }

    }
}
