package backjoon.silver.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

//백준 > 실버4 > 듣보잡
public class Q12_1764 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String listen = br.readLine();
            map.put(listen, 1);
        }

        for (int i = 0; i < M; i++) {
            String see = br.readLine();
            if (map.containsKey(see)) {
                list.add(see);
            }
        }

        Collections.sort(list);

        for (String name : list) {
            sb.append(name).append("\n");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.println(list.size());
        System.out.println(sb);
    }
}
