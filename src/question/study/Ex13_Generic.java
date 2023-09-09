package question.study;

import java.util.Random;

public class Ex13_Generic {

    public static void main(String[] args) {

        Bag<String> b1 = new Bag<String>();

        b1.a = 10;
        b1.b = "문자열";
        b1.c = "문자열";

        //제네릭의 타입변수 -> 무조건 참조형만 넣을 수 있다.
        // int(X) -> Integer
        // double -> Double
        // boolean -> Boolean
        Bag<Integer> b2 = new Bag<Integer>();

        b2.a = 10;
        b2.b = "문자열";
        b2.c = 20;

        Bag<Random> b3 = new Bag<Random>();

        b3.c = new Random();

        //제네릭의 타입 변수 -> Object 변수와 마찬가지로 일종의 만능 주머니 역할

        Shirts<Boolean> s1 = new Shirts<Boolean>();

        s1.a = true;
        s1.b = false;
        s1.c = true;

        Board<Double> d1 = new Board<Double>();

        d1.a = 3.14;
        d1.test(5.43);
        System.out.println(d1.get());

        Camera<Integer, String> c1 = new Camera<>();
        c1.a = 10;
        c1.b = "문자열";

        Camera<Boolean, Double> c2 = new Camera<>();
        c2.a = true;
        c2.b = 3.14;

    }

}

//제네릭 클래스 > 매개변수의 역활과 비슷함
// - T : 타입 변수
class Bag<T> {

    //멤버 구현
    public int a;
    public String b;
    public T c;

}

class Shirts<T> {

    public T a;
    public T b;
    public T c;

}

class Board<T> {

    public T a;

    public void test(T a) {

        //메서드 내의 지역변수용으로는 지양
        //T b;

    }

    public T get() {
        return a;
    }

}

//T를 쓰는 이유는 Type의 약자, 굳이 T를 안써도 됨
class Camera<T, U> {
    public T a;
    public U b;
}


















