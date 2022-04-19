package level02;

//프로그래머스 > Level02 > 문자열 압축
public class Q01 {
    public int solutin(String s) {
        int answer = 0;



        return answer;
    }

    public static void main(String[] args) {

        Q01 sol = new Q01();

        String s = "aabbaccc";
        System.out.println(sol.solutin(s));

        String s2 = "ababcdcdababcdcd";
        System.out.println(sol.solutin(s2));

        String s3 = "abcabcdede";
        System.out.println(sol.solutin(s3));

        String s4 = "abcabcabcabcdededededede";
        System.out.println(sol.solutin(s4));

        String s5 = "xababcdcdababcdcd";
        System.out.println(sol.solutin(s5));


    }
}
