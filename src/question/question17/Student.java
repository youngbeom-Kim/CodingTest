package question.question17;

public class Student {

    private String name;
    private int age;
    private int grade;
    private int classNumber;
    private int number;

    public Student() {
        this.name = "미정";
        this.age = 0;
        this.grade = 0;
        this.classNumber = 0;
        this.number = 0;
    }

    public Student(String name, int age, int grade, int classNumber, int number) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int grade, int classNumber, int number) {
        this.name = "미정";
        this.grade = grade;
        this.classNumber = classNumber;
        this.number = number;
    }

    public String info() {

        String str = "미정";

        return String.format("%s (나이 : %s / 학년 : %s / 반 : %s / 번호 : %s)\n"
                , this.name
                , this.age == 0 ? str : this.age + "세"
                , this.grade == 0 ? str : this.grade
                , this.classNumber == 0 ? str : this.classNumber
                , this.number == 0 ? str : this.number);

    }

}
