package programmers.level01;

//프로그래머스 > Level 01 > 콜라츠 추측
public class Q37 {
    public int solution(long num) {
        int answer = 0;

        while (num > 1) {
            if (num % 2 == 0) {
                answer++;
                num = num / 2;
            } else if (num % 2 == 1) {
                answer++;
                num = (num * 3) + 1;
            }
        }

        if (answer >= 500) {
            answer = -1;
        }

        return answer;
    }
    public static void main(String[] args) {

        System.out.println(new Q37().solution(6));
        System.out.println(new Q37().solution(16));
        System.out.println(new Q37().solution(626331));

    }
}
