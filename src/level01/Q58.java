package level01;

import java.util.HashSet;
import java.util.Set;

//프로그래머스 > Level 01 > 둘만의 암호
public class Q58 {

    public String solution2(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        Set<Character> set = new HashSet<>();

        for (Character c : skip.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (char i = 'a'; i <= 'z'; i++) {
            if (!set.contains(i)) {
                sb.append(i);
            }
        }

        String checkString = sb.toString().repeat(3);

        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            answer.append(checkString.charAt(checkString.indexOf(curChar) + index));
        }


        return answer.toString();
    }

    // +1 씩 더하기
    public String solution1(String s, String skip, int index) {
        char[] words = s.toCharArray();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < index ; j++){
                do{
                    words[i]++;
                    if(words[i] > 'z'){ //범위 초과시 a로 돌아옴
                        words[i] -= 26; // == 'a'와 동일
                    }
                }while(skip.contains(String.valueOf(words[i])));
            }
        }
        String answer = String.valueOf(words);
        return answer;
    }

    //3, 16, 17, 18 런타임 에러
    public String solution(String s, String skip, int index) {
        String answer = "";

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < skip.length(); i++) {
            char c = skip.charAt(i);
            alpha = alpha.replace(String.valueOf(alpha.charAt((alpha.indexOf(c)))), "");
        }


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alpha.indexOf(c) + index > alpha.length() - 1) {
                c = (char) alpha.charAt(alpha.indexOf(c) + index - alpha.length());
            } else {
                c = (char) alpha.charAt(alpha.indexOf(c) + index);
            }
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q58 sol = new Q58();

        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        System.out.println(sol.solution(s, skip, index));

    }
}
