package programmers.level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Q63 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;

//        HashSet<Integer> set = new HashSet<>();
//
//        for (int i = 1; i <= n; i++) {
//            set.add(i);
//        }
//
//        for (int i = 0; i < section.length; i++) {
//            set.remove(section[i]);
//        }

        ArrayList<Integer> list = Arrays.stream(section)
                                        .boxed()
                                        .collect(Collectors.toCollection(ArrayList::new));

        int[] count = new int[m];
        int cnt = 0;

        while (section.length != 0) {
            for (int i = 0; i < m; i++) {
                count[i] = Collections.min(list) + i;
            }

            for (int i = 0; i < count.length; i++) {
                if (count[i] <= n && list.contains(count[i])) {
                    
                }
            }

            cnt++;

        }


        return answer;
    }

    public static void main(String[] args) {

        Q63 sol = new Q63();

        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(sol.solution(n, m , section));

        int n2 = 5;
        int m2 = 4;
        int[] section2 = {1, 3};
        System.out.println(sol.solution(n2, m2 , section2));

        int n3 = 4;
        int m3 = 1;
        int[] section3 = {1, 2, 3, 4};
        System.out.println(sol.solution(n3, m3, section3));

    }
}
