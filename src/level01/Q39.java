package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//프로그래머스 > Level 01 > 나누어떨어지는숫자배열
public class Q39 {

    //람다식으로 푼 것
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }

    //내가 푼 것
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0 || divisor == 1) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        Collections.sort(list);

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Q39 sol = new Q39();

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(sol.solution(arr, divisor)));

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        System.out.println(Arrays.toString(sol.solution(arr2, divisor2)));

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;
        System.out.println(Arrays.toString(sol.solution(arr3, divisor3)));

    }
}