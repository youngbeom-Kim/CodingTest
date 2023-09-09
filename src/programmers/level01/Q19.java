package programmers.level01;

//프로그래머스 > programmers.level01 > 키패드 누르기
public class Q19 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        //기본 손의 위치는 왼손은 *, 오른손은 #
        int leftN = 10;
        int rightN = 12;

        //누르는 번호 불러오기
        for (int n : numbers) {
            //왼손으로 누를 번호와 그 누른 번호의 위치 저장하기
            if (n == 1 || n == 4 || n == 7) {
                answer += "L";
                leftN = n;
            //오른손으로 누를 번호와 그 누른 번호의 위치 저장하기
            } else if (n == 3 || n == 6 || n == 9) {
                answer += "R";
                rightN = n;
            //가운데에 있는 번호의 누를 조건 구하기
            } else {

                //만약 눌러야하는 숫자가 0이면 11을 더하기
                if (n == 0) {
                    n += 11;
                }

                //누르는 번호와 손가락의 위치 거리 구하기
                int leftD = (Math.abs(n - leftN)) / 3 + (Math.abs(n - leftN)) % 3;
                int rightD = (Math.abs(n - rightN)) / 3 + (Math.abs(n - rightN)) % 3;

                //거리가 같다면 주로 사용하는 손을 이용하기
                if (leftD == rightD) {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightN = n;
                    } else {
                        answer += "L";
                        leftN = n;
                    }
                //거리가 왼손보다 오른손이 가까우면 R
                } else if (leftD > rightD) {
                    answer += "R";
                    rightN = n;
                //거리가 오른손보다 왼손이 가까우면 L
                } else {
                    answer += "L";
                    leftN = n;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q19 sol = new Q19();

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
