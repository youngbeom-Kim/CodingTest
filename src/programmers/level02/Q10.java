package programmers.level02;

//프로그래머스 > programmers.level02 > 다음 큰 숫자 (BigInteger)
public class Q10 {
    public int solution(int n) {
        int answer = 0;

        String bin = Integer.toBinaryString(n);

        int one = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                one++;
            }
        }

        while (true) {
            n++;
            int one2 = 0;
            String bin2 = Integer.toBinaryString(n);
            for (int i = 0; i < bin2.length(); i++) {
                if (bin2.charAt(i) == '1') {
                    one2++;
                }
            }
            if (one == one2) {
                answer = n;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q10 sol = new Q10();

        int n = 78;
        System.out.println(sol.solution(n));

        int n1 = 15;
        System.out.println(sol.solution(n1));

    }
}
