package question13;

//아래와 같이 출력하시오.
//1  2  3  4  5
//10 9  8  7  6
//11 12 13 14 15
//20 19 18 17 16
//21 22 23 24 25
public class Test01 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;

        for (int i = 0; i < nums.length; i++) {
            if (num % 10 > 0 && num % 10 <= 5) {
                for (int j = 0; j < nums[0].length; j++) {
                    nums[i][j] = num;
                    num++;
                }
            } else if (num % 10 > 5 && num % 10 <= 9 || num % 10 == 0) {
                for (int j = nums[0].length - 1; j >= 0; j--) {
                    nums[i][j] = num;
                    num++;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
