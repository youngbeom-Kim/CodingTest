package question.question13;

// 아래와 같이 출력하시오.
//  1  2  3  4  5
//  6  7  8  9  0
// 10 11 12  0  0
// 13 14  0  0  0
// 15  0  0  0  0
public class Test04 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;
        int count = 5;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < count; j++) {
                nums[i][j] = num;
                num++;
            }
            count--;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.printf("%3d", nums[i][j]);
            }
            System.out.println();
        }

    }
}
