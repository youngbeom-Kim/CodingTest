package level02;

import java.util.Arrays;

//프로그래머스 > Level 02 > n^2 배열 자르기
public class Q19 {
    public int[] solution2(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        //빈 배열 만들기
        int[] temp = new int[n*n];

        //각 배열의 숫자를 넣어주기 위해서
        int cnt = n;

        //숫자 넣기
        for (int i = 0; i < n; i++) {
            //n = 3일 경우, [1, 0, 2, 2, 0, 3, 3, 3] 이런식으로 숫자를 넣어주는 반복문
            for (int j = i * n; j <= (i * n) + i; j++) {
                temp[j] = i + 1;
            }
            //n = 3일 경우, [1, 2, 2, 2, 3, 3, 3, 3] 빈 곳에 각 숫자를 넣어주는 반복문
            for (int j = n; j <= (i * n); j += n) {
                temp[j - cnt] = i + 1;
            }
            //배열의 자리를 맞추기 위해서
            cnt--;
        }

        int num = (int) left;

        //left부터 right 까지의 배열을 가져오기
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp[num];
            num++;
        }

        return answer;
    }

    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left + 1)];

        //문제를 좌표 개념으로 생각하고 풀기
        for (int i = 0; i < answer.length; i++) {
            int x = (int) (left / n + 1);
            int y = (int) (left % n + 1);
            left++;
            answer[i] = Math.max(x, y);
        }

        return answer;
    }
    public static void main(String[] args) {

        Q19 sol = new Q19();

        int n = 3;
        long left = 2;
        long right = 5;
        System.out.println(Arrays.toString(sol.solution(n, left, right)));

        int n2 = 4;
        long left2 = 7;
        long right2 = 14;
        System.out.println(Arrays.toString(sol.solution(n2, left2, right2)));

    }
}
