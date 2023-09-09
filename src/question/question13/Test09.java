package question.question13;

// 아래와 같이 출력하시오.
//  1  2  3  4  5
// 16 17 18 19  6
// 15 24 25 20  7
// 14 23 22 21  8
// 13 12 11 10  9
public class Test09 {

    //한번 더 풀어볼것
    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;
        int flag = 1;
        int count = 0;

        int row = 0;
        int col = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length - count; j++) {
                col += flag;
                nums[row][col] = num;
                num++;
            }
            count++;

            if (count == nums.length) {
                break;
            }

            for (int j = 0; j < nums.length - count; j++) {
                row += flag;
                nums[row][col] = num;
                num++;
            }
            flag *= -1;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
