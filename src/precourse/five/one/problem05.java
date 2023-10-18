package precourse.five.one;

import java.util.Arrays;
import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int money = in.nextInt();

        System.out.println(Arrays.toString(solution(money)));
    }

    private static int[] solution(int money) {

        //각 자리 금액 넣기
        int[] result = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < result.length; i++) {
            //금액 값 저장
            int check = result[i];
            //그 금액보다 높을 경우 계산
            if (money >= check) {
                //금액 자리에 몇 장들어가는지
                result[i] = money / check;
                //나머지 금액 체크
                money = money % check;
            } else {
                //그 금액보다 낮을 경우 지폐 갯수 0개
                result[i] = 0;
            }
        }

        return result;
    }
}
