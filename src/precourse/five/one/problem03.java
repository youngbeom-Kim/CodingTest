package precourse.five.one;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        System.out.println(solution(number));

    }

    private static int solution(int number) {

        int cnt = 0;

        for (int i = 1; i <= number; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
