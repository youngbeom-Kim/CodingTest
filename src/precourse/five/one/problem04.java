package precourse.five.one;

import java.util.Scanner;

public class problem04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(solution(word));

    }

    private static String solution(String word) {

        String s = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char) ('A' + ('Z' - c));
            if (c >= 'a' && c <= 'z') c = (char) ('a' + ('z' - c));
            s += c;
        }

        return s;
    }
}
