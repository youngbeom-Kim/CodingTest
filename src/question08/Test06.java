package question08;

//*
// *
//  *
//   *
//    *
//위와 같이 출력하시오
public class Test06 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" ");
                if (j == i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
