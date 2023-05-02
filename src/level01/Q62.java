package level01;

import java.util.Arrays;

public class Q62 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};


        return answer;
    }
    public static void main(String[] args) {

        Q62 sol = new Q62();

        String[] park = {"SOO", "OOO", "OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(sol.solution(park, routes)));

        String[] park2 = {"SOO", "OXX", "OOO"};
        String[] routes2 = {"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(sol.solution(park2, routes2)));

        String[] park3 = {"OSO","OOO","OXO","OOO"};
        String[] routes3 = {"E 2","S 3","W 1"};
        System.out.println(Arrays.toString(sol.solution(park3, routes3)));

    }
}
