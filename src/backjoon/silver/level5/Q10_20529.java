package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10_20529 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int N = Integer.parseInt(br.readLine());

            if (N > 32) {
                sb.append(0).append("\n");
                continue;
            }

            String[] mbti = new String[N];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                mbti[i] = st.nextToken();
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < mbti.length; i++) {
                for (int j = i + 1; j < mbti.length; j++) {
                    for (int k = j + 1; k < mbti.length; k++) {
                        int cnt = 0;
                        for (int m = 0; m < 4; m++) {
                            if (mbti[i].charAt(m) != mbti[j].charAt(m)) cnt++;
                            if (mbti[i].charAt(m) != mbti[k].charAt(m)) cnt++;
                            if (mbti[j].charAt(m) != mbti[k].charAt(m)) cnt++;
                        }

                        min = Math.min(cnt, min);
                    }
                }
            }

            sb.append(min).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
    }
}
