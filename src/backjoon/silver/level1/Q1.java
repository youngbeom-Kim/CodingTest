package backjoon.silver.level1;

import java.util.Scanner;

//백준 > 실버5 > 분수 찾기
public class Q1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int in_num = in.nextInt();

        int cross_num = 1;
        int stack_num = 0;

        while (true) {

            if (in_num <= cross_num + stack_num) {

                int dif_num = in_num - stack_num;

                if (cross_num % 2 == 0) {
                    System.out.println(dif_num + "/" + (cross_num - (dif_num - 1)));
                    break;
                } else {
                    System.out.println((cross_num - (dif_num - 1)) + "/" + dif_num);
                    break;
                }

            } else {

                stack_num += cross_num;
                cross_num++;

            }

        }

    }
}
