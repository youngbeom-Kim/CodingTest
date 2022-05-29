package study;

public class Ex10_Interface {

    public static void main(String[] args) {

        //상속
        // - 상속의 구성원이 될 수 있는 요소
        // - 일반클래스, 추상클래스, 인터페이스

        // 일반클래스, 추상클래스, 인터페이스 관계
        //   [자식]        [부모]
        //1. 일반클래스      일반클래스   : O
        //2. 일반클래스      추상클래스   : O
        //3. 일반클래스      인터페이스   : O
        //4. 추상클래스      일반클래스   : O (절대 사용 안함)
        //5. 인터페이스      일반클래스   : X (절대 불가능), 구현된 멤버를 상속하기 때문에
        //6. 추상클래스      인터페이스   : O (추상클래스도 추상메서드를 가질 수 있어서)
        //7. 인터페이스      추상클래스   : X (5번과 동일)
        //8. 추상클래스      추상클래스   : O
        //9. 인터페이스      인터페이스   : O
        //10.일반클래스 -> 일반클래스 -> 추상클래스 -> 추상클래스 -> 인터페이스 -> 인터페이스

    }

}

class AAAA {
    //일반 클래스 -> 구현된 멤버만 가질 수 있다.
    public int a;
    //추상클래스가 아닌곳에서는 추상메서드를 사용할 수 없다.
    //public abstract void test();
}

abstract class BBBB extends AAAA {
    //public int a;
    //추상 클래스 -> 구현된 멤버도 가질 수 있다.
}

//interface CCCC implements AAAA {
    //인터페이스 -> 추상 멤버만 가질 수 있다.
    //public int a;
//}

interface CCCC {
    void test(); //추상 메서드
}

abstract class DDDD implements CCCC {
    //인터페이스에서 상속받은 추상 메서드.
    //1. 그대로 가지고 있는다.
    //2. 구현한다.
    //void test(); //추상클래스는 추상메서드를 가질 수 있어서 오버라이드 강제를 안함
    //CCCC(할아버지 클래스)가 물려준 추상 메서드를 DDDD(아버지 메서드)에서 구현했으면
    //FFFF(자식 메서드)는 추상메서드를 구현하지 않아도 되지만
    //DDDD(아버지 메서드)에서 구현하지 않았으면 FFFF(자식 메서드)가 추상 메서드를 구현해야 된다.
    public void test() { //구현

    }
}

class FFFF extends DDDD {
    public void test() { //재정의

    }
}

class EEEE implements CCCC {
    //void test(); //일반 클래스는 추상 메서드를 못씀
    public void test() {

    }
}








