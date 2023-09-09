package programmers.level01;

import java.util.Calendar;

//프로그래머스 > Level01 > 2016년
public class Q48 {
    public String solution(int a, int b) {
        String answer = "";

        Calendar cal = Calendar.getInstance();

        cal.set(2016, a - 1, b);

        switch (cal.get(cal.DAY_OF_WEEK)) {
            case 1 :
                answer = "SUN";
                break;
            case 2 :
                answer = "MON";
                break;
            case 3 :
                answer = "THU";
                break;
            case 4 :
                answer = "WEN";
                break;
            case 5 :
                answer = "TUR";
                break;
            case 6 :
                answer = "FRI";
                break;
            case 7 :
                answer = "SAT";
                break;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q48 sol = new Q48();

        int a = 5;
        int b = 24;
        System.out.println(sol.solution(a, b));

    }
}
