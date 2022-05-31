package study;

import java.util.HashMap;

public class Ex15_Anonymous {

    public static void main(String[] args) {

        /*

        익명 객체, Anonymous Object
        - 익명 클래스, Anonymous Class
        - 이름이 없는 클래스(객체)
        - 반드시 인터페이스를 사용해서 사용한다. (상속 관게 사용)

        람다식을 이용할 때 이용하면 편함

        */

        //요구사항] 좌표를 저장할 객체 생성

        //Case 1.
        // - 장점 : 간단핟.
        // - 단점 : 관리가 힘들다.
        int x1 = 100;
        int y1 = 200;


        //Case 2.
        // - 장점 : 집합
        // - 단점 : 가독성 낮음
        int[] p2 = new int[2];

        p2[0] = 100;
        p2[1] = 200;


        //Case 3.
        // - 장점 : 집합, 가독성 높음, 동일한 틀 사용(모든 좌표 객체의 성질 + 사용법)
        // - 단점 : 고비용
        // - 가장 추천하는 방법!!
        Point p3 = new Point();

        p3.x = 100;
        p3.y = 200;

        Point p6 = new Point();

        p6.x = 300;
        p6.y = 400;


        //Case 4.
        // - 장점 : 클래스 사용과 동일한 효과
        // - 단점 : 틀이 없음
        // - 객체를 1개만 만들 때 사용. 동일한 구조를 가지는 객체를 2개 이상 만들 때는 비추천
        // > 차라리 클래스를 사용한다.
        HashMap<String, Integer> p4 = new HashMap<>();

        p4.put("x", 100);
        p4.put("y", 200);

        HashMap<String, Integer> p5 = new HashMap<>();
        //기본 틀이 없기 때문에 이전 틀과 다를 수 있음
        p5.put("b", 300);


        //Case 5.
        //익명 객체 사용
        // - 데이터 저장용 객체(X)
        // - 메소드 호출용 객체(O)

        //AAA a = new AAA(); 인터페이스이기 때문에 객체 생성 불가
        //진짜로 객체가 만들어졌다고 가정했을 때 구현부가 없기 때문에 실행이 불가능
        BB b = new BB();

        b.test();
        b.output();

        AA c = new BB(); //업캐스팅

        c.test();
        //c.output(); > AA를 통해서 객체를 유추하기 때문에 BB를 사용할거라 생각을 못함

        //재사용이 불가능함 구현부가 지정되어있음
        AA d = new AA() /* class의 이름이 익명 */ {
            @Override
            public void test() {
                System.out.println("구현");
            }
        };

        d.test();

        AA e = new AA() {
            @Override
            public void test() {

            }
        };

    }

}

class Point { //p3의 규칙
    public int x;
    public int y;
}

interface AA {
    void test();
}

class BB implements AA {

    public void test() {
        System.out.println("인터페이스 구현 객체의 test() 메소드");
    }

    public void output() {
        System.out.println("본인이 직접 구현한 output() 메소드");
    }

}
















