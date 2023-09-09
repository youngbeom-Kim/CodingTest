package question.question06;

import java.util.Scanner;

//문장을 여러줄 입력받아 출력하시오.
//아무것도 입력하지 않고 엔터를 치면 입력 종료를 하시오.
public class Test05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("아래에 입력하세요.");
        String str = "";

        for (int i=0;; i++) {

            String data = scan.nextLine();
            str += data + "\n";

            if (data.equals("")) {
                System.out.println(str);
                break;
            }

        }

    }
}
