package question.question07;

//1 + 2 + 4 + 7 + 11 + 16 + ... + N = 469 이러한 식을 출력하시오.
//N이 100을 넘기 전까지 출력하시오.
public class Test05 {

    public static void main(String[] args) {

        int num = 1;
        int result = 0;
        String str = "";

        for (int i=1;; i++) {

            //100이 넘기전의 숫자를 넣기
            if (num < 100) {
                result += num;
                str += num;
                num += i;
            }

            //100이 넘으면 중단
            if (num > 100) {
                break;
            }

            // + 문구 넣기
            str += " + ";

        }

        System.out.println(str + " = " + result);

    }
}
