package question.study;

public class Ex12_Generic {

    public static void main(String[] args) {

        //제네릭, Generic
        // - 제네릭 클래스(**)
        // - 제네릭 메서드

        //요구사항] 클래스 설계
        // - 원칙 > 멤버 변수 1개 > 클래스의 모든 행동이 그 멤버 변수를 중심으로 구현

        WrapperInt n1 = new WrapperInt(100);
        System.out.println(n1);
        System.out.println(n1.getData() * 2); //int * int
        System.out.println();

        WrapperObject n2 = new WrapperObject(200); //업캐스팅
        System.out.println(n2);
        System.out.println((int) n2.getData() * 2); //다운캐스팅 //Object * int
        System.out.println();

        Wrapper<Integer> n3 = new Wrapper<Integer>(300);
        System.out.println(n3);
        System.out.println(n3.getData() * 2); //표시가 Integer로 뜸
        System.out.println();

        WrapperString s1 = new WrapperString("홍길동");
        System.out.println(s1);
        System.out.println(s1.getData());
        System.out.println(s1.getData().length());
        System.out.println();

        WrapperObject s2 = new WrapperObject("아무개"); //업캐스팅
        System.out.println(s2);
        System.out.println(s2.getData());
        System.out.println(((String) s2.getData()).length());
        System.out.println();

        Wrapper<String> s3 = new Wrapper<String>("하하하");
        System.out.println(s3);
        System.out.println(s3.getData().length());
        System.out.println();

        WrapperBoolean b1 = new WrapperBoolean(true);
        System.out.println(b1);
        System.out.println(b1.getData() ? "참" : "거짓");
        System.out.println();

        WrapperObject b2 = new WrapperObject(false);
        System.out.println(b2);
        System.out.println((boolean) b2.getData() ? "합격" : "불합격");
        System.out.println();

        Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
        System.out.println(b3);
        System.out.println(b3.getData() ? "O" : "X");

        //WrapperInt + WrapperString + WrapperBoolean + ...WrapperXXX
        //WrapperObject > 가독성이 무척 떨어짐

        //Object 장점
        // - 모든 자료형을 넣을 수 있다. > 코드 비용 감소

        //Object 단점
        // - 데이터를 꺼내서 활용할 때 어떤 자료형의 데이터가 들어 있었는지 알기 힘들다.
        // - 잘못된 형변환을 할 수 있다. > 예외 발생 > 프로그램 안정성 감소

    }

}

/*

Wrapper Class > 무언가를 감싸서 구현해놓은 클래스
1. int를 중심으로 하는 클래스 구현
2. String을 중심으로 하는 클래스 구현
3. Boolean을 중심으로 하는 클래스 구현
4. short
5. byte
6. long
7. float
8. double
9. char
10. Random
11. Calendar
12. Student
.... 결론 : 무제한

*/

//1. int
class WrapperInt {

    private int data; //주인공. 클래스의 중심 요소

    public WrapperInt(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public String toString() {
        return this.data + "";
    }

}

//2. String
class WrapperString {

    private String data;

    public WrapperString(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public String toString() {
        return this.data + "";
    }

}

//3. boolean
class WrapperBoolean {

    private Boolean data;

    public WrapperBoolean(Boolean data) {
        this.data = data;
    }

    public void setData(Boolean data) {
        this.data = data;
    }

    public Boolean getData() {
        return this.data;
    }

}

//4. Object
class WrapperObject {

    private Object data;

    public WrapperObject (Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public String toString() {
        return this.data + "";
    }

}

//Generic
class Wrapper<T> {

    private T data;

    public Wrapper(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public String toString() {
        return this.data + "";
    }

}



















