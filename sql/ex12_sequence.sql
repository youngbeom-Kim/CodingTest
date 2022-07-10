/*

시퀀스, sequence
- 데이터베이스 객체 중 하나
- 식별자를 생성하는 역할 (도구) -> 주로 PK 컬럼에서 많이 사용한다.

시퀀스 객체 생성하기
- create sequence 시퀀스명;

시퀀스 객체 삭제하기
- drop sequence 시퀀스명;

시퀀스 객체 사용하기
- nextval(시퀀스명)
- currval(시퀀스명)

*/

create sequence seqNum;

select nextval('seqNum'); -- 1

select name, buseo, jikwi, nextval('seqNum') from tblinsa; -- 2 ~ 61

-- 숫자번호
select nextval('seqNum'); -- 62

-- 문자 + 숫자 조합 번호
select 'A' || nextval('seqNum'); -- 상품 코드 (A1, A2... A9, A10... A99,A100)


create sequence seqProduct;
create sequence seqProduct2;

-- A001, A002, A003...
select 'A' || ltrim(to_char(nextval('seqProduct'), '000'));

-- A002001
select 'A' || ltrim(to_char(nextval('seqProduct'), '000')) || ltrim(to_char(nextval('seqProduct2'), '000'));


drop table tblMemo;

create table tblMemo
(
    seq int primary key,
    name varchar(30) not null,
    memo varchar(1000) not null,
    regdate date default current_date
);

create sequence seqMemo;

insert into tblMemo (seq, name, memo, regdate) values (nextval('seqMemo'), '홍길동', '메모입니다', current_date);

select * from tblMemo;



-- currVal : 마지막으로 생성한 번호를 반환. 상태 확인 사용 peek()
select currval('seqNum');
select currval('seqMemo');

select nextval('seqMemo');

select max(seq) + 1 from tblMemo;


-- if 개발 끝 > 런칭
-- 1. 번호는 중요하지 않다. 그냥 그대로 간다.
-- 2. 기왕이면 1로 다시 시작하게 만들자.
delete from tblMemo;

select * from tblMemo;

-- 시퀀스 객체를 리셋하는 방법
-- 1. 삭제 > 다시 생성
-- 2. 수정
drop sequence seqMemo;
create sequence seqMemo;

-- [55000] ERROR: currval of sequence "seqmemo" is not yet defined in this session
select currVal('seqMemo');

select * from tblMemo;


insert into tblMemo (seq, name, memo, regdate) values (nextVal('seqMemo'), '홍길동', '메모입니다', current_date);

select * from tblMemo;

commit;

select currVal('seqMemo');

/*

시퀀스 객체의 캐시 사용

시퀀스 객체 생성하기
- create sequence 시퀀스명;

- create sequence 시퀀스명
        increment by N (시퀀스 증감치 지정(양수, 음수))
        start with N (시작값(seed))
        maxvalue N (최댓값(넘으면 에러))
        minvalue N (최솟값(넘으면 에러))
        cycle (순환)
        cache N (메모리에 N 이라는 숫자를 이미 가져옴)

*/

drop sequence seqTest;

create sequence seqTest
    -- increment by 2;
    -- start with 3;
    -- maxvalue 5;
    -- minvalue 1;
    -- cycle;
    cache 10;

select nextval('seqTest');








