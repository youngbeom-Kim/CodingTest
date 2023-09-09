package programmers.level01;

//프로그래머스 > Level 01 > 핸드폰 번호 가리기
public class Q38 {

    //람다식으로 푼 것
    public String solution2 (String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    //내가 푼 것
    public String solution(String phone_number) {
        String answer = "";

        String[] arr = phone_number.split("");

        for (int i = 0; i < arr.length - 4; i++) {
            arr[i] = arr[i].replace(arr[i], "*");
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(new Q38().solution("01033334444"));
        System.out.println(new Q38().solution("027778888"));

    }
}
