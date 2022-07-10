/*

insert문
- 데이터를 테이블에 추가하는 명령어(행 추가, 레코드 추가)
- insert into 테이블명 (컬럼리스트) values (값리스트);

*/

drop table tblmemo;

create table tblmemo
(
    seq int primary key,                        -- 메모번호(PK)
    name varchar(30) default '익명' not null,    -- 작성자
    memo varchar(1000) not null,                -- 메모
    regdate date default current_date           -- 작성일
);

drop sequence seqmemo;

create sequence seqmemo;

select * from tblmemo;

-- 1. 표준 : 원본 테이블에 정의된 컬럼 리스트 순서대로 값리스트를 작성하는 방식
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '홍길동', '메모입니다', current_date);

-- 2. 컬럼리스트의 순서와 값리스트의 순서는 반드시 일치해야한다. (*************)
-- [22007] ERROR: invalid input syntax for type date: "메모입니다."
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), current_date, '홍길동', '메모입니다.');
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '메모입니다.', '홍길동', current_date);

-- 3. 원본 테이블 선언된 컬럼 순서와 무관하게 insert를 만들 수 있다.
-- 컬럼리스트의 순서와 값리스트의 순서만 맞으면 얼마든지 재구성할 수 있다.
insert into tblMemo (memo, name, seq, regdate) values ('메모입니다.', '홍길동', nextval('seqmemo'), current_date);

-- 4. SQL 오류 : [42601] ERROR: INSERT has more target columns than expressions
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '메모입니다.', current_date);

-- 5. SQL 오류 : [42601] ERROR: INSERT has more expressions than target columns
insert into tblMemo (seq, name, regdate) values (nextval('seqmemo'), '홍길동', '메모입니다.', current_date);


-- 6. null 컬럼 조작(regdate) > regdate null / regdate date default current_date null
-- 6.1 null컬럼에 값을 대입O
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '홍길동', '메모입니다.', current_date);

-- 6.2 null컬럼에 값을 null 대입O > 명시적으로 null 대입
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '홍길동', '메모입니다.', null);

-- 6.3 null컬럼에 값을 null 대입O > 암시적으로 null 대입
insert into tblMemo (seq, name, memo) values (nextval('seqmemo'), '홍길동', '메모입니다.');


-- 7. default 제약 처리 방법
-- 7.1 값을 넣는다.
insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '홍길동', '메모입니다.', current_date);

-- 7.2 default 적용
insert into tblMemo (seq, memo, regdate) values (nextval('seqmemo'), '메모입니다', current_date);

-- 7.3 default 상수 사용
insert into tblmemo (seq, name, memo, regdate) values (nextval('seqmemo'), default, '메모입니다.', default);


----------------------------------

insert into tblMemo (seq, name, memo, regdate) values (nextval('seqmemo'), '홍길동', '메모입니다', current_date);

-- 컬럼 리스트를 생략할 수 있다.
insert into tblMemo values (nextval('seqmemo'), '홍길동', '메모입니다', current_date);

-- 컬럼 리스트를 생략하려면 반드시 값리스트는 테이블 컬럼 순서대로만 작성해야 한다.
insert into tblMemo values (nextval('seqmemo'), '메모입니다.', '홍길동', current_date);

-- 컬럼 리스트를 생략하려면 반드시 값리스트는 생략이 불가능하다. (모든 값을 명시적으로 작성해야 한다.)
insert into tblMemo values (nextval('seqmemo'), '홍길동', '메모입니다.');

-- default 사용
insert into tblMemo values (nextval('seqmemo'), '홍길동', '메모입니다.', default);

select * from tblMemo;

----------------------------------

/*

table 복사
단점 : 제약 사항이 복사가 안된다. (PK, NOT NULL 생성X)
테스트용으로만 사용

*/

create table tblMemoCopy
(
    seq int primary key,                        -- 메모번호(PK)
    name varchar(30) default '익명' not null,    -- 작성자
    memo varchar(1000) not null,                -- 메모
    regdate date default current_date           -- 작성일
);

-- tblMemo > tblMemoCopy 복사

insert into tblMemoCopy select * from tblmemo;

select * from tblMemoCopy;

-- tblComedian > tblComedianMale
create table tblComedianMale
as
    select * from tblcomedian where gender = 'm';

select * from tblComedianMale;

drop table tblComedianMale;



