package question13;

//아래와 같이 출력하시오.
// 1  6 11 16 21
// 2  7 12 17 22
// 3  8 13 18 23
// 4  9 14 19 24
// 5 10 15 20 25
public class Test03 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[j][i] = num;
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
