package question19;

//MyHashMap
//추가, 수정 = void put(String key, String value)
//읽기 = String get(String key)
//크기 = int size()
//삭제 = void remove(String key)
//검색(key) = boolean containKey(String key)
//검색(value) = boolean containValue(String value)
//초기화 = void clear()
public class Main {

    public static void main(String[] args) {

        //배열 생성
        MyHashMap map = new MyHashMap();

        //추가
        map.put("국어", "합격");
        System.out.println(map);
        map.put("영어", "불합격");
        System.out.println(map);
        map.put("수학", "보류");
        System.out.println(map);
        map.put("과학", "합격");
        System.out.println(map);
        map.put("사회", "보류");
        System.out.println(map);

        //읽기
        System.out.println(map.get("국어"));
        System.out.println(map.get("영어"));
        System.out.println(map.get("수학"));

        //개수
        System.out.println(map.size());

        //수정
        map.put("영어", "합격");
        System.out.println(map.get("영어"));

        //삭제
        map.remove("영어");
        System.out.println(map.get("영어"));

        //검색(key)
        if (map.containKey("국어")) {
            System.out.println("국어 있음");
        } else {
            System.out.println("국어 없음");
        }

        //검색(value)
        if (map.containValue("합격")) {
            System.out.println("합격 있음");
        } else {
            System.out.println("합격 없음");
        }

        //초기화
        map.clear();
        System.out.println(map.size());

        System.out.println(map);

        System.out.println(map.get("국어"));

    }
}
