package level02;

//프로그래머스 > Level 2 > 할인 행사
public class Q24 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;



        return answer;
    }
    public static void main(String[] args) {

        Q24 sol = new Q24();

        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(sol.solution(want, number, discount));

        String[] want2 = {"apple"};
        int[] number2 = {10};
        String[] discount2 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        System.out.println(sol.solution(want2, number2, discount2));

    }
}
