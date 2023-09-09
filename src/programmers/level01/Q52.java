package programmers.level01;

//프로그래머스 > Level01 > 기사단원의 무기
public class Q52 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        //비효율적인 약수 계산 방법
        /*
        int[] arr = new int[number];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) arr[i - 1]++;
                else if (i % j == 0) arr[i - 1] += 2;
            }
        }
        */

        //효율적인 약수 계산 방법2 (배열 효율)
        /*
        int[] arr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                arr[i * j]++;
            }
        }
        */

        //효율적인 약수 계산 방법 (상수 효율)
        int[] arr = new int[number];

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) arr[i - 1]++;
                else if (i % j == 0) arr[i - 1] += 2;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > limit) {
                arr[i] = power;
            }
            answer += arr[i];
        }

        return answer;
    }
    public static void main(String[] args) {

        Q52 sol = new Q52();

        int number = 100;
        int limit = 3;
        int power = 2;
        System.out.println(sol.solution(number, limit, power));

        int number2 = 10;
        int limit2 = 3;
        int power2 = 2;
        System.out.println(sol.solution(number2, limit2, power2));



    }
}
