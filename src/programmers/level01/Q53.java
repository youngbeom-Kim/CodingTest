package programmers.level01;

//프로그래머스 > Level01 > [1차]다트게임
public class Q53 {
    public int solution(String dartResult) {
        int answer = 0;

        int[] score = new int[3];
        int num = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c >= '0' && c <= '9') {
                if (c == '1' &&  dartResult.charAt(i + 1) == '0') {
                    score[num] = 10;
                    i++;
                } else {
                    score[num] = c - 48;
                }
                num++;
            }
            if (c == 'S') {
                score[num - 1] *= 1;
            } else if (c == 'D') {
                score[num - 1] *= score[num - 1];
            } else if (c == 'T') {
                score[num - 1] *= score[num - 1] * score[num - 1];
            } else if (c == '#') {
                score[num - 1] *= -1;
            } else if (c == '*') {
                score[num - 1] *= 2;
                if (num > 1) {
                    score[num - 2] *= 2;
                }
            }
        }

        answer = score[0] + score[1] + score[2];

        return answer;
    }

    public static void main(String[] args) {

        Q53 sol = new Q53();

        String dartResult = "1S2D*3T";
        System.out.println(sol.solution(dartResult)); //37

        String dartResult2 = "1D2S#10S";
        System.out.println(sol.solution(dartResult2)); //9

        String dartResult3 = "1D2S0T";
        System.out.println(sol.solution(dartResult3)); //3

        String dartResult4 = "1S*2T*3S";
        System.out.println(sol.solution(dartResult4)); //23

        String dartResult5 = "1D#2S*3S";
        System.out.println(sol.solution(dartResult5)); //5

        String dartResult6 = "1T2D3D#";
        System.out.println(sol.solution(dartResult6)); //-4

        String dartResult7 = "1D2S3T*";
        System.out.println(sol.solution(dartResult7)); //59

    }
}
