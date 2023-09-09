package question.question09;

public class Test04 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (i % 10 == 0) {
                System.out.printf("%2d ~ %3d : %d\n", i - 9, i, sum);
                sum = 0;
            }
        }

    }
}
