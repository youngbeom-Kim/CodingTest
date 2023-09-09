package programmers.level01;

//프로그래머스 > programmers.level01 > [1차]다트 게임
public class Q22 {
    public int solution(String dartResult) {
        int answer = 0;

        char[] charArr = dartResult.toCharArray();
        int[] score = new int[3];
        int count = -1;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] >= '0' && charArr[i] <= '9') {
                count++;
                if (charArr[i] == '1' && charArr[i + 1] == '0') {
                    score[count] = 10;
                    i++;
                } else {
                    score[count] = charArr[i] - '0';
                }
            } else if (charArr[i] == 'D') {
                score[count] *= score[count];
            } else if (charArr[i] == 'T') {
                score[count] *= score[count] * score[count];
            } else if (charArr[i] == '*') {
                if (count > 0) {
                    score[count - 1] *= 2;
                }
                score[count] *= 2;
            } else if (charArr[i] == '#') {
                score[count] *= -1;
            }
        }

        for (int s : score) {
            System.out.print(s + " ");
        }

        answer = score[0] + score[1] + score[2];

        return answer;
    }

    public static void main(String[] args) {

        Q22 sol = new Q22();

        String dartResult = "1S2D*3T";
        System.out.println(sol.solution(dartResult));

        String dartResult2 = "1D2S#10S";
        System.out.println(sol.solution(dartResult2));

        String dartResult3 = "1D2S0T";
        System.out.println(sol.solution(dartResult3));

        String dartResult4 = "1S*2T*3S";
        System.out.println(sol.solution(dartResult4));

        String dartResult5 = "1D#2S*3S";
        System.out.println(sol.solution(dartResult5));

        String dartResult6 = "1T2D3D#";
        System.out.println(sol.solution(dartResult6));

        String dartResult7 = "1D2S3T*";
        System.out.println(sol.solution(dartResult7));

    }
}
