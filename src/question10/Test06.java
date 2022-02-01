package question10;

//주어진 문자열에서 (사이의)공백을 제거 후 출력하시오
public class Test06 {

    public static void main(String[] args) {

        String str = "   하나   둘   셋   ";

        System.out.printf("원본 문자열 : \"%s\"\n", str);

        int front = 0;
        int back = 0;

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            front++;
            if (a != ' ') {
                break;
            }
        }

        for (int i = str.length(); i > 0; i--) {
            char b = str.charAt(i - 1);
            back++;
            if (b != ' ') {
                break;
            }
        }

        System.out.printf("결과 문자열 : \"");
        for (int i = 0; i < front - 1; i++) {
            System.out.print(" ");
        }
        System.out.print(str.replace(" ", ""));
        for (int i = 0; i < back - 1; i++) {
            System.out.print(" ");
        }
        System.out.printf("\"");

    }
}
