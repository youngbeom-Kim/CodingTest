package question12;

import java.util.Scanner;

//연산식을 입력받아 실제 연산을 하시오.
public class Test04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("입력 : ");

        String data = scan.nextLine();

        data = data.replace(" ", "");

        String fsnum = "";
        //48 ~ 57
        for (int i = 0; i < data.length(); i++) {
            char fcnum = data.charAt(i);
            if (fcnum >= 58 || fcnum <= 47) {
                break;
            }
            fsnum += fcnum;
        }

        String bsnum = "";
        for (int i = data.length() - 1; i >= 0; i--) {
            char bcnum = data.charAt(i);
            if (bcnum >= 58 || bcnum <= 47) {
                break;
            }
            bsnum += bcnum;
        }

        if (data.substring(0, fsnum.length()) == "" || data.substring(fsnum.length() + 1) == "") {
            System.out.println("피연산자가 부족합니다.");
            return;
        }

        int fnum = Integer.parseInt(fsnum);
        int bnum = Integer.parseInt(bsnum);

        int sum = 0;

        if (data.indexOf("+") > -1) {
            sum = fnum + bnum;
            System.out.printf("%d + %d = %d", fnum, bnum, sum);
        } else if (data.indexOf("-") > -1) {
            sum = fnum - bnum;
            System.out.printf("%d - %d = %d", fnum, bnum, sum);
        } else if (data.indexOf("*") > -1) {
            sum = fnum * bnum;
            System.out.printf("%d * %d = %d", fnum, bnum, sum);
        } else if (data.indexOf("/") > -1) {
            sum = fnum / bnum;
            System.out.printf("%d / %d = %d", fnum, bnum, sum);
        } else if (data.indexOf("%") > -1) {
            sum = fnum % bnum;
            System.out.printf("%d %% %d = %d", fnum, bnum, sum);
        } else {
            System.out.println("연산자가 올바르지 않습니다.");
            return;
        }

    }
}
