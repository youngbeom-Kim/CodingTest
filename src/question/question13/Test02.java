package question.question13;

//아래와 같이 출력하시오.
// 25 24 23 22 21
// 20 19 18 17 16
// 15 14 13 12 11
// 10  9  8  7  6
//  5  4  3  2  1
public class Test02 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = nums[0].length - 1; j >= 0; j--) {
                nums[i][j] = num;
                num++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
