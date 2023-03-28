package level01;

import java.util.Arrays;

//프로그래머스 > Level 01 > 바탕화면 정리
public class Q61 {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {

        Q61 sol = new Q61();

        String[] wallpaper = {".#...", "..#..", "...#."};
        System.out.println(Arrays.toString(sol.solution(wallpaper)));

        String[] wallpaper2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(sol.solution(wallpaper2)));

        String[] wallpaper3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        System.out.println(Arrays.toString(sol.solution(wallpaper3)));

        String[] wallpaper4 = {"..", "#."};
        System.out.println(Arrays.toString(sol.solution(wallpaper4)));



    }
}
