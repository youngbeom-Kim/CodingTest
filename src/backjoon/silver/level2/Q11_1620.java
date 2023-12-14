package backjoon.silver.level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//백준 > 실버4 > 나는야 포켓몬 마스터 이다솜(1620번)
public class Q11_1620 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> type1 = new HashMap<>();
        HashMap<String, Integer> type2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String monster = br.readLine();
            type1.put(i, monster);
            type2.put(monster, i);
        }

        for (int i = 0; i < M; i++) {
            String Q = br.readLine();
            if (Q.charAt(0) >= '0' && Q.charAt(0) <= '9') {
                sb.append(type1.get(Integer.parseInt(Q)));
                sb.append("\n");
            } else {
                sb.append(type2.get(Q));
                sb.append("\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
