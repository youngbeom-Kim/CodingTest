package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//프로그래머스 > Level 01 > 바탕화면 정리
public class Q61 {
    public int[] solution(String[] wallpaper) {

        List<Integer> lux = new ArrayList<>();
        List<Integer> luy = new ArrayList<>();
        List<Integer> rux = new ArrayList<>();
        List<Integer> ruy = new ArrayList<>();

        for (int i = 0; i < wallpaper.length; i++) {
            int lFile = wallpaper[i].indexOf("#");
            int rFile = wallpaper[i].lastIndexOf("#");
            if (lFile >= 0) {
                lux.add(i);
                luy.add(lFile);
            }
            if (rFile >= 0) {
                rux.add(i);
                ruy.add(rFile);
            }
        }

        Collections.sort(lux);
        Collections.sort(luy);
        Collections.sort(rux, Collections.reverseOrder());
        Collections.sort(ruy, Collections.reverseOrder());

        int[] answer = new int[]{lux.get(0), luy.get(0), rux.get(0) + 1, ruy.get(0) + 1};

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
