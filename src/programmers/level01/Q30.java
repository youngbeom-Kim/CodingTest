package programmers.level01;

//프로그래머스 > Level01 > 최소직사각형
public class Q30 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        int wMax = 0;
        int hMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            width[i] = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
            height[i] = sizes[i][0] > sizes[i][1] ? sizes[i][1] : sizes[i][0];
            if (wMax < width[i]) wMax = width[i];
            if (hMax < height[i]) hMax = height[i];
        }

        answer = wMax * hMax;

        return answer;
    }

    public int solution1(int[][] sizes) {
        int answer = 0;

        int width = 0;
        int height = 0;

        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }

        answer = width * height;

        return answer;
    }
    public static void main(String[] args) {

        Q30 sol = new Q30();

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(sol.solution(sizes));

        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(sol.solution(sizes2));

        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(sol.solution(sizes3));

    }
}
