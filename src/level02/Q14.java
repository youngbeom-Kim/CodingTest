package level02;

import java.util.*;

//프로그래머스 > Level 2 > 튜플
public class Q14 {
    public int[] solution(String s) {
        //숫자의 갯수를 알기 위해서 map 생성
        Map<String, Integer> map = new HashMap<>();

        //문자열의 괄호 제거후 숫자배열을 String 으로 생성
        String[] arr = (s.replace("{", "").replace("}", "")).split(",");

        //Map에 숫자와 숫자 갯수 집어넣기
        for (int i = 0; i < arr.length; i++) {
            //초기 숫자가 없을 경우 생성
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        //Map의 Value로 값을 내림차순으로 정렬하기 위한 List
        List<String> list = new ArrayList<>(map.keySet());

        //정렬하기
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        //배열의 길이 지정
        int[] answer = new int[list.size()];

        //answer에 답 넣기
        for (int i = 0; i < list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
    public static void main(String[] args) {

        Q14 sol = new Q14();

        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(sol.solution(s)));
        //[2, 1, 3, 4]

        String s1 = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        System.out.println(Arrays.toString(sol.solution(s1)));
        //[2, 1, 3, 4]

        String s2 = "{{20,111},{111}}";
        System.out.println(Arrays.toString(sol.solution(s2)));
        //[111, 20]

        String s3 = "{{123}}";
        System.out.println(Arrays.toString(sol.solution(s3)));
        //[123]

        String s4 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(Arrays.toString(sol.solution(s4)));
        //[3, 2, 4, 1]

    }
}
