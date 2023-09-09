package question.question15;

import java.util.Calendar;

//과자(Bugles) 클래스를 설계하시오.
//조건
//Bugles 객체의 정보
// - 가격, 용량, 생산일자, 유통기한
//모든 멤버 변수의 접근 지정자는 private으로 한다.
//멤버 접근을 위한 Setter와 Getter를 정의한다.
// - 용량 : 쓰기 전용, 300g, 500g, 850g
// - 가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
// - 생산일자 : 쓰기 전용(Calendar)
// - 남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
//Bugles 객체 메소드
// - void eat() : 과자 먹기
public class Test01 {

    public static void main(String[] args) {

        Bugles snack = new Bugles();
        snack.setWeight(500);
        snack.setCreationTime("2022-02-10");
        System.out.println("가격 : " + snack.getPrice() + "원");
        System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
        snack.eat();

        System.out.println();

        Bugles snack2 = new Bugles();
        snack2.setWeight(300);
        snack2.setCreationTime("2022-02-05");
        System.out.println("가격 : " + snack2.getPrice() + "원");
        System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
        snack2.eat();

    }
}

class Bugles {

    private int price;
    private int weight;
    private Calendar creationTime;
    private int expiration;

    //getter, setter 구현

    public int getPrice() {
        if (weight == 300) {
            this.price = 850;
        } else if (weight == 500) {
            this.price = 1200;
        } else if (weight == 850) {
            this.price = 1950;
        }
        return price;
    }

    public void setWeight(int weight) {
        if(weight == 300 || weight == 500 || weight == 850) {
            this.weight = weight;
        }
    }

    public void setCreationTime(String string) {
        int year;
        int month;
        int date;
        year = Integer.parseInt(string.substring(0,4));
        month = Integer.parseInt(string.substring(5,7));
        date = Integer.parseInt(string.substring(8,10));

        this.creationTime = Calendar.getInstance();

        this.creationTime.set(year, month-1, date);
    }

    public int getExpiration() {

        Calendar now = Calendar.getInstance();
        long nowtime = now.getTimeInMillis();
        long creationtime = creationTime.getTimeInMillis();
        if (weight == 300) {
            return expiration = 7 - (int) ((nowtime - creationtime) / 1000/ 60 / 60 / 24);
        } else if (weight == 500) {
            return expiration = 10 - (int) ((nowtime - creationtime) / 1000/ 60 / 60 / 24);
        } else if (weight == 850) {
            return expiration = 15 - (int) ((nowtime - creationtime) / 1000/ 60 / 60 / 24);
        }

        return 0;
    }

    public void eat() {
        if (this.expiration >= 0) {
            System.out.println("과자를 맛있게 먹었습니다.");
        } else {
            System.out.println("유통기한이 지나 먹을 수 없습니다.");
        }

    }

}
