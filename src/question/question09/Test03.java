package question.question09;

public class Test03 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (i % 10 == 0) {
                System.out.printf("1 ~ %3d : %d\n", i, sum);
            }
        }

    }
}
