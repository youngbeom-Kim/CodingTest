package question.question13;

import java.util.Scanner;

//성적을 입력받아 10단위로 ■ 으로 표기하시오.
public class Test07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("국어 점수 : ");
        int kor = scan.nextInt();
        System.out.print("영어 점수 : ");
        int eng = scan.nextInt();
        System.out.print("수학 점수 : ");
        int math = scan.nextInt();

        System.out.println();

        String score[][] = new String[10][3];

        String square = "■";

        for (int i = score.length - 1; i >= 0; i--) {
            for (int j = 0; j < score[0].length; j++) {
                if (i >= (int)((100 - kor) / 10)) {
                    score[i][0] = square;
                } else {
                    score[i][0] = " ";
                }
                if (i >= (int)((100 - eng) / 10)) {
                    score[i][1] = square;
                } else {
                    score[i][1] = " ";
                }
                if (i >= (int)((100 - math) / 10)) {
                    score[i][2] = square;
                } else {
                    score[i][2] = " ";
                }
            }
        }


        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[0].length; j++) {
                System.out.printf("%5s", score[i][j]);
            }
            System.out.println();
        }

        System.out.println("   -------------");
        System.out.println("   국어  영어  수학");

    }
}
