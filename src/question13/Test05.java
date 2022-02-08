package question13;

//아래와 같이 출력하시오.
//  0  0  1  0  0
//  0  2  3  4  0
//  5  6  7  8  9
//  0 10 11 12  0
//  0  0 13  0  0
public class Test05 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;

        for (int i = 0; i < nums.length; i++) {
            int abs = Math.abs(nums.length/2 - i);
            for (int j = abs; j <= nums[0].length - abs - 1; j++) {
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
