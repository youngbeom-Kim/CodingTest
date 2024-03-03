package backjoon.silver.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 > 실버5 > 집합
public class Q14_11723 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[21];

        while(M-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("add")) {

                arr[Integer.parseInt(st.nextToken())] = 1;

            } else if (command.equals("check")) {

                if (arr[Integer.parseInt(st.nextToken())] == 1) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }

            } else if (command.equals("remove")) {

                arr[Integer.parseInt(st.nextToken())] = 0;

            } else if (command.equals("toggle")) {

                int num = Integer.parseInt(st.nextToken());

                if (arr[num] == 1) {
                    arr[num] = 0;
                } else {
                    arr[num] = 1;
                }

            } else if (command.equals("all")) {

                Arrays.fill(arr, 1);

            } else {

                Arrays.fill(arr, 0);

            }
        }

        System.out.println(sb);
    }
}
