package question07;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

//숫자를 10개 입력받아 한글로 변환 후 출력하시오.
//2자리 이상 숫자를 입력하면 결과없이 프로그램을 중지시키시오.
public class Test02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = "";

        for (int i=0; i<10; i++) {
            System.out.print("숫자 : ");

            int num = scan.nextInt();

            //0 또는 10 이상의 숫자가 들어가면 중단
            if (num <= 0 || num > 10) {
                System.out.println(num + " 숫자 입력 : 중단");
                break;
            }

            //한글 집어넣기
            switch (num) {
                case 1:
                    str += "일";
                    break;
                case 2:
                    str += "이";
                    break;
                case 3:
                    str += "삼";
                    break;
                case 4:
                    str += "사";
                    break;
                case 5:
                    str += "오";
                    break;
                case 6:
                    str += "육";
                    break;
                case 7:
                    str += "칠";
                    break;
                case 8:
                    str += "팔";
                    break;
                case 9:
                    str += "구";
                    break;

            }

        }

        System.out.println("결과 : " + str);

    }
}
