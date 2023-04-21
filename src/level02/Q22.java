package level02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//프로그래머스 > Level 02 > 구명보트
public class Q22 {
    public int solution(int[] people, int limit) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < people.length; i++) {
            list.add(people[i]);
        }

        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (people[i] + people[j] <= limit) {
                    set.add(people[i] + people[j]);
                    list.remove(j);
                    cnt++;
                }
            }
            if (people[i] <= limit && cnt == 0) {
                set.add(people[i]);
            }
        }

        return set.size();
    }

    public static void main(String[] args) {

        Q22 sol = new Q22();

        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(sol.solution(people, limit));

        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        System.out.println(sol.solution(people2, limit2));

    }
}
