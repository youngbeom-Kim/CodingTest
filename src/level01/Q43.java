package level01;

import java.util.Arrays;

//프로그래머스 > Level01 > 행렬의 덧셈
public class Q43 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q43 sol = new Q43();

        int[][] arr1 = {{1, 2},{2, 3}};
        int[][] arr2 = {{3, 4},{5, 6}};
        System.out.println(Arrays.toString(sol.solution(arr1, arr2)));

        int[][] arr12 = {{1},{2}};
        int[][] arr22 = {{3},{4}};
        System.out.println(Arrays.toString(sol.solution(arr12, arr22)));

    }
}
