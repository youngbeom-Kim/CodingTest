package question14;

//Note 클래스를 설계하시오.
//조건
//Note 객체의 정보
// - 크기, 표지 색상, 페이지수, 소유자이름, 가격
//모든 멤버 변수의 접근 지정자는 private으로 한다.
//멤버 접근을 위한 Setter와 Getter를 정의한다.
// 크기 : 쓰기 전용, A3, A4, A5, B3, B4, B5
// 표지 색상 : 쓰기 전용, 검정색, 흰색, 노란색, 파란색
// 페이지수 : 쓰기 전용, 10 ~ 200페이지 이내
// (+) 10 ~ 50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
// 소유자 이름 : 스기 전용, 한글 2 ~ 5자 이내, 필수값
// 가격 : Setter, Getter 구현 안함. 추후 info() 메소드에서 사용하기 위해 아래와 같은 규칙으로 계산
// (+) 기본 노트 : A5 + 흰색 + 10페이지 = 가격(500원)
// (+) 크기 변경 : A5(+400원), A4(200원), B3(+500원), B4(+300원), B5(+100원)
// (+) 색상 변경 : 검정색(+100원), 노란색(+200원), 파란색(+200원)
// (+) 페이지수 변경 : 페이지 당 x 10원 추가
// Note 객체의 정보를 확인하기 위한 메소드를 구현한다.
// - String info()
// Note가 잘 설계되었는지 객체를 가지고 사용해본다.
// - Note 객체 생성 -> 값 넣기 + 값 출력 등
public class Test02 {

    public static void main(String[] args) {

        Note note = new Note();
        note.setSize("B4");
        note.setColor("노란색");
        note.setPage(25);
        note.setOwner("홍길동");
        System.out.println(note.info());

        Note note2 = new Note();
        note2.setSize("A4");
        note2.setColor("검정색");
        note.setPage(100);
        System.out.println(note2.info());


    }
}

class Note {

    private String size = "A5";
    private String color = "흰색";
    private int page = 10;
    private String owner;
    private int price;

    //getter, setter 구현

    public void setSize(String size) {
        if (size.equals("A3") || size.equals("A4") || size.equals("A5")
                || size.equals("B3") || size.equals("B4") || size.equals("B5")) {
            this.size = size;
        } else {
            return;
        }
    }

    public void setColor(String color) {
        if (color.equals("흰색") || color.equals("검정색")
                || color.equals("노란색") || color.equals("파란색")) {
            this.color = color;
        } else {
            return;
        }
    }

    public void setPage(int page) {
        if (page >= 10 && page <= 200) {
            this.page = page;
        } else {
            this.page = page;
        }
    }

    public void setOwner(String owner) {
        for (int i = 0; i < owner.length(); i++) {
            if (owner.length() >= 2 && owner.length() <= 5) {
                char check = owner.charAt(i);
                if (check >= '가' && check <= '힣') {
                    this.owner = owner;
                } else {
                    return;
                }
            } else {
                this.owner = "이름은 한글 2 ~ 5자 이내만 가능합니다.";
            }
        }
    }

    public String info() {

        int price = 500;
        if (size.equals("A3")) {
            price += 400;
        } else if (size.equals("A4")) {
            price += 200;
        } else if (size.equals("B3")) {
            price += 500;
        } else if (size.equals("B4")) {
            price += 300;
        } else if (size.equals("B5")) {
            price += 100;
        }

        if (color.equals("검정색")) {
            price += 100;
        } else if (color.equals("노란색")) {
            price += 200;
        } else if (color.equals("파란색")) {
            price += 200;
        }

        int count = 0;
        for (int i = 10; i < page; i++) {
            count++;
        }
        price += count * 10;

        String thickness = "";
        if (page >= 10 && page <= 50) {
            thickness += "얇은";
        } else if (page >= 51 && page <= 100) {
            thickness += "보통";
        } else if (page >= 101 && page <= 200) {
            thickness += "두꺼운";
        } else {
            thickness += "노트는 10 ~ 200장 사이만 가능합니다.";
            return thickness;
        }

        String str = "";
        str += "■■■■■■ 노트 정보 ■■■■■■\n";
        str += String.format("소유자 : %s\n", owner);
        str += String.format("특성 : %s %s %s노트\n", color, thickness, size);
        str += String.format("가격 : %,d원\n", price);
        str += "■■■■■■■■■■■■■■■■■■■■■\n";

        if (str.indexOf("null") > 0) {
            str = "";
            str += "■■■■■■ 노트 정보 ■■■■■■\n";
            str += "주인 없는 노트\n";
            str += "■■■■■■■■■■■■■■■■■■■■■\n";
        }

        return str;
    }

}





















