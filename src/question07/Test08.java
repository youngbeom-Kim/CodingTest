package question07;

//1부터 100사이의 완전수를 구하시오.
//완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
public class Test08 {

    public static void main(String[] args) {

        //출력값을 나타내는 반복문
        for (int i=1; i<100; i++) {

            if (m1(i) != 0) {

                System.out.printf("%d = [", m1(i));
                m2(i);
                System.out.print("]\n");

            }

        }

    }

    //완전수의 약수를 구하는 메소드
    private static void m2(int b) {
        for (int i=1; i<b; i++) {
            if (b % i == 0) {
                if (i == 1) {
                    System.out.print(i);
                } else {
                    System.out.printf(", %d", i);
                }
            }
        }
    }

    //앞의 완전수를 구하는 메소드
    private static int m1(int a) {

        int sum = 0;

        for (int i=1; i<a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }

        if (sum == a) {
            return a;
        }

        return 0;
    }
}
