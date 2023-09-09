package question.study;

public class Ex06_Override {

    public static void main(String[] args) {

        //흔히 볼 수 있는 오버라이드 사례

        Time t1 = new Time();
        Time t2 = new Time(2, 30, 40);

        System.out.println(t1.info());
        System.out.println(t2.info());

    }

}

class Time {

    private int hour;
    private int min;
    private int sec;

    //서비스 차원
    public Time() {
        this(0, 0, 0); //다른 생성자 호출하기
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public String info() {

        //t1 -> 00:00:00
        //t2 -> 02:30:40

        return String.format("%02d:%02d:%02d", this.hour, this.min, this.sec);

    }

    //Object 클래스가 물려준 toString()이 맘에 안들어서 내가 다시 수정함
    // -> Object.toString() -> (재정의) -> 되도록 해당 객체가 가지고 있는 데이터를 문자열로 반환하도록 재정의한다.
    @Override
    public String toString() {

        //return "Time{" +
        //        "hour=" + hour +
        //        ", min=" + min +
        //        ", sec=" + sec +
        //        '}';

        return String.format("%02d:%02d:%02d", this.hour, this.min, this.sec);

    }


}
