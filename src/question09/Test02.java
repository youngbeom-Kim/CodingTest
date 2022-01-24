package question09;

//구구단을 출력하시오.
public class Test02 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d x %d = %2d ", j, i, i*j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf("%d x %d = %2d ", j, i, i*j);
            }
            System.out.println();
        }

    }
}
