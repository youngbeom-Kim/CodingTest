package codingTest;

public class PCCP_01 {
    public String solution(String input_string) {
        String answer = "";

        String[] arr = input_string.split("");


        return answer;
    }
    public static void main(String[] args) {

        PCCP_01 sol = new PCCP_01();

        String input_string = "edeaaabbccd";
        System.out.println(sol.solution(input_string));

        String input_string2 = "eeddee";
        System.out.println(sol.solution(input_string2));

        String input_string3 = "string";
        System.out.println(sol.solution(input_string3));

        String input_string4 = "zbzbz";
        System.out.println(sol.solution(input_string4));

    }
}
