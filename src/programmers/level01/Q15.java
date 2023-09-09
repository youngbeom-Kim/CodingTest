package programmers.level01;

import java.util.*;

//프로그래머스 > programmers.level01 > 실패율
public class Q15 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        HashMap<Integer, Double> map = new HashMap<>();

        double failed = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;

            //실패율의 분자 구하기
            for (int j = 0; j < stages.length; j++) {
                if (i + 1 == stages[j]) {
                    count++;
                }
            }

            //실패율 구하기
            failed = (double) count / stages.length;

            //i 랑 같은 숫자의 배열 앞당기기
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < stages.length; j++) {
                list.add(stages[j]);
            }
            list.removeAll(Arrays.asList(Integer.valueOf(i + 1)));
            stages = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                stages[j] = list.get(j);
            }

            map.put(i + 1, failed);
        }

        //map 내림차순
        List<Integer> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        //map 값 확인하기
        //for (Integer key : keySetList) {
        //    System.out.println(key + " : " + map.get(key));
        //}

        //map의 key 배열에 넣기
        int num = 0;
        for (Integer key : keySetList) {
            answer[num] = key;
            num++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Q15 sol = new Q15();

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(sol.solution(N, stages)));

        int N2 = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        System.out.println(Arrays.toString(sol.solution(N2, stages2)));

    }
}
