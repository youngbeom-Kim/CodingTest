package study;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex14_Iterator {

    public static void main(String[] args) {

        //컬렉션 > 탐색 도구
        // - 컬렉션의 요소들을 순차*** 탐색하는 도구
        // 1. Enumeration (X)
        // 2. Iterator (*******)
        // 3. ListIterator (***)

        m1();

    }

    private static void m1() {

        //Iterator
        // - 컬렉션 프레임워크에서 저장된 요소를 읽어오는 방법을 표준화하기 위한 역할
        // - List, Set 계열 지원
        // - 읽기 전용
        // - 향상된 for문과 유사

        ArrayList<String> list = new ArrayList<>();

        list.add("사과");
        list.add("포도");
        list.add("바나나");
        list.add("딸기");
        list.add("복숭아");

        //list -> 탐색 -> 루트
        //1. 일반 for문 : index 사용(O)
        //2. 향상된 for문 : index 사용(X)
        //3. iterator : index 사용(X)

        // - iterator를 지원하는 컬렉션은 iterator() 라는 메소드를 구현한다.
        Iterator<String> iter = list.iterator();

        //1. hasXXX()
        //2. nextXXX()

//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());
//
//        System.out.println(iter.hasNext());
//        System.out.println(iter.next());


    }

}



















