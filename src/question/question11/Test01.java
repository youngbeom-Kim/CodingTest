package question.question11;

//1차원 int 배열을 매개변수로 해서 내용을 문자열로 변환하는 dump 메소드를 구현하시오.
public class Test01 {

    public static void main(String[] args) {

        int[] list = new int[4];
        list[0] = 10;
        list[1] = 20;
        list[2] = 30;
        list[3] = 40;
        String result = dump(list);

        System.out.printf("nums = %s\n", result);

    }

    private static String dump(int[] list) {

        String str = "[ ";

        for (int i = 0; i < list.length; i++) {
            str += list[i];
            if (i == list.length - 1) {
                break;
            }
            str += ",";
        }
        str += " ]";

        return str;

    }
}
