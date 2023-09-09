package question.question06;


//서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
//Calendar, Date 사용 금지
//오늘이 무슨 요일인가?
public class Test10 {

    public static void main(String[] args) {

        int nowyear = 2022;
        int nowmonth = 1;
        int nowday = 18;
        int totalDay = year(nowyear) + month(nowyear, nowmonth) + nowday;

        System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날입니다.\n", nowyear, nowmonth, nowday, totalDay);
        System.out.printf("오늘은 %s요일입니다.", dayofweek(totalDay));

    }

    public static int year(int year) {

        int commonYear = 0;
        int leapYear = 0;
        int totalDay = 0;

        for (int i=1; i<year; i++) {
            if (i % 4 == 0 && i % 100 == 0 && i % 400 == 0) {
                leapYear += 366;
            } else if (i % 4 == 0 && i % 100 == 0) {
                commonYear += 365;
            } else if (i % 4 == 0) {
                leapYear += 366;
            } else {
                commonYear += 365;
            }
        }

        totalDay = commonYear + leapYear;

        return totalDay;
    }

    public static int month(int year, int month) {

        int totalDay = 0;

        for (int i=1; i<month; i++) {

            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    totalDay += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDay += 30;
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                        totalDay += 29;
                    } else if (year % 4 == 0 && year % 100 == 0) {
                        totalDay += 28;
                    } else if (year % 4 == 0) {
                        totalDay += 29;
                    } else {
                        totalDay += 28;
                    }
                    break;
            }

        }

        return totalDay;
    }

    public static String dayofweek (int totalDay) {

        int dayOfWeek = totalDay % 7;
        String str = "";

        switch (dayOfWeek) {
            case 1:
                str += "월";
                break;
            case 2:
                str += "화";
                break;
            case 3:
                str += "수";
                break;
            case 4:
                str += "목";
                break;
            case 5:
                str += "금";
                break;
            case 6:
                str += "토";
                break;
            case 7:
                str += "일";
                break;
        }

        /*
        String dayOfWeek = "";

        if (totalDay % 7 == 1) {
            dayOfWeek += "월";
        }
        */


        return str;
    }

}
