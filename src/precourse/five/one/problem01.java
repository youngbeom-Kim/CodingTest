package precourse.five.one;

import java.util.Scanner;

public class problem01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] pobi = new int[2];
        int[] crong = new int[2];

        //포비 페이지 값 입력
        for (int i = 0; i < pobi.length; i++) {
            pobi[i] = in.nextInt();
        }

        //크롱 페이지 값 입력
        for (int i = 0; i < crong.length; i++) {
            crong[i] = in.nextInt();
        }

        System.out.println(solution(pobi, crong));
    }

    private static int solution(int[] pobi, int[] crong) {

        // 왼쪽 페이지는 짝수일 수 없고, 오른쪽 페이지는 홀수일 수 없다.
        // 오른쪽 페이지는 왼쪽 페이지의 +1 이여야 한다.
        // 첫 번째 페이지와 마지막 페이지는 존재할 수 없다.
        if (pobi[0] % 2 == 0 || crong[0] % 2 == 0 || pobi[1] % 2 == 1 || crong[1] % 2 == 1 ||
            pobi[1] != pobi[0] + 1 || crong[1] != crong[0] + 1 ||
            pobi[0] == 1 || crong[0] == 1 || pobi[1] == 400 || crong[1] == 400) return -1;

        // 왼쪽 페이지의 큰 값과 오른쪽 페이지의 큰 값 중 최대 값 구하기
        int pMax = Math.max(comp(pobi[0]), comp(pobi[1]));
        int cMax = Math.max(comp(crong[0]), comp(crong[1]));

        // 같다면 0으로 return
        if (pMax == cMax) return 0;

        // 포비가 크다면 1, 크롱이 크다면 2
        return pMax > cMax ? 1 : 2;
    }

    private static int comp(int num) {

        // String으로 변환
        String sNum = String.valueOf(num);

        // 페이지 더한 값
        int nAdd = 0;
        // 페이지 곱한 값
        int nPro = 1;

        // 자릿수로 나눈 값을 더하고 곱하기
        for (int i = 0; i < sNum.length(); i++) {
            nAdd += Integer.parseInt(sNum.split("")[i]);
            nPro *= Integer.parseInt(sNum.split("")[i]);
        }

        // 둘 중 큰 값 반환
        return Math.max(nAdd, nPro);

    }
}
