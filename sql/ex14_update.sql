/*

1. select
2. insert
3. update
4. delete

update문
- DML
- 원하는 행의 원하는 컬럼값을 수정하는 명령어
- update 테이블명 set 컬럼명 = 수정할 값;
- update 테이블명 set 컬럼명 = 수정할 값 [, 컬럼명 = 수정할 값] x N [where 절];

*/

commit;
rollback; -- 실행했던 명령을 취소하는 명령어

select * from tblcountry;

-- 대한민국 수도 : 서울 > 제주
update tblcountry set capital = '제주'; -- 덮어쓰기 (where 문이 없는 update *위험*)
update tblcountry set capital = '제주' where name = '대한민국'; -- 딱 1개의 레코드만 찾아야하는 상황 > PK 컬럼 조건
update tblcountry set capital = '제주' where capital = '서울'; -- 이건 동작은 되지만 만약 다른 나라의 수도가 '서울'이면 에러 발생 안함.

-- 대한민국 수도 : 땅(+10), 인구수(+20%)
update tblcountry set area = area + 10, population = population * 1.2 where name = '대한민국';

-- 절대 하면 안되는 행동***
select * from tblInsa; -- num(PK) : 직원 번호

/*
update tblInsa set
    num = 2000
        where num = 1001; -- 절대 하면 안됨!!
 */