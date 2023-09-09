package programmers.level01;

//프로그래머스 > programmers.level01 > 소수만들기
public class Q24 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int sum) {

        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Q24 sol = new Q24();

        int[] nums = {1, 2, 3, 4};
        System.out.println(sol.solution(nums));

        int[] nums2 = {1, 2, 7, 6, 4};
        System.out.println(sol.solution(nums2));

    }
}
