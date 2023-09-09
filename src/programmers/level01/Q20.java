package programmers.level01;

import java.util.ArrayList;

//프로그래머스 > programmers.level01 > 크레인 인형뽑기 게임
public class Q20 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        /*
        board
        0 0 0 0 0
        0 0 1 0 3
        0 2 5 0 1
        4 2 4 4 2
        3 5 1 3 1
        moves
        1 > 5 > 3 > 5 > 1 > 2 > 1 > 4
        moves 로 뽑힌 인형
        4 > 3 > 1 > 1 > 3 > 2 > 0 > 4
        */

        //인형을 담아둘 바구니
        ArrayList<Integer> dolls = new ArrayList<Integer>();

        //moves 할때마다 나오는 값 뽑아내는 반복문
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                //뽑았을때 0 이 아니면 뽑아오기
                if (board[i][m - 1] != 0) {
                    dolls.add(board[i][m - 1]);
                    board[i][m - 1]= 0;
                    break;
                }
            }
        }

        //겹치는 인형은 제거하기
        for (int i = 0; i < dolls.size() - 1; i++) {
            //인형이 겹칠경우 없애고 다시 처음부터 체크하기
            if (dolls.get(i) == dolls.get(i + 1)) {
                dolls.remove(i + 1);
                dolls.remove(i);
                //사라진 인형의 개수 더하기
                answer += 2;
                //처음부터
                i = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q20 sol = new Q20();

        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(sol.solution(board, moves));

    }
}
