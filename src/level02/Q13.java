package level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//프로그래머스 > Level02 > 카펫
public class Q13 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        //공약수 배열 + 공약수 담기
        int sum = brown + yellow;
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                arr.add(i);
            }
        }

        //규칙성 (Yellow가 두 공약수 값의 - 2를 하고 곱했을때 같으면 정답)
        for (int i = 0; i < arr.size(); i++) {
            int color = (arr.get(i) - 2) * (arr.get(arr.size() - i - 1) - 2);
            if (color == yellow) {
                answer[0] = arr.get(i);
                answer[1] = arr.get(arr.size() - i - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q13 sol = new Q13();

        int brown = 10;
        int yellow = 2;
        System.out.println(Arrays.toString(sol.solution(brown, yellow)));
        //1, 2, 3, 4, 6, 12

        int brown2 = 8;
        int yellow2 = 1;
        System.out.println(Arrays.toString(sol.solution(brown2, yellow2)));
        //1, 3, 9

        int brown3 = 24;
        int yellow3 = 24;
        System.out.println(Arrays.toString(sol.solution(brown3, yellow3)));
        //1, 2, 3, 4, 6, 8, 12, 16, 24, 48

        int brown4 = 50;
        int yellow4 = 22;
        System.out.println(Arrays.toString(sol.solution(brown4, yellow4)));
        //1, 2, 3, 4, 6, 8, 9, 12, 18, 24, 36, 72

    }

}
