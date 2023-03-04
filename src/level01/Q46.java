package level01;

//프로그래머스 > Level01 > 이상한 문자 만들기
public class Q46 {
    //Char 변환하여 만들기
    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count++;
            if (c == 32) {
                count = 0;
            } else if (count % 2 == 1) {
                c = (char) (c - 32);
            }
            answer += c;
        }

        return answer;
    }

    //split을 통한 이중for문
    public String solution1(String s) {
        String answer = "";

        String[] str = s.toLowerCase().split(" ");

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                char c = str[i].charAt(j);
                if (j % 2 == 0) {
                    c = (char) (c - 32);
                }
                answer += c;
            }
            if (i != str.length - 1) answer += " ";
        }

        return answer;
    }

    //split을 통하여 향상된 for문 + 삼항연산자
    public String solution2(String s) {
        String answer = "";

        int count = 0;
        String[] str = s.split("");

        for (String ss : str) {
            count = ss.equals(" ") ? 0 : count + 1;
            answer += count % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }

        return answer;
    }

    public static void main(String[] args) {

        Q46 sol = new Q46();

        String s = "try hello world";
        System.out.println(sol.solution2(s));

    }
}
