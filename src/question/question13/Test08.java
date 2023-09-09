package question.question13;

//아래와 같이 출력하시오.
//  1  2  4  7 11
//  3  5  8 12 16
//  6  9 13 17 20
// 10 14 18 21 23
// 15 19 22 24 25
public class Test08 {

    public static void main(String[] args) {

        int[][] nums = new int[5][5];

        int num = 1;

        /*
        i  j  num
        0  0  1
        0  1  2
        1  0  3
        0  2  4
        1  1  5
        2  0  6
        0  3  7
        1  2  8
        2  1  9
        3  0  10
        0  4  11
        1  3  12
        2  2  13
        3  1  14
        4  0  15
        1  4  16
        2  3  17
        3  2  18
        4  1  19
        2  4  20
        3  3  21
        4  2  22
        3  4  23
        4  3  24
        4  4  25
        */

        for (int count = 0; count < nums.length * 2; count++) {
            for (int i = 0; i < nums.length; i++) {
                int j = count - i;
                if (j >= 0 && j < nums.length) {
                    nums[i][j] = num;
                    num++;
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
