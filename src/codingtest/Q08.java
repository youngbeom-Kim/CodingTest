package codingtest;

//프로그래머스 > 서울에서 김서방 찾기
public class Q08 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) answer = String.format("김서방은 %d에 있다.", i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Q08 sol = new Q08();

        String[] seoul = {"Jane", "Kim"};
        System.out.println(sol.solution(seoul));

    }
}
