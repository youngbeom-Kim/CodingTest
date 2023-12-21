package backjoon.silver.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 > 실버2 > 잃어버린 괄호(1541번)
public class Q03_1541 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] subtraction = br.readLine().split("-");

        int result = 111111;

        for (int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            String[] addition = subtraction[i].split("\\+");

            for (int j = 0; j < addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            if (result == 111111) {
                result = temp;
            } else {
                result -= temp;
            }
        }

        System.out.println(result);

    }
}
