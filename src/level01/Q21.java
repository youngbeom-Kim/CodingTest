package level01;

import java.util.Arrays;

//프로그래머스 > level01 > [1차]비밀지도
public class Q21 {
    public String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", answer[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }

        return answer;
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        /*
        실패 확률 있음, 다른 경우의 수 런타임 에러 발생
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            //10진수를 2진수로 바꿔주는 과정
            arr1[i] = Integer.parseInt(Integer.toBinaryString(arr1[i]));
            arr2[i] = Integer.parseInt(Integer.toBinaryString(arr2[i]));
            //2진수한 값을 더하기
            result[i] = arr1[i] + arr2[i];
            //더하고 나면 생기는 2라는 값을 1로 바꾸고 Integer로 변환
            answer[i] = Integer.toString(result[i]).replaceAll("2", "1");
            //0은 자릿수로 포함하지 않기때문에 사라진 0을 다시 붙여주는 과정
            while (answer[i].length() != n) {
                answer[i] = "0" + answer[i];
            }
            //1은 #으로 0은 공백으로 replace
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        */

        //10진수에서 2진수로 바뀌는 과정에서 String으로 바뀌는 값을 담아주는 배열
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            //10진수에서 2진수로 변환하는 과정
            sArr1[i] = Integer.toBinaryString(arr1[i]);
            sArr2[i] = Integer.toBinaryString(arr2[i]);
            //2진수로 바뀌면서 사라지는 앞자리 0을 붙여주는 과정
            while (sArr1[i].length() != n) {
                sArr1[i] = "0" + sArr1[i];
            }
            while (sArr2[i].length() != n) {
                sArr2[i] = "0" + sArr2[i];
            }
            //null인 값을 공백으로 바꿔주는 과정
            answer[i] = "";

            //각 자리의 숫자를 확인하고 변환하는 과정
            for (int j = 0; j < n; j++) {
                char cNum1 = sArr1[i].charAt(j);
                char cNum2 = sArr2[i].charAt(j);
                if (cNum1 == '1' && cNum2 == '1') {
                    answer[i] += "#";
                } else if (cNum1 == '0' && cNum2 == '0') {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Q21 sol = new Q21();

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(sol.solution(n, arr1, arr2)));

        int n1 = 6;
        int[] arr3 = {46, 33, 33, 22, 31, 50};
        int[] arr4 = {27, 56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(sol.solution(n1, arr3, arr4)));

    }
}
