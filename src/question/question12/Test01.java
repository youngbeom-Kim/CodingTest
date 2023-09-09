package question.question12;

import java.util.Scanner;

//금지어를 마스킹 처리 하시오.
//금지어 : 바보, 멍청이
public class Test01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("입력 : ");
        String data = scan.nextLine();

        String badword = "바보";
        String badword2 = "멍청이";

        int count = 0;

        for (int i = 0; i < data.length(); i++) {

            if (data.indexOf(badword, i) == i) {
                count++;
            }

            if (data.indexOf(badword2, i) == i) {
                count++;
            }
        }

        data = data.replace(badword, "**");
        data = data.replace(badword2, "***");

        System.out.println(data);
        System.out.printf("금지어를 %d회 마스킹했습니다." ,count);

    }
}
