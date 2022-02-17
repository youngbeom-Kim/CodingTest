package question18;

//MyArrayList
//추가 : add(String name)
//탐색 : get(int index)
//크기 : int size()
//수정 : set(int index, String name)
//제거 : remove(int index)
//삽입 : add(int index, String name)
//검색 : indexOf()
//초기화 : clear()
public class Main {

    public static void main(String[] args) {

        //배열 생성
        MyArrayList list = new MyArrayList();

        //추가
        list.add("홍길동");
        list.add("아무개");
        list.add("김철수");
        list.add("김영희");
        list.add("김맹구");
        list.add("김훈이");
        list.add("김유리");

        //읽기
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println();

        //크기
        System.out.println(list.size());
        System.out.println();

        //탐색 + 읽기
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //수정
        list.set(0, "김짱구");
        System.out.println(list.get(0));
        System.out.println();

        //삭제
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //삽입
        list.add(1, "김형만");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //검색
        if (list.indexOf("홍길동") > -1) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }

        if (list.indexOf("김유리") > -1) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }

        //초기화
        list.clear();
        System.out.println(list.size());

    }
}
