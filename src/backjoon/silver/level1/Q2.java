package backjoon.silver.level1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//백준 > 실버5 > 수 정렬하기2
public class Q2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int max = in.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        while (set.size() < max) {
            int num = in.nextInt();
            set.add(num);
        }

        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
