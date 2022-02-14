package question17;

//학생 클래스를 구현하시오.(생성자 오버로딩)
//조건
//클래스 Student
//학생 클래스 상태
// - name 이름
// - age 나이
// - grade 학년
// - classNumber 반
// - number 번호
//학생 클래스 행동
//public Student()
// - 기본 생성자
// - 이름("미정), 나이(O), 학년(O), 번호(O)
//public Student(String name, int age, int grade, int classNumber, int number)
// - 생성자 오버로딩
//public Student(String name, int age)
// - 생성자 오버로딩
//public Student(int grade, int classNumber, int number)
// - 생성자 오버로딩
//String info()
// - 이름(나이 : 0세, 학년 : 0, 반 : 0, 번호 : 0)
public class Test01 {

    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1.info());

        Student s2 = new Student("홍길동", 13);
        System.out.println(s2.info());

        Student s3 = new Student(3, 10, 30);
        System.out.println(s3.info());

        Student s4 = new Student("아무개", 12, 1, 5, 11);
        System.out.println(s4.info());

    }
}
