package question.question10;

import java.util.Scanner;

//이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
public class Test02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("이메일 : ");

        String email = scan.nextLine();

        //@를 찾아서 앞에는 id, 뒤에는 domain
        String id = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.length());

        System.out.println();
        System.out.println("아이디 : " + id);
        System.out.println("도메인 : " + domain);

    }
}
