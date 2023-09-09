package question.question12;

import java.util.Scanner;

//입력받은 금액을 한글로 출력하시오.
//금액 최대 자릿수 : 5자리
public class Test03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("금액(원) : ");

        String num = scan.nextLine();

        String str = "";

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == '1') {
                str += "일";
            } else if (c == '2') {
                str += "이";
            } else if (c == '3') {
                str += "삼";
            } else if (c == '4') {
                str += "사";
            } else if (c == '5') {
                str += "오";
            } else if (c == '6') {
                str += "육";
            } else if (c == '7') {
                str += "칠";
            } else if (c == '8') {
                str += "팔";
            } else if (c == '9') {
                str += "구";
            } else if (c == '0') {
                str += "영";
            }
        }

        String money = "";

        if (str.length() == 1) {
            money = str.charAt(0) + "원";
        } else if (str.length() == 2) {
            money = str.charAt(0) + "십" + str.charAt(1) + "원";
        } else if (str.length() == 3) {
            money = str.charAt(0) + "백" + str.charAt(1) + "십" + str.charAt(2) + "원";
        } else if (str.length() == 4) {
            money = str.charAt(0) + "천" + str.charAt(1) + "백" + str.charAt(2) + "십" + str.charAt(3) + "원";
        } else if (str.length() == 5) {
            money = str.charAt(0) + "만" + str.charAt(1) + "천" + str.charAt(2) + "백" + str.charAt(3) + "십" + str.charAt(4) + "원";
        } else {
            System.out.println("금액 초과");
        }

        money = money.replace("영", "");
        money = money.replace("일십", "십");
        money = money.replace("일백", "백");
        money = money.replace("일천", "천");
        money = money.replace("일만", "만");
        money = money.replace("천십", "천");
        money = money.replace("천백", "천");
        money = money.replace("천백십", "천");
        money = money.replace("만천", "만");
        money = money.replace("만천백", "만");
        money = money.replace("만천백십", "만");

        System.out.println(money);

    }
}
