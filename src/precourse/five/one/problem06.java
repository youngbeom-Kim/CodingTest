package precourse.five.one;

import java.util.*;

public class problem06 {
    public static void main(String[] args) {

        String[][] forms = {{"jm@email.com", "제이엠"}, {"jason@email.com", "제이슨"}, {"woniee@email.com", "워니"}, {"mj@email.com", "엠제이"}, {"nowm@email.com", "이제엠"}};

        System.out.println(Arrays.toString(solution(forms)));

    }

    private static String[] solution(String[][] forms) {

        //결과 값
        String[] result;

        //결과 이메일 넣어줄 리스트
        ArrayList<String> list = new ArrayList<>();

        //중복 단어 갯수 구할 맵
        HashMap<String, Integer> map = new HashMap<>();

        //두글자씩 잘라서 중복되면 갯수 + 1
        for (int i = 0; i < forms.length; i++) {
            for (int j = 0; j < forms[i][1].length() - 1; j++) {
                char c1 = forms[i][1].charAt(j);
                char c2 = forms[i][1].charAt(j + 1);
                String dup = c1 + "" + c2;
                if (!map.containsKey(dup)) {
                    map.put(dup, 1);
                } else {
                    map.put(dup, map.get(dup) + 1);
                }
            }
        }

        //만약 value값이 2보다 적으면 map에서 제거
        map.values().removeIf(value -> value < 2);

        //key값이 들어가는 닉네임의 이메일 뽑아내기
        for (String key : map.keySet()) {
            for (int i = 0; i < forms.length; i++) {
                if (!forms[i][1].equals("") && forms[i][1].contains(key)) {
                    list.add(forms[i][0]);
                    forms[i][1] = "";
                }
            }
        }

        //정렬
        Collections.sort(list);

        //결과 값 갯수 지정
        result = new String[list.size()];

        //리스트에 있는 결과 값 넣기
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
