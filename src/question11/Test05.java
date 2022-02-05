package question11;

//1 ~ 20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.
//난수를 20개 발생 후 배열에 넣는다.
//난수는 1 ~ 20 사이
public class Test05 {

    public static void main(String[] args) {

        int nums[] = new int[20];

        //배열에 난수 20개 생성
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 20 + 1);
        }

        String str = "원본 : ";

        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
            if (i == nums.length - 1) {
                break;
            }
            str += ", ";
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        System.out.println(str);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }
}
