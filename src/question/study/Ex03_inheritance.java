package question.study;

public class Ex03_inheritance {

    public static void main(String[] args) {

        //Object 클래스
        // - java.lang 패키지(자바 기본 패키지) import 하지않아도 됨
        // - 루트 클래스(모든 클래스의 조상 - 단군)
        // - Class object is the root of the class hierarchy.
        // - Every class has Object as a superclass.
        // - All objects, including arrays, implement the methods of this class.

        System.out.println(); //녹색 동그라미 안에 C(System, String) 자바 기본 패키지

        Object o = new Object();

        Item2 item = new Item2();
        item.a = 10;
        item.b = 20;

    }

}

//부모를 지정하지 않으면 강제로 100% extends Object를 상속 받음
class Item2 extends Object { //우리가 만드는 클래스들에는 extends Object가 생략되어있음
    public int a;
    public int b;
}
