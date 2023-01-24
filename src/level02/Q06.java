package level02;

//프로그래머스 > level02 > Jadencase 문자열 만들기
public class Q06 {
    public String solution(String s) {
        String answer = "";

        //String을 split을 이용해서 배열로 나누기
        String strings[] = s.toLowerCase().split(" ");



        //각 단어의 첫번째 단어를 대문자로 바꾸기
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }

        //join을 이용해서 합치기
        answer = String.join(" ", strings);

        return answer;
    }

    public static void main(String[] args) {

        Q06 sol = new Q06();

        String s = "3people unFollowed me";
        System.out.println(sol.solution(s));

        String s1 = "for the last week";
        System.out.println(sol.solution(s1));

    }
}
