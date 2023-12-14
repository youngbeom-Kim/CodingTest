package backjoon.silver.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

//백준 > 실버4 > 나는야 포켓몬 마스터 이다솜(1620번)
public class Q11_1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            list.add(Integer.parseInt(N.split(" ")[i]));
        }

        HashMap<String, String> map = new HashMap<>();

        for (int i = 1; i <= list.get(0); i++) {
            map.put(String.valueOf(i), br.readLine());
        }

        int cnt = list.get(1);

        while (cnt-- > 0) {
            String M = br.readLine();

            if (M.charAt(0) > 'A' && M.charAt(0) < 'Z') {
                for (Entry<String, String> entrySet : map.entrySet()) {

                    if (M.equals(entrySet.getValue())) {
                        System.out.println(entrySet.getKey());
                    }
                }
            } else {
                System.out.println(map.get(M));
            }
        }

    }
}
