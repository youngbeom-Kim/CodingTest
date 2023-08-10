package backjoon.silver.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//백준 > 실버5 > 수 정렬하기2
public class Q02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int max = in.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        while (list.size() < max) {
            list.add(in.nextInt());
        }

        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append('\n');
        }
        System.out.println(sb);

    }
}
