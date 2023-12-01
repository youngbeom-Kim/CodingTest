package backjoon.silver.level3;

import java.util.HashMap;
import java.util.Scanner;

//백준 > 실버3 > 패션왕 신해빈
public class Q09 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T-- > 0) {

            HashMap<String, Integer> clothes = new HashMap<>();

            int N = in.nextInt();

            while(N-- > 0) {

                in.next();

                String type = in.next();

                if (clothes.containsKey(type)) {
                    clothes.put(type, clothes.get(type) + 1);
                } else {
                    clothes.put(type, 1);
                }

            }

            int result = 1;

            for (int value : clothes.values()) {
                result *= value + 1;
            }

            System.out.println(result - 1);

        }

    }
}
