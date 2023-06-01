package level02;

//프로그래머스 > Level 02 > 땅따먹기
public class Q27 {
    int solution2(int[][] land) {
        int answer = 0;




        return answer;
    }
    int solution(int[][] land) {
        int answer = 0;

        int cnt = 5;

        for (int i = 0; i < land.length; i++) {
            int max = 0;
            int mCnt = 0;
            for (int j = 0; j < land[i].length; j++) {
                if (j == cnt) {
                    continue;
                } else {
                    if (max < land[i][j]) {
                        max = land[i][j];
                        mCnt = j;
                    }
                }
            }
            cnt = mCnt;
            answer += max;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q27 sol = new Q27();

        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
        //System.out.println(sol.solution(land));

        int[][] land2 = {{1, 1, 3, 1}, {2, 3, 2, 2}, {1, 4, 1, 1}};
        System.out.println(sol.solution(land2));

    }
}
