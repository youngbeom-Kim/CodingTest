/*

DML
- 데이터 조작어

DDL
- 데이터 정의어
- 데이터베이스 객체를 생성/수정/삭제한다.
- 데이터베이스 객체 : 테이블, 뷰, 인덱스, 트리거, 프로시저, 제약사항, 유저 등..
- create, alter, drop


1. 테이블 생성하기
2. 테이블 삭제하기


1. 테이블 생성하기
- 테이블을 구성하는 컬럼들을 정의!!

create table 테이블명
(
    컬럼 정의,
    컬럼 정의,
    컬럼 정의,
    컬럼명 자료형(길이) 제약사항
);


제약 사항, Constraint ***************************
- 해당 컬럼에 들어갈 데이터(값)에 대한 조건(규제)
    > 조건을 만족하지 못하면 > 데이터 거부 > 테이블에 넣지 못한다.(에러 발생)
    > 유효성 검사 도구(***) > 테이블 데이터 유효

1. not null
    - 해당 컬럼은 반드시 값을 가져야한다.
    - 셀에 데이터가 없으면 에러
    - 필수값(***)

2. primary key, PK
    - 기본키
    - 유일한다. + not null
    - 테이블의 모든 행들 중에 같은 컬럼값을 가지는 행이 있으면 안된다.
    - 테이블의 모든 행들을 유일하게 구분하는 역할을 가지는 컬럼(키)
    - 모든 테이블은 반드시 primary key를 가져야 한다. primary key가 없는 테이블을 생성할 수 있지만 사용 시 문제가 많음
    - 기본키의 형태
        a. 단일 기본키(기본키) > 1개의 컬럼이 PK 역할
        b. 복합 기본키(복합키) > 2개 이상의 컬럼이 모여서 PK 역할

3. foreign key
    - (join)과 함께 공부

4. unique
    - 해당 컬럼이 유일해야 한다.
    - null값을 가질 수 있다.
    - 식별자로 사용이 불가능하다. (null 때문에)

5. check
    - where절에서 사용했던 조건
    - 사용자 정의 제약 조건

6. default
    - 기본값 설정
    - 해당 컬럼에 값을 대입하지 않으면 미리 준비한 값을 넣는다.

*/

-- drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int,            -- 메모 번호
    name varchar(30),   -- 작성자
    memo varchar(1000), -- 메모
    regdate date        -- 작성날짜
);

-- 데이터 추가하기
-- insert into 테이블 (컬럼리스트) values (값리스트)

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', current_date);
insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동입니다. 하하하하하', '메모입니다.', current_date);
-- insert into tblMemo (seq, name, memo, regdate) values (3, '홍길동', , current_date);
insert into tblMemo (seq, name, memo, regdate) values (3, '홍길동', null, current_date);
insert into tblMemo (seq, name, memo, regdate) values (4, null , null, null);
insert into tblMemo (seq, name, memo, regdate) values (null, null, null, null); -- 절대 하지 말것!!

select * from tblMemo;

-- 고객 > 2번째 메모를 보고 싶습니다 > select
select * from tblMemo where seq = 1;



drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int not null,            -- 메모 번호
    name varchar(30) null,   -- 작성자
    memo varchar(1000) not null, -- 메모
    regdate date null           -- 작성날짜
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다', current_date);

-- [23502] ERROR: null value in column "memo" of relation "tblmemo" violates not-null constraint
-- insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동', null, current_date);

insert into tblMemo (seq, name, memo, regdate) values (3, null, '메모입니다.', null);

-- [23502] ERROR: null value in column "seq" of relation "tblmemo" violates not-null constraint
-- insert into tblMemo (seq, name, memo, regdate) values (null, '홍길동', '메모입니다', current_date);

select * from tblmemo;



drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int primary key,            -- 메모 번호(PK)
    name varchar(30) null,          -- 작성자
    memo varchar(1000) not null,    -- 메모
    regdate date null               -- 작성날짜
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다', current_date); -- O

-- [23502] ERROR: null value in column "seq" of relation "tblmemo" violates not-null constraint
-- insert into tblMemo (seq, name, memo, regdate) values (null, '홍길동', '메모입니다', current_date);

-- [23505] ERROR: duplicate key value violates unique constraint "tblmemo_pkey"
-- insert into tblMemo (seq, name, memo, regdate) values (1, '아무개', '메모입니다.22222', current_date);

select * from tblMemo;


/*

- 단일 기본키
[번호**]  [이름]    [메모]
1        홍길동     메모입니다.
2        아무개     하하하하
3        호호호     메모에요~


- 복합 키(Composite Key)
[이름**]  [과목**]  [성적]
홍길동     국어      100
홍길동     영어      90
홍길동     수학      80
아무개     영어      95
아무개     수학      88
호호호     국어      77


[번호**]  [이름]    [과목]    [성적]
1        홍길동     국어      100
2        홍길동     영어      90
3        홍길동     수학      80
4        아무개     영어      95
5        아무개     수학      88
6        호호호     국어      77

*/


drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int primary key,            -- 메모 번호(PK)
    name varchar(30) unique,          -- 작성자
    memo varchar(1000) not null,    -- 메모
    regdate date null               -- 작성날짜
);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', current_date);

-- [23505] ERROR: duplicate key value violates unique constraint "tblmemo_name_key"
-- insert into tblMemo (Seq, name, memo, regdate) values (2, '홍길동', '메모입니다.', current_date);

insert into tblMemo (seq, name, memo, regdate) values (3, null, '메모입니다.', current_date);

select * from tblMemo;

/*

설문조사 or 투표
일련번호 : Primary key
선택 : not null
이름 : not null > 중복 투표가능하다. 익명 투표가 불가능하다.
이름 : unique > 중복 투표가 불가능하다. 익명 투표가 가능하다.
이름 : unique + not null > 중복 투표가 불가능하다. 익명 투표가 불가능하다. > Primary key와 동일

*/


drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int primary key,            -- 메모 번호(PK)
    name varchar(30) unique,          -- 작성자
    memo varchar(1000) not null,    -- 메모
    regdate date null,               -- 작성날짜
    -- color varchar(30) not null check (color = 'red' or color = 'yellow' or color = 'blue'),
    color varchar(30) not null check (color in ('red', 'yellow', 'blue')),
    page int check (page between 10 and 100) not null
);

-- [42601] ERROR: INSERT has more target columns than expressions
-- insert into tblMemo (seq, name, memo, regdate, color, page) values (1, '홍길동', '메모입니다', current_date, 'red');

insert into tblMemo (seq, name, memo, regdate, color, page) values (1, '홍길동', '메모입니다', current_date, 'red', 100);

-- [23514] ERROR: new row for relation "tblmemo" violates check constraint "tblmemo_page_check"
-- insert into tblMemo (seq, name, memo, regdate, color, page) values (2, '아무개', '메모입니다', current_date, 'red', 200);

insert into tblMemo (seq, name, memo, regdate, color, page) values (2, '아무개', '메모입니다', current_date, 'red', 50);

select * from tblmemo;



drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int primary key,                     -- 메모 번호(PK)
    name varchar(30) default '익명',          -- 작성자
    memo varchar(1000) not null,             -- 메모
    regdate date default current_date        -- 작성날짜
);

insert into tblmemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다', current_date);

insert into tblmemo (seq, name, memo, regdate) values (2, null, '메모입니다.', null);

insert into tblmemo (seq, memo) values (3, '테스트입니다.'); -- default 사용

select * from tblmemo;



/*

제약 사항을 만드는 방법
1. 컬럼 수준에서 만드는 방법
    - seq number(3) primary key
    - 컬럼을 정의할 때 제약 사항도 같이 정의하는 방법

2. 테이블 수준에서 만드는 방법
    - 컬럼 정의와 제약 사항 정의를 분리하는 방법

*/

drop table tblMemo;

create table tblMemo
(
    -- 컬럼명 자료형(길이) 제약사항
    seq int,            -- 메모 번호(PK)
    name varchar(30) not null,          -- 작성자
    memo varchar(1000) not null,    -- 메모
    regdate date not null,               -- 작성날짜

    -- 제약 사항 정의
    -- constraint 제약사항명 제약사항
    constraint tblmemo_seq_pk primary key(seq),
    constraint tblmemo_memo_ck check (length(memo) > 20),
    constraint tblmemo_name_uq unique(name)
);

-- [23514] ERROR: new row for relation "tblmemo" violates check constraint "tblmemo_memo_ck"
-- insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.', current_date);

insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.추가합니다.추가합니다.추가합니다.', current_date);

-- [23505] ERROR: duplicate key value violates unique constraint "tblmemo_seq_pk"
-- insert into tblMemo (seq, name, memo, regdate) values (1, '홍길동', '메모입니다.추가합니다.추가합니다.추가합니다.', current_date);

-- [23505] ERROR: duplicate key value violates unique constraint "tblmemo_name_uq"
-- insert into tblMemo (seq, name, memo, regdate) values (2, '홍길동', '메모입니다.추가합니다.추가합니다.추가합니다.', current_date);

