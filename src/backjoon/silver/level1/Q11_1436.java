package backjoon.silver.level1;

import java.util.ArrayList;
import java.util.Scanner;

//백준 > 실버5 > 영화감독 숌
public class Q11_1436 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        ArrayList<Integer> list = new ArrayList();
        int number = 666;

        while (N > 0) {
            if (String.valueOf(number).contains("666")) {
                list.add(number);
                N--;
            }
            number++;
        }

        System.out.println(list.get(list.size() - 1));
    }
}
