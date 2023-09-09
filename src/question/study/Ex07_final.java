package question.study;

import java.util.Calendar;

public class Ex07_final {

    public static void main(String[] args) {

        //final
        // - 한번 만든건 고칠 수 없다. > 프로그램 안정성 위해
        //1. 변수에 적용
        //2. 메서드에 적용
        //3. 클래스에 적용

        //지역 변수에 final 키워드 적용 > final 변수, 상수
        // - (이름이 있는) 상수

        int a = 10; //일반 변수
        final int b = 20; //final 변수

        System.out.println(a);
        System.out.println(b);

        a = 30;

        //The final local variable b cannot be assigned.
        //값을 변경할 수 없다. -> final 변수
        //b = 40; //Cannot assign a value to final variable 'b'

        //상수명 표기법
        // - 일반 변수명과 구분
        // - 대문자 표시

        //파이값
        final double PI = 3.14;

        System.out.println(Calendar.YEAR);

        Calendar now = Calendar.getInstance();

        //A. 가독성 낮음 > 탈락
        System.out.println(now.get(1));

        //B. 가장 좋은 방법
        System.out.println(now.get(Calendar.YEAR));

        MyCalendar my = new MyCalendar();

        //C. 불편해서 탈락
        System.out.println(now.get(my.YEAR));

        //MyCalendar.YEAR = 2; //final 변수 > 값 변경 불가

        //D.
        System.out.println(now.get(MyCalendar.YEAR));

    }

}

class MyCalendar {

    public final static int YEAR = 1;

}

class FinalParent {

    //final 메서드
    // - 상속시 발생하는 안정성 문제때문에..
    // - 잘모르겠다 -> final로 만들어라
    public final void hello() {
        System.out.println("안녕하세요.");
    }

}

class FinalChild extends FinalParent {

    //'hello()' cannot override 'hello()' in 'Question.study.FinalParent'; overridden method is final
    //public void hello() {
    //    System.out.println("하이~");
    //}

}

//클래스 상속
// - 부모 클래스, 슈펴 클래스(Super), 기본 클래스
// - 자식 클래스, 서브 클래스(Sub), 확장 클래스, 파생 클래스

//final 클래스
final class Mouse {

}

//Cannot inherit from final 'Question.study.Mouse'
//class OpticalMoust extends Mouse {
//
//}
