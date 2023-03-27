package level01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//프로그래머스 > Level 01 > 개인정보 수집 유효기간
public class Q60 {
    //날짜 비율 구하기
    private static int[] solution2(String today, String[] terms, String[] privacies) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (String term : terms) {
            map.put(term.split(" ")[0], term.split(" ")[1]);
        }

        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);

        for (int i = 0; i < privacies.length; i++) {
            String date = privacies[i].split(" ")[0];

            int pDate = Integer.parseInt(map.get(privacies[i].split(" ")[1])) * 28;

            int cDate = (year - Integer.parseInt(date.split("\\.")[0])) * 28 * 12
                      + (month - Integer.parseInt(date.split("\\.")[1])) * 28
                      + (day - Integer.parseInt(date.split("\\.")[2]));

            if (cDate >= pDate) {
                list.add(i + 1);
            }

        }

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
    //날짜 데이트 사용하여 풀이 > 일부 오류
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        SimpleDateFormat format = new SimpleDateFormat("yyyy.mm.dd");
        Date date = format.parse(today);

        //오늘 날짜
        Calendar tCal = Calendar.getInstance();
        tCal.set(Calendar.YEAR, Integer.parseInt(today.substring(0, 4)));
        tCal.set(Calendar.MONTH, Integer.parseInt(today.substring(5, 7)));
        tCal.set(Calendar.DATE, Integer.parseInt(today.substring(8, 10)));

        //약관 기간 나누기
        for (String term : terms) {
            int space = term.indexOf(" ");
            map.put(term.substring(0, space), Integer.parseInt(term.substring(space + 1, term.length())));
        }

        for (int i = 0; i < privacies.length; i++) {
            String pterm = privacies[i].substring(privacies[i].indexOf(" ") + 1, privacies[i].length());
            String pDate = privacies[i].substring(0, privacies[i].indexOf(" "));

            Calendar pCal = Calendar.getInstance();
            pCal.set(Calendar.YEAR, Integer.parseInt(pDate.substring(0, 4)));
            pCal.set(Calendar.MONTH, Integer.parseInt(pDate.substring(5, 7)));
            pCal.set(Calendar.DATE, Integer.parseInt(pDate.substring(8, 10)));

            pCal.add(Calendar.MONTH, map.get(pterm));

            if (pCal.compareTo(tCal) <= 0) {
                list.add(i + 1);
            }
        }

        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) throws ParseException {

        Q60 sol = new Q60();

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(sol.solution2(today, terms, privacies)));

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(sol.solution2(today2, terms2, privacies2)));

    }
}
