package programmers.level01;

import java.util.Arrays;
import java.util.Collections;

//프로그래머스 > Level 01 > 정수 내림차순으로 배치하기
public class Q35 {
    String res = "";

    //람다식으로 푼 것
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    public long solution(long n) {

        String[] arr = Long.toString(n).split("");
        String s = "";

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }

        return Long.parseLong(s);
    }
    public static void main(String[] args) {

        Q35 sol = new Q35();

        int n = 118372;
        System.out.println(sol.solution(n));

    }
}