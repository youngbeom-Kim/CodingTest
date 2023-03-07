package level01;

import java.util.Arrays;

//프로그래머스 > Level01 > 과일 장수
public class Q50 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        //스코어 배열 정렬
        Arrays.sort(score);

        //4개씩 나눈 값의 가장 최소값을 기준으로 값을 더함
        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }

        return answer;
    }
    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        //스코어 배열 정렬
        Arrays.sort(score);

        //스코어를 잠시 담을 배열
        int[] arr = new int[m];

        //잠시 담을 배열의 자리
        int cnt = 0;

        //결과값
        for (int i = score.length - 1; i >= 0; i--) {
            //담아야할 사과보다 사과 갯수가 적으면 break
            if (i == (score.length % m) - 1) {
                break;
            }

            //사과 담기
            arr[cnt] = score[i];
            cnt++;

            //사과가 다 담아지면 결과 계산
            if (cnt == m) {
                //사과 최저값
                int min = arr[0];
                //사과 최저값 찾기
                for (int j = 1; j < arr.length; j++) {
                    if (min > arr[j]) {
                        min = arr[j];
                    }
                }
                answer += min * m;
                cnt = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Q50 sol = new Q50();

        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3 ,1, 2, 3, 1};
        System.out.println(sol.solution(k, m, score)); // 8

        int k2 = 4;
        int m2 = 3;
        int[] score2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(sol.solution(k2, m2, score2)); // 33

    }
}
