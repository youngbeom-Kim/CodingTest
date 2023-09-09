package question.study;

public class Ex16_Collection {

    public static void main(String[] args) {

        /*

        자바 컬렉션 인터페이스
        1. Collection 인터페이스
            - List와 Set의 부모

        2. List 인터페이스
            - ArrayList, Stack, LinkedList, Vector, Queue
            - 순서가 있는 데이터 집합(*****************)
            - 방번호가 있다. (첨자(index) 사용) -> 요소 접근
            - 데이터 중복을 허용합니다. -> 방번호가 유일하기 때문에 같은 데이터도 방번호를 통해서 구분할 수 있다.

        3. Set 인터페이스
            - HashSet, TreeSet
            - 순서가 없는 데이터 집합(********)
            - 방번호가 없다. (첨자 없음)
            - 데이터 중복을 허용 안한다.(********************)

        4. Map 인터페이스
            - HashMap, TreeMap, HashTable, Properties
            - 순서가 없는 집합(********)
            - 키와 값을 사용(***********************) -> 연관 배열, 딕셔너리
            - key에는 주로 String만 씀
            - 키(key) : 식별자 역할(방 번호 역할) > 유일해야한다. > 중복허용안함 > Set
            - 값(value) : 데이터 역할 > 중복 허용 함 > List

            * Vector, HashTable, Properties : 사용 안함.
            Legacy Class. 예전 시스템의 호환성을 위해서 남겨놓은 문법
            > 언젠가 버전업이 되면서 사라질 수 도 있는 문법

            Vector > ArrayList
            HashTable > HashMap
            Properties > 폐기 > XML, JSON 기술

        */

    }
}
