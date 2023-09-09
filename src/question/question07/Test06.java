package question.question07;

//1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232 와 같이 출력하시오.
//N이 100이 넘기 전까지 출력하시오.
//한번더 확인 필수**
public class Test06 {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 0;
        int result = 0;
        String str = "";

        result += a;
        str += a;

        for (int i=0;; i++) {

            if (b < 100) {
                result += b;
                c = b;
                b = a + b;
                a = c;
                str += " + " + b;
            } else {
                break;
            }

        }

        System.out.println(str + " = " + result);

    }
}
