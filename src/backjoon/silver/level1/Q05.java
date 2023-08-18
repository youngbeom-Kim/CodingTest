package backjoon.silver.level1;

import java.util.*;

//백준 > 실버 5 > 방 번호
public class Q05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        int num = in.nextInt();

        int length = (int) (Math.log10(num) + 1);

        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < length; i++) {
            String sNum = Integer.toString(num);
            char c = sNum.charAt(i);
            map.put(((int) c) - 48, map.get(((int) c) - 48) + 1);
        }

        Integer maxValue = Collections.max(map.values());

        if ((int) ((map.get(6) + map.get(9)) / 2) > maxValue) {
            System.out.println((int) ((map.get(6) + map.get(9)) / 2));
        } else {
            System.out.println(maxValue);
        }

    }
}
