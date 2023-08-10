package backjoon.silver.level1;

//백준 > 실버5 > 셀프 넘버
public class Q03 {
    public static void main(String[] args) {

        int[] numbers = new int[10000];
        int[] answer = new int[10000];

        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
            answer[i - 1] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            }

            int self_num = 0;

            if (numbers[i] > 0) {
                int one = numbers[i] % 10;
                self_num = numbers[i] + one;
                if (numbers[i] >= 10) {
                    int two = (numbers[i] % 100) / 10;
                    self_num = numbers[i] + one + two;
                    if (numbers[i] >= 100) {
                        int three = (numbers[i] % 1000) / 100;
                        self_num = numbers[i] + one + two + three;
                        if (numbers[i] >= 1000) {
                            int four = (numbers[i] % 10000) / 1000;
                            self_num = numbers[i] + one + two + three + four;
                        }
                    }
                }
            }


            if (self_num <= numbers.length) {
                answer[self_num - 1] = 0;
            }

        }

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                System.out.println(answer[i]);
            }
        }

    }
}
