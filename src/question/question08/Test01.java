package question.question08;

public class Test01 {

    //for문
    public static void main(String[] args) {

        for (int i=1; i <= 5; i++) {
            for (int j=1; j <= 5; j++) {
                if (i <= j) {
                    System.out.println("i : " + i + ",j : " + j);
                }
            }
        }
    }
}
