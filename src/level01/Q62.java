package level01;

import java.util.Arrays;

public class Q62 {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};

        //문자열 배열 합치기
        String parks = String.join("", park);
        //시작점
        int start = parks.indexOf("S");
        //남 북 이동 거리
        int cnt = park[0].length();

        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String dir = route[0];
            int dis = Integer.valueOf(route[1]);

            //거리 이동
            if (dir.equals("E")) {

            } else if (dir.equals("W")) {

            } else if (dir.equals("N")) {

            } else if (dir.equals("S")) {

            }
        }

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
