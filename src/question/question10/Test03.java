package question.question10;

import java.util.Scanner;

//숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
//산술연산자로 작성하지 마시오.
//문자열 추출메소드 사용
//자릿수의 길이 제한 없음.
public class Test03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //숫자 입력
        System.out.print("숫자 : ");
        String str = scan.nextLine();

        //결과 문장과 합
        String result = "";
        int sum = 0;

        //각각 문장의 숫자 구하기
        for (int i = 0; i < str.length(); i++) {

            char num = str.charAt(i);
            sum += num -  48;
            if (i == str.length() - 1) {
                result += num;
                break;
            }
            result += num + " + ";

        }

        System.out.println("결과 : " + result + " = " + sum);

    }
}
