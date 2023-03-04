package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//프로그래머스 > Level01 > 같은 숫자는 싫어
public class Q45 {
    public Stack<Integer> solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
            if (i != 0 && stack.peek() == arr[i - 1]) {
                stack.pop();
            }
        }

        return stack;
    }
    public int[] solution1(int[] arr) {

        List<Integer> list = new ArrayList<>();

        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    public static void main(String[] args) {

        Q45 sol = new Q45();

        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(sol.solution1(arr)));

        int[] arr1 = {4,4,4,3,3};
        System.out.println(Arrays.toString(sol.solution1(arr1)));

    }
}
