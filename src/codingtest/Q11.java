package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//프로그래머스 > 두 개 뽑아서 더하기
public class Q11 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j)
                list.add(numbers[i] + numbers[j]);
            }
        }

        List<Integer> resultList = new ArrayList<Integer>();

        resultList = list.stream().distinct().collect(Collectors.toList());

        answer = new int[resultList.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {

        Q11 sol = new Q11();

        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(sol.solution(numbers)));

        int[] numbers2 = {5, 0, 2, 7};
        System.out.println(Arrays.toString(sol.solution(numbers2)));

    }
}
