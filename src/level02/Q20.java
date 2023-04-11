package level02;

import java.util.ArrayList;
import java.util.List;

//프로그래머스 > Level 02 > [1차] 뉴스 클러스터링
public class Q20 {
    public int solution(String str1, String str2) {
        int answer = 0;

        //소문자 대문자 상관없기 때문에 소문자로 만들기
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //교집합
        List<String> list1 = new ArrayList<>();

        //차집합 + 합집합
        List<String> list2 = new ArrayList<>();

        //str2 리스트
        List<String> list3 = new ArrayList<>();


        //str1 두 단어씩 나눠서 list1, list2에 넣기
        for (int i = 0; i < str1.length() - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);
            if (c1 >= 'a' && c1 <= 'z') {
                if (c2 >= 'a' && c2 <= 'z') {
                    list1.add(c1 + "" + c2);
                    list2.add(c1 + "" + c2);
                }
            }
        }

        //str2 두 단어씩 나눠서 list3에 넣기
        for (int i = 0; i < str2.length() - 1; i++) {
            char c1 = str2.charAt(i);
            char c2 = str2.charAt(i + 1);
            if (c1 >= 'a' && c1 <= 'z') {
                if (c2 >= 'a' && c2 <= 'z') {
                    list3.add(c1 + "" + c2);
                }
            }
        }

        //값이 없다면 answer = 65536
        if (list1.size() == 0 && list2.size() == 0) {
            return answer = 65536;
        }

        //교집합 구하기
        list1.retainAll(list3);

        //차집합 구하기
        list2.removeAll(list3);

        //합집합 구하기 = 차집합과 list3 더하기
        list2.addAll(list3);

        System.out.println(list1);
        System.out.println(list2);

        //출력 값
        answer = (int) (Math.floor(((double) list1.size() / (double) list2.size()) * 65536));

        return answer;
    }

    public static void main(String[] args) {

        Q20 sol = new Q20();

        /*
        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(sol.solution(str1, str2));

        String str12 = "handshake";
        String str22 = "shake hands";
        System.out.println(sol.solution(str12, str22));

        String str13 = "aa1+aa2";
        String str23 = "AAAA12";
        System.out.println(sol.solution(str13, str23));

        String str14 = "E=M*C^2";
        String str24 = "e=m*c^2";
        System.out.println(sol.solution(str14, str24));
        */

        String str15 = "abab";
        String str25 = "baba";
        System.out.println(sol.solution(str15, str25));

        String str16 = "A+C";
        String str26 = "DEF";
        System.out.println(sol.solution(str16, str26));


    }

}
