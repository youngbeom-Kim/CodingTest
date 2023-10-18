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

        //A = 65, Z = 90, a = 97, z = 122
        //I = 73, R = 82 (ex > 65(A) + (90(Z) - 73(I)) = 65 + 17 = 82(R))
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char) ('A' + ('Z' - c));
            if (c >= 'a' && c <= 'z') c = (char) ('a' + ('z' - c));
            s += c;
        }

        return s;
    }
}
