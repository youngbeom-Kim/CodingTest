package programmers.level01;

import java.util.ArrayList;
import java.util.Collections;

//프로그래머스 > Level01 > 숫자 짝꿍
public class Q51 {
    public String solution3(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
            x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
            return "-1";
        }else if(answer.toString().charAt(0)==48){
            return "0";
        }else {
            return answer.toString();
        }
    }
    //런타임 에러 + 시간 초과
    public String solution2(String X, String Y) {
        String answer = "";

        ArrayList<Character> list = new ArrayList<>();

        StringBuilder xsb = new StringBuilder(X);
        StringBuilder ysb = new StringBuilder(Y);

        for (int i = 0; i < xsb.length(); i++) {
            for (int j = 0; j < ysb.length(); j++) {
                if (i > xsb.length() - 1) {
                    break;
                }
                if (xsb.charAt(i) == ysb.charAt(j)) {
                    list.add(xsb.charAt(i));
                    xsb.deleteCharAt(i);
                    ysb.deleteCharAt(j);
                    j = 0;
                }
            }
        }

        list.sort(Collections.reverseOrder());

        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                answer += list.get(i);
            }
        } else {
            answer = "-1";
        }

        answer = String.valueOf(Integer.parseInt(answer));

        return answer;
    }
    public String solution(String X, String Y) {
        //StringBuilder 생성
        StringBuilder answer = new StringBuilder();

        //X, Y의 각 숫자의 갯수
        int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] y = {0, 0, 0 ,0, 0, 0, 0, 0, 0, 0};

        //X의 숫자 갯수 채우기
        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - 48] += 1;
        }

        //Y의 숫자 갯수 채우기
        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - 48] += 1;
        }

        //answer를 내림차순으로 하기 위한 for문
        for (int i = 9; i >= 0; i--) {
            //x, y를 비교하여 최솟값만큼 i의 값을 answer에 추가
            for (int j = 0; j < Math.min(x[i], y[i]); j++) {
                answer.append(i);
            }
        }

        //빈칸이면 -1, 첫자리가 0이면 0, 그 외에는 정답
        if ("".equals(answer.toString())) {
            return "-1";
        } else if (answer.toString().charAt(0) == 48) {
            return "0";
        } else {
            return answer.toString();
        }
    }
    public static void main(String[] args) {

        Q51 sol = new Q51();

        String X = "100";
        String Y = "2345";
        System.out.println(sol.solution(X, Y));

        String X2 = "100";
        String Y2 = "203045";
        System.out.println(sol.solution(X2, Y2));

        String X3 = "100";
        String Y3 = "123450";
        System.out.println(sol.solution(X3, Y3));

        String X4 = "12321";
        String Y4 = "42531";
        System.out.println(sol.solution(X4, Y4));

        String X5 = "5525";
        String Y5 = "1255";
        System.out.println(sol.solution(X5, Y5));

    }
}
