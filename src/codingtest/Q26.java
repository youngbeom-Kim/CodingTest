package codingtest;

// 프로그래머스 > 없는 숫자 더하기
public class Q26 {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        Q26 sol = new Q26();

        int[] numberes = {1, 2, 3, 4, 6, 7, 8, 0};
        System.out.println(sol.solution(numberes));

        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};
        System.out.println(sol.solution(numbers2));

    }

}
