package level01;

//프로그래머스 > Level01 > 부족한 금액 계산하기
public class Q42 {

    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }

    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += price * i;
        }

        answer = answer - money;

        if (answer < 0) {
            return answer = 0;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q42 sol = new Q42();

        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(sol.solution(price, money, count));

        int price2 = 5;
        int money2 = 40;
        int count2 = 3;
        System.out.println(sol.solution(price2, money2, count2));

    }
}
