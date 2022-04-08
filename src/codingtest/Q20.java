package codingtest;

//프로그래머스 > 키패드 누르기
public class Q20 {
    public String solution(int[] numbers, String hand) {
        String answer = "";



        return answer;
    }

    public static void main(String[] args) {

        Q20 sol = new Q20();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(sol.solution(numbers, hand));

        int[] numbers2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        System.out.println(sol.solution(numbers2, hand2));

        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        System.out.println(sol.solution(numbers3, hand3));

    }
}
