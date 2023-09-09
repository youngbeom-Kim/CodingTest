package question.study;

public class Ex09_Interface {

    public static void main(String[] args) {

        //Ex64_Interface.java

        /*

        인터페이스, interface
        - 클래스 -> 추상클래스 -> 인터페이스 -> 열거형 -> 제너릭 :: 자료형
        - 모두 클래스
        - 추상 클래스와 유사
            - 객체 생성 불가능
            - 변수 생성 가능(참조형 형변환)
            - 추상 메서드 소유 가능
        - 추상 클래스와 차이
            - 구현 멤버를 가지지 못함
            - 일반 변수, 일반 메서드 가지지 못함 -> 구현부를 가질 수 없다.
        - 추상 메서드의 집합 -> 규칙

        일반 클래스 = 변수 + 메서드
        추상 클래스 = 변수 + 메서드 + 추상 메서드
        인터페이스 = 추상 메서드

        추상 클래스와 인터페이스 역할 -> 클래스의 부모 역할 : 상속

        */

        MK100 k2 = new MK100();

        k2.serialNumber = 10;
        k2.keyDown("A"); //일반 멤버 -> 공통 기능
        k2.light(); //추상 멤버 구현 -> 특수 기능
        k2.sound(); //MK100 고유 기능

        PT200 k3 = new PT200();

        k3.serialNumber = 20;
        k3.keyDown("A"); // -> 공통 기능
        k3.light(); // -> 특수 기능
        k3.wireless(); //PT200 고유 기능


        //Cannot instantiate the type IMember
        //IMember m1 = new IMember();
        //m1.aaa();
        //m1.bbb();

        //인터페이스로부터 만들어진 상속은 내부도 다르게 구성이 되어있음
        Member m1 = new Member();

        if (m1.login("hong", "1111")) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }

        m1.logout(); //공통 기능 -> 내부 구현은 다름 -> 추상 메서드
        m1.point(); //개별 기능 -> 회원만

        Administrator a1 = new Administrator();
        System.out.println(a1.login("admin", "1111"));

    }

}

abstract class Keyboard {

    public int serialNumber; //구현 멤버

    //구현 멤버 - 자식들이 종류에 상관없이 항상 이 기능을 둥일한 결과를 냈으면 한다.
    public void keyDown(String key) {
        System.out.println(key + "를 눌렀습니다.");
    }

    //추상 멤버 - 자식들이 종류가 다르면 각자 하고 싶은걸 구현했으면 한다.
    //        - 기능이 달라도 사용법은 동일하게 만들었으면 한다. -> 최종 사용자때문에
    public abstract void light(); //추상 멤버

}

class MK100 extends Keyboard {

    public void light() {
        System.out.println("빨간색");
    }

    //자신만의 멤버 구현
    public void sound() {
        System.out.println("뽁뽁");
    }

}

class PT200 extends Keyboard {

    public void light() {
        System.out.println("노란색");
    }

    //자신만의 멤버 구현
    public void wireless() {
        System.out.println("");
    }

}

//회원이 가져야할 (행동)규칙 - 메서드
interface IMember {

    //추상 메서드만 올 수 있다.
    //인터페이스의 멤버는 무조건 공개를 원칙으로 한다. -> public

    //일반 멤버 변수는 못만든다.
    //public int num;

    //추상메서드는 바디를 만들지 못한다. 일반 멤버 메서드는 못만든다.
    //public void test() {

    //}
    //public abstract void aaa(); //public abstract는 무조건 있어야하므로 생략이 가능
    //void bbb(); //public abstract void bbb();

    //인터페이스 앞에다가 I를 자주 붙임 (인터페이스 구분법)

    boolean login(String id, String pw);
    void logout();

}

//일반 클래스 extends 일반 클래스
//일반 클래스 extends 추상 클래스
//일반 클래스 implements 인터페이스

class Member implements IMember {

    public boolean login(String id, String pw) {

        if (id.equals("hong") && pw.equals("1111")) {
            return true;
        } else {
            return false;
        }

    }

    public void logout() {
        System.out.println("로그아웃");
    }

    public void point() {
        System.out.println("일반 회원 -> 출근 도장 -> 마일리지 100pt");
    }

}

class Administrator implements IMember {

    public boolean login(String id, String pw) {
        return false;
    }

    public void logout() {

    }

    public void log() {
        System.out.println("로그 확인");
    }

}











