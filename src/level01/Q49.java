package level01;

//프로그래머스 > Level01 > 수소 찾기
public class Q49 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count > 2) {
                    break;
                }
            }
            if (count == 2) {
                answer++;
            }
        }

        return answer;
    }

    public int solution1(int n) {
        int answer = 0;
        int[] arr = new int[n+1];

        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) continue;
            for (int j = i*2; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer++;
        }

        return answer;
    }

    public int solution2(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        arr[1] = 0;

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) continue;
            for (int j = i * 2; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q49 sol = new Q49();

        int n = 10;
        System.out.println(sol.solution2(n));

        int n2 = 5;
        System.out.println(sol.solution2(n2));

    }
}
