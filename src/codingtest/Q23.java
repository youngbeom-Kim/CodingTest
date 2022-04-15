package codingtest;

//프로그래머스 > [1차]다트 게임
public class Q23 {
    public int solution(String dartResult) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        Q23 sol = new Q23();

        String dartResult = "1S2D*#T";
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
