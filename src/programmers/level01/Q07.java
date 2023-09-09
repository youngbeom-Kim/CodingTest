package programmers.level01;

//프로그래머스 > programmers.level01 > 서울에서 김서방 찾기
public class Q07 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) answer = String.format("김서방은 %d에 있다.", i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Q07 sol = new Q07();

        String[] seoul = {"Jane", "Kim"};
        System.out.println(sol.solution(seoul));

    }
}
