package backjoon.silver.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//백준 > 실버1 > 정수 삼각형(1932번)
public class Q12_1932 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int[] arr = new int[i];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            list.add(arr);
        }

        for (int i = list.size() - 1; i > 0; i--) {
            int[] now = list.get(i);
            int[] pre = list.get(i - 1);
            for (int j = 0; j < now.length - 1; j++) {
                pre[j] = Math.max(now[j] + pre[j], now[j + 1] + pre[j]);
            }
        }

        System.out.println(list.get(0)[0]);
    }
}
