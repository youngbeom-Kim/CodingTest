package precourse.five.one;

import java.util.*;

public class problem02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String cryptogram = in.nextLine();

        System.out.println(solution(cryptogram));

    }

    private static String solution(String cryptogram) {

        String result = "";

        //Deque 생성
        Deque<String> dq = new ArrayDeque<>();

        for (int i = 0; i < cryptogram.length(); i++) {
            String s = cryptogram.charAt(i) + "";
            //비어있지 않다면
            if (!dq.isEmpty()) {
                //전과 동일하면 제거
                if (dq.peek().equals(s)) {
                    dq.pop();
                //전과 동일하지 않다면 추가
                } else {
                    dq.push(s);
                }
            //비어있다면 값 넣기
            } else {
                dq.push(s);
            }
        }

        //제거 되지 않은 단어들 앞에서부터 추가
        while (!dq.isEmpty()) {
            result += dq.pollLast();
        }

        return result;
    }
}
