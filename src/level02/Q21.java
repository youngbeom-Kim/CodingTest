package level02;

import java.util.Stack;

//프로그래머스 > Level 02 > 괄호 회전하기
public class Q21 {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {

            //매번 한 칸씩 뒤로 간 String을 만들기 위해서 매번 새로 만들기
            Stack<String> stack = new Stack<>();

            //한 칸씩 뒤로 간 String을 위한 int
            int cnt = i;

            //Stack만들기
            for (int j = 0; j < s.length(); j++) {
                //글자 수를 넘어가면 cnt를 다시 0으로 만들어서 앞의 단어 가져오기
                if (cnt >= s.length()) {
                    cnt = 0;
                }

                //만약 괄호가 완성되면 그 괄호는 삭제
                if ((s.charAt(cnt) == (')') || s.charAt(cnt) == ('}') || s.charAt(cnt) == (']')) && !stack.empty()) {
                        if (stack.peek().equals("(") && s.charAt(cnt) == (')')) {
                            stack.pop();
                        } else if (stack.peek().equals("{") && s.charAt(cnt) == ('}')) {
                            stack.pop();
                        } else if (stack.peek().equals("[") && s.charAt(cnt) == (']')) {
                            stack.pop();
                        }
                } else {
                    stack.add(String.valueOf(s.charAt(cnt)));
                }

                //매번 한 칸씩 밀린 스택을 만들기 위해 추가
                cnt++;

            }

            //한 번 다 돌았을 때 스택이 비어있으면 answer에 1씩 더하기
            if (stack.empty()) {
                answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {

        Q21 sol = new Q21();

        String s = "[](){}";
        System.out.println(sol.solution(s));

        String s2 = "}]()[{";
        System.out.println(sol.solution(s2));

        String s3 = "[)(]";
        System.out.println(sol.solution(s3));

        String s4 = "}}}";
        System.out.println(sol.solution(s4));

    }
}
