package programmers.level01;

//프로그래머스 > programmers.level01 > 음양 더하기
public class Q23 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        /*
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            } else {
                answer += absolutes[i] * -1;
            }
        }
        */

        for (int i = 0; i < signs.length; i++) {
            answer += absolutes[i] * (signs[i]? 1 : -1);
        }

        return answer;
    }

    public static void main(String[] args) {

        Q23 sol = new Q23();

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        System.out.println(sol.solution(absolutes, signs));

        int[] absolutes2 = {1,2,3};
        boolean[] signs2 = {false, false, true};

        System.out.println(sol.solution(absolutes2, signs2));

    }
}

