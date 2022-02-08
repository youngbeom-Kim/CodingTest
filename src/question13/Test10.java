package question13;

//아래와 같이 출력하시오.
// 2 7 6
// 9 5 1
// 4 3 8
public class Test10 {

    //한번 더 풀어볼것.
    public static void main(String[] args) {

        int[][] nums = new int[3][3];

        int num = 0;

        int row = nums.length / 2;
        int col = nums.length - 1;

        for (int i = 0; i < nums.length * nums.length; i++) {
            num++;
            nums[row][col] = num;

            if ((num % nums.length) == 0) {
                col--;
            } else {
                row--;
                col++;
                if (row < 0) {
                    row = nums.length - 1;
                }
                if (col > nums.length - 1) {
                    col = 0;
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
