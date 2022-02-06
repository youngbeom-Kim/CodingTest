package question12;

//중복되지 않는 임의의 숫자 5개를 만드시오.
public class Test06 {

    public static void main(String[] args) {

        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 9 + 1);
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    i--;
                    System.out.println("중복값 발생");
                    break;
                }
            }
        }

        String str = "[";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
            if (i == nums.length - 1) {
                str += "]";
                break;
            }
            str += ", ";
        }

        System.out.println(str);

    }
}
