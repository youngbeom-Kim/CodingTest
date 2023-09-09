package programmers.level02;

//프로그래머스 > programmers.level02 > 올바른 괄호
public class Q07 {
    boolean solution(String s) {
        boolean answer = true;

//        int cum = 0;
//        String[] arr = s.split("");
//        for (String paren : arr) {
//            cum += "(".equals(paren) ? 1 : -1;
//            if(cum < 0) return false;
//        }

         int lcount = 0;
         int rcount = 0;

         for (int i = 0; i < s.length(); i++) {
             if (s.charAt(i) == '(') {
                 lcount++;
             } else if (s.charAt(i) == ')') {
                 rcount++;
             }

             if (lcount - rcount < 0) {
                 answer = false;
                 break;
             }

         }

         if (lcount != rcount) {
             answer = false;
         } else if (s.charAt(0) == ')') {
             answer = false;
         } else if (s.charAt(s.length() - 1) == '(') {
             answer = false;
         }

        return answer;
    }
    public static void main(String[] args) {

        Q07 sol = new Q07();

        String s = "()()";
        System.out.println(sol.solution(s));

        String s1 = "(())()";
        System.out.println(sol.solution(s1));

        String s2 = ")()(";
        System.out.println(sol.solution(s2));

        String s3 = "(()(";
        System.out.println(sol.solution(s3));

        String s4 = "())))(((()";
        System.out.println(sol.solution(s4));

    }
}

