package codingTest;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public long solution(int a, int b, int[][] numbers) {
        long answer = 0;

        Map<Integer, Integer> home = new HashMap<>();
        Map<Integer, Integer> company = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

        }

        return answer;
    }
    public static void main(String[] args) {

        Test2 sol = new Test2();

        int a = 2;
        int b = 3;
        int[][] numbers = {{1, 1}, {1, 2}, {2, 3}};
        System.out.println(sol.solution(a, b, numbers));

        int a2 = 5;
        int b2 = 5;
        int[][] numbers2 = {{3, 1}, {2, 5}, {3, 2}, {1, 2}, {1, 2}, {4, 3}};
        System.out.println(sol.solution(a2, b2, numbers2));

    }
}
