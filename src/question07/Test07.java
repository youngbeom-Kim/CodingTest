package question07;

//2부터 100사이의 소수를 구하시오.
public class Test07 {

    public static void main(String[] args) {

        int prime = 0;

        for (int i=2; i<100; i++) {
            for (int j=2; j<=i; j++) {
                if (i % j == 0) {
                    prime++;
                }
            }

            if (prime == 1) {

                if (i == 2) {
                    System.out.print(i);
                } else {
                    System.out.print(", " + i);
                }

            }

            prime = 0;

        }

    }
}
