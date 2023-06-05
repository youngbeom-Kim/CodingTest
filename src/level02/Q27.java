package level02;

//프로그래머스 > Level 02 > 땅따먹기
public class Q27 {
    int solution2(int[][] land) {
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
            land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }

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
        System.out.println(sol.solution2(land));

        int[][] land2 = {{1, 1, 3, 1}, {2, 3, 2, 2}, {1, 4, 1, 1}};
        System.out.println(sol.solution2(land2));

    }
}
