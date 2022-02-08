package question13;

//아래와 같이 출력하시오.
//  1  2  3  4  10
//  5  6  7  8  26
//  9 10 11 12  42
// 13 14 15 16  58
// 28 32 36 40 136
public class Test06 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;

        for (int i = 0; i < nums.length; i++) {
            int row = 0;
            for (int j = 0; j < nums[0].length; j++) {
                if (j == nums[0].length - 1) {
                    nums[i][j] = row;
                } else {
                    nums[i][j] = num;
                    row += num;
                    num++;
                }
            }
        }

        for (int j = 0; j < nums.length; j++) {
            int col = 0;
            for (int i = 0; i < nums[0].length; i++) {
                if (i == nums[0].length - 1) {
                    for (int m = 0; m < nums[0].length - 1; m++) {
                        col += nums[m][j];
                    }
                    nums[i][j] = col;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.printf("%4d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
