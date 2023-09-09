package question.question12;

import java.util.Scanner;

//입력받은 문장에서 숫자들을 찾아 그 합을 구하시오.
//연속된 숫자는 1자리씩 더할 것.
public class Test02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("입력 : ");
        String str = scan.nextLine();

        int count = 0;

        //48 = 0, 57 = 9
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 47 && c <= 57) {
                count += c - 48;
            }

        }

        System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", count);



    }
}
