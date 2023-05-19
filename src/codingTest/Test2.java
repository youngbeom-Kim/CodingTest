package codingTest;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public long solution(int a, int b, int[][] numbers) {
        long answer = 0;

        Map<Integer, Integer> home = new HashMap<>();
        Map<Integer, Integer> company = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            if (home.get(numbers[i][0]) == null) {
                home.put(numbers[i][0], 1);
            } else {
                home.put(numbers[i][0], home.get(numbers[i][0]) + 1);
            }

            if (company.get(numbers[i][1]) == null) {
                company.put(numbers[i][1], 1);
            } else {
                company.put(numbers[i][1], company.get(numbers[i][1]) + 1);
            }

        }

        System.out.println(home);
        System.out.println(company);

        return answer;
    }
    public static void main(String[] args) {

        Test2 sol = new Test2();

        int a = 2;
        int b = 3;
        int[][] numbers = {{1, 1}, {1, 2}, {2, 3}};
        //System.out.println(sol.solution(a, b, numbers));

        int a2 = 5;
        int b2 = 5;
        int[][] numbers2 = {{3, 1}, {2, 5}, {3, 2}, {1, 2}, {1, 2}, {4, 3}};
        System.out.println(sol.solution(a2, b2, numbers2));

    }
}
