package backjoon.silver.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 > 실버 5 > 덩치(7568번)

/*
    입력 값
    5
    55 185
    58 183
    88 186
    60 175
    46 155
*/
public class Q15_7568 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 처음에 받아오는 값 N
        int N = Integer.parseInt(br.readLine());
        // 이중 배열 처리
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            arr[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            // 가장 높은 덩치를 1로 처리
            int rank = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue; // 같은 번호의 덩치는 continue 처리
                // 본인의 몸무게와 키보다 큰 덩치가 있다면 순위를 +1 처리 그 외에는 동일한 순위로 처리
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.print(sb);
    }
}
