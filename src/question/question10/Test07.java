package question.question10;

import java.util.Scanner;

//영어 단어를 1개 입력받아 대문자가 있으면 단어 사이에 공백을 추가하시오.
public class Test07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("단어 : ");

        String str = scan.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char a = str.charAt(i);

            if (i == 0) {
                result += a;
            } else if (a >= 65 && a <= 90) {
                result += " ";
                result += a;
            } else {
                result += a;
            }

        }

        System.out.printf("결과 : %s", result);


    }
}
