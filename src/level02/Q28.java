package level02;

import java.util.*;

//프로그래머스 > Level 02 > 주차 요금 계산
public class Q28 {
    public int[] solution(int[] fees, String[] records) {

        ArrayList<String> number = new ArrayList();
        ArrayList<Integer> time = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < records.length; i++) {
            int record = (Integer.parseInt(records[i].split(" ")[0].split(":")[0]) * 60)
                        + (Integer.parseInt(records[i].split(" ")[0].split(":")[1]));
            String num = records[i].split(" ")[1];

            if (number.contains(num)) {
                if (map.containsKey(num)) {
                    map.put(num, (map.get(num) + (record - time.get(number.indexOf(num)))));
                } else {
                    map.put(num, record - time.get(number.indexOf(num)));
                }
                time.remove(number.indexOf(num));
                number.remove(number.indexOf(num));
            } else {
                number.add(num);
                time.add(record);
            }
        }

        if (!number.isEmpty()) {
            for (int i = 0; i < number.size(); i++) {
                if (map.containsKey(number.get(i))) {
                    map.put(number.get(i), (map.get(number.get(i))) + (1439 - time.get(i)));
                } else {
                    map.put(number.get(i), 1439 - time.get(i));
                }
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list);

        int[] answer = new int[list.size()];

        int cnt = 0;

        System.out.println((int) Math.ceil((double) (334 - 180) / 10));

        for (String key : list) {
            int value = map.get(key);
            if (value < fees[0]) {
                answer[cnt] = fees[1];
            } else {
                answer[cnt] = fees[1] + ((int) Math.ceil((double) (value - fees[0]) / fees[2])) * fees[3];
            }
            cnt++;
        }

        return answer;
    }
    public static void main(String[] args) {

        Q28 sol = new Q28();

        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
        System.out.println(Arrays.toString(sol.solution(fees, records)));

        int[] fees2 = {120, 0, 60, 591};
        String[] records2 = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"};
        System.out.println(Arrays.toString(sol.solution(fees2, records2)));

        int[] fees3 = {1, 461, 1, 10};
        String[] records3 = {"00:00 1234 IN"};
        System.out.println(Arrays.toString(sol.solution(fees3, records3)));

    }
}
