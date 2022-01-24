package question09;

public class Test01 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) {
                System.out.print((char)(96 + m));
            }

            for (int m = 1; m <= i; m++) {
                System.out.print((char)(i + 97 - m));
            }

            System.out.println();

        }

    }
}
