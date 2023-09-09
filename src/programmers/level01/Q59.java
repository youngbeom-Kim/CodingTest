package programmers.level01;

import java.util.Arrays;
import java.util.HashMap;

//프로그래머스 > Level 01 > 대충 만든 자판
public class Q59 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<String, Integer> map = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                char c = key.charAt(i);
                if (map.containsKey("" + c) && map.get("" + c) > i) {
                    map.put("" + c, i + 1);
                } else if (!map.containsKey("" + c)) {
                    map.put("" + c, i + 1);
                }
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if (map.containsKey("" + c)) {
                    answer[i] += map.get("" + c);
                } else if (!map.containsKey("" + c)) {
                    answer[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q59 sol = new Q59();

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        System.out.println(Arrays.toString(sol.solution(keymap, targets)));

        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};
        System.out.println(Arrays.toString(sol.solution(keymap2, targets2)));

        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA","BGZ"};
        System.out.println(Arrays.toString(sol.solution(keymap3, targets3)));

        String[] keymap4 = {"ABCE"};
        String[] targets4 = {"ABDE"};
        System.out.println(Arrays.toString(sol.solution(keymap4, targets4)));

    }
}
