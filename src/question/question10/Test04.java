package question.question10;

import java.util.Scanner;

//파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오,
//확장자는 다음으로 제한한다. (gif, jpg, png, hwp, doc)
public class Test04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gif = 0;
        int jpg = 0;
        int png = 0;
        int hwp = 0;
        int doc = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("파일명 : ");

            String file = scan.nextLine();

            if (file.endsWith(".gif")) {
                gif++;
            } else if (file.endsWith(".jpg")) {
                jpg++;
            } else if (file.endsWith(".png")) {
                png++;
            } else if (file.endsWith(".hwp")) {
                hwp++;
            } else if (file.endsWith(".doc")) {
                doc++;
            }

        }

        System.out.printf("gif : %d개\n" ,gif);
        System.out.printf("jpg : %d개\n" ,jpg);
        System.out.printf("png : %d개\n" ,png);
        System.out.printf("hwp : %d개\n" ,hwp);
        System.out.printf("doc : %d개\n" ,doc);

    }
}
