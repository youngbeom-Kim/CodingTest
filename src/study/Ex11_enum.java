package study;

public class Ex11_enum {

    public static void main(String[] args) {

        //열거형, Enumeration
        // - 클래스의 일종
        // - 열거값을 가지는 자료형(= 제시한 값 중에서 선택해서 사용하는 자료형)
        // - 상속의 구성원이 될 수 없다.

        //상황] 의류 쇼핑몰 > 고객 > 티셔츠 > 색상 선택
        // - 색상 : 빨강, 파랑, 노랑

        //Case 1.
        // - 주관식 > 오타 > 고객 + 개발자
        // - 구현하기 편함
        // - 가독성 좋음
        // - 유효성 검사 필수(***)
        String color = "blue";
        System.out.println(color);

        if (color.equals("blue")) {

        }

        //Case 2.
        // - 객관식
        // - 구현하기 편함
        // - 가독성 낮음(코드상)
        // - 유효성 검사(*)
        // - 많이 사용
        // 1. red
        // 2. blue
        // 3. yellow

        int color2 = 1;
        System.out.println(color2);

        if (color2 == 1) {

        }

        //Case 3.
        // - 열거형
        // - 객관식에 가까운 방식
        // - 가독성 높음(코드상에서)
        // - 유효성 검사 필요 없음
        Color color3 = Color.RED;

    }

}

//Cup이라는 클래스로 진짜 컵(객체)를 만들면 몇 종류? -> 많음....
//이런 종류는 열거형으로 만들면 안됨
class Cup {
    public String name;
}

//성별을 표현하고 싶은 자료형 (남자, 여자) -> 내가 만든 자료형으로 객체화가 된다면 딱 2종류밖에 없음
//열거형의 멤버는 전부 대문자로 적는다.
enum Gender {
    MALE,
    FEMALE
}

enum Color {
    RED, //public final static int YEAR = 1;
    BLUE,
    YELLOW
}

enum 직급 {
    부장,
    과장,
    대리,
    사원
}



















