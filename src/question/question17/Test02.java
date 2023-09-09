package question.question17;

//시간 클래스를 구현하시오.(생성자 오버로딩)
//조건
//클래스
//Time 시간 클래스 상태
//hour
// - 시 (0 이상 양의 정수)
//minute
// - 분 (0 이상 양의 정수)
//second
// - 초 (0 이상 양의 정수)
//Time 시간 클래스 행동
//public Time()
// - 기본 생성자
// - 시(0), 분(0), 초(0)
//public Time(int hour, int minute, int second)
// - 생성자 오버로딩
// - hour : 시, minute : 분, second : 초
//public Time(int minute, int second)
// - 생성자 오버로딩
// - minute : 분, second : 초
//public Time(int second)
// - 생성자 오버로딩
// - second : 초
//String info()
// - 2 : 30 : 45
public class Test02 {

    public static void main(String[] args) {

        //시간 1
        Time t1 = new Time();
        System.out.println(t1.info());

        //시간 2
        Time t2 = new Time(2, 30, 45);
        System.out.println(t2.info());

        //시간 3
        Time t3 = new Time(1, 70, 30);
        System.out.println(t3.info());

        //시간 4
        Time t4 = new Time(30, 10);
        System.out.println(t4.info());

        //시간 5
        Time t5 = new Time(90, 10);
        System.out.println(t5.info());

        //시간 6
        Time t6 = new Time(50);
        System.out.println(t6.info());

        //시간 7
        Time t7 = new Time(10000);
        System.out.println(t7.info());

    }
}
