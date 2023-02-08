package level01;

// 프로그래머스 > level01 > 체육복
public class Q26 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for  (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i]) - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q26 sol = new Q26();

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};
        System.out.println(sol.solution(n, lost, reserve));

        int n2 = 5;
        int[] lost2 = {2, 4};
        int[] reserve2 = {3};
        System.out.println(sol.solution(n2, lost2, reserve2));

        int n3 = 3;
        int[] lost3 = {3};
        int[] reserve3 = {1};
        System.out.println(sol.solution(n3, lost3, reserve3));

    }
}
