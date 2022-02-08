package question14;

//Book 클래스를 설계하시오.
//Book 객체의 정보
// - 제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
//모든 멤버 변수의 접근 지정자는 private으로 한다.
//멤버 접근을 위한 Setter와 Getter를 정의한다.
// - 제목 : 읽기/쓰기, 최대 50자 이내 (한글, 영어, 숫자)
// - 가격 : 읽기/쓰기, 0 ~ 1000000원
// - 저자 : 읽기/쓰기, 제한 없음
// - 페이지수 : 읽기/쓰기, 1 ~ 무제한
// - 출판사 : 쓰기 전용
// - 발행년도 : 읽기 전용(2022년)
// - ISBN : 읽기/쓰기
//Book 객체의 모든 정보를 문자열로 반환하는 메소드를 구현한다.
// - String info()
//클래스가 잘 설계되었는지 객체를 가지고 사용해본다.
// - Book 객체 생성 -> 값 넣기 + 값 출력 등
public class Test01 {

    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setTitle("자바의 정석");
        book1.setPrice(27000);
        book1.setAuthor("남궁성");
        book1.setPage(987);
        book1.setPublisher("도우출판");
        book1.setIsbn("8994492038");
        System.out.println(book1.info());

    }
}

class Book {

    private String title;
    private int price;
    private String author;
    private String publisher;
    private String pubYear = "2022";
    private String isbn;
    private int page;

    //getter, setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.length() < 50 && title.length() >= 0) {
            for (int i = 0; i < title.length(); i++) {
                char check = title.charAt(i);
                if ((check >= '가' && check <= '힣')
                        || (check >= 'A' && check <= 'Z')
                        || (check >= 'a' && check <= 'z')
                        || (check >= '0' && check <= '9')
                        || (check == ' ')) {
                    this.title = title;
                } else {
                    this.title = "특수 문자는 사용이 불가능합니다.";
                    return;
                }
            }
        } else {
            this.title = "최대 50자 이내만 입력이 가능합니다.";
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0 && price <= 1000000) {
            this.price = price;
        } else {
            this.price = price;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //쓰기 전용
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //읽기 전용
    public String getPubYear() {
        return pubYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page >= 1) {
            this.page = page;
        } else {
            this.page = page;
        }
    }

    public String info() {

        String str = "";
        String newLine = "\n";

        str += "---------------------------\n";
        str += "제목 : " + getTitle() + newLine;

        if (price >= 0 && price <= 1000000) {
            str += String.format("가격 : %,d\n", this.price);
        } else {
            str += "0 ~ 1000000원만 입력이 가능합니다.\n";
        }

        str += "저자 : " + getAuthor() + newLine;

        if (page >= 1) {
            str += String.format("페이지수 : %,d\n", this.page);
        } else {
            str += "페이지 수는 1페이지 이상만 입력이 가능합니다.\n";
        }

        str += "출판사 : " + publisher + newLine;
        str += "발행년도 : " + getPubYear() + newLine;
        str += "ISBN : " + getIsbn() + newLine;
        str += "---------------------------\n";

        return str;
    }
}



















