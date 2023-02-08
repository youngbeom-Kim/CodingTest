package level01;

import java.util.HashSet;
import java.util.Set;

//프로그래머스 > level01 > 폰켓몬
public class Q27 {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        if (set.size() >= max) {
            answer = max;
        } else {
            answer = set.size();
        }

        return answer;
    }

    public static void main(String[] args) {

        Q27 sol = new Q27();

        int[] nums = {3, 1, 2, 3};
        System.out.println(sol.solution(nums));

        int[] nums2 = {3, 3, 3, 2, 2, 4};
        System.out.println(sol.solution(nums2));

        int[] nums3 = {3, 3, 3, 2, 2, 2};
        System.out.println(sol.solution(nums3));

    }
}
