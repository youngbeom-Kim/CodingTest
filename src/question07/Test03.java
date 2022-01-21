package question07;

import java.util.Scanner;

//컴퓨터가 1 ~ 10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
public class Test03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //난수 생성
        int rnd = (int) (Math.random() * 10) + 1;
        System.out.println("컴퓨터가 1 ~ 10 사이의 숫자를 1개 생각했습니다.");
        System.out.println();

        for (int i=1;; i++) {

            //숫자 맞추기
            System.out.print("숫자 : ");
            int num = scan.nextInt();

            //맞췄을 경우와 틀렸을 경우
            if (num == rnd) {
                System.out.println("맞췄습니다.");
                System.out.println();
                System.out.println("컴퓨터가 생각한 숫자는 " + num + "입니다.");
                System.out.println("정답을 맞추는데 시도한 횟수는 " + i + "입니다.");
                break;
            } else {
                System.out.println("틀렸습니다.");
                System.out.println();
            }

        }

        //프로그램 종료
        System.out.println("프로그램을 종료합니다.");



//        System.out.println(rnd);

    }
}
