package codingtest;

public class Q19 {
    public int solution(String s) {
        int answer = 0;

        String word[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String num[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(word[i], num[i]);
        }

        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {

        Q19 sol = new Q19();

        String s = "one4seveneight";
        System.out.println(sol.solution(s));

        String s1 = "23four5six7";
        System.out.println(sol.solution(s1));

        String s2 = "2three45sixseven";
        System.out.println(sol.solution(s2));

        String s3 = "123";
        System.out.println(sol.solution(s3));

    }
}
