package codingtest;

//프로그래머스 > 평균 구하기
public class Q10 {
    public double solution(int[] arr) {

        double count = 0;

        for (int i = 0; i < arr.length; i++) count += arr[i];

        return count / arr.length;
    }

    public static void main(String[] args) {

        Q10 sol = new Q10();

        int[] arr = {1, 2, 3, 4};
        System.out.println(sol.solution(arr));

        int[] arr2 = {5, 5};
        System.out.println(sol.solution(arr2));

    }
}
