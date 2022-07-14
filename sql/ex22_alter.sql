/*

*** 테이블을 수정하는 상황을 만들지말고 미리 설계를 잘하자 ***

테이블 수정하기, alter table
- 테이블 수정하기 > 컬럼의 정의를 수정하기

테이블을 만들 때는 항상 주의해서 만들 것
alter을 써야한다는건 테이블을 잘못 만든 것

테이블 수정할 일이 발생
1. 테이블 수정하기 > 기존에 데이터 있음 > 여러가지 상황 발생 > 대처
2. 테이블 삭제하기 > 테이블 생성하기 > 기존 데이터 추가 //보편적인 방법

*/

drop table tblEdit;

create table tblEdit
(
    seq int primary key,
    data varchar(20) not null
);

insert into tblEdit values (1, '마우스');
insert into tblEdit values (2, '키보드');
insert into tblEdit values (3, '모니터');


-- 1. 새로운 컬럼 추가하기
alter table tblEdit
    add price int null;

-- [23502] ERROR: column "description" of relation "tbledit" contains null values
alter table tblEdit
    add description varchar(100) not null;

alter table tblEdit
    add description varchar(100) default '임시' not null;

select * from tblEdit;
delete from tblEdit;


-- 2. 컬럼 삭제하기
select * from tblEdit;

alter table tblEdit
    drop column description;

alter table tblEdit
    drop column seq; -- ** PK 삭제 금지 **


-- 3. 컬럼 수정하기
select * from tblEdit;

insert into tblEdit values (4, '노트북');
-- [22001] ERROR: value too long for type character varying(20)
insert into tblEdit values (5, '이번에 새로 출시된 가성비 높은 M1 맥북 에어');


-- 3.1 컬럼의 길이 수정하기
alter table tblEdit
     alter column data type varchar(100);

insert into tblEdit values (5, '이번에 새로 출시된 가성비 높은 M1 맥북 에어');


-- 3.2 컬럼의 자료형 바꾸기 > 되도록 사용 금지
select * from tblEdit;

alter table tblEdit
    alter column data type varchar(100);


-- 3.3 컬럼명 바꾸기 > 되도록 사용 금지
select * from tblEdit;

alter table tblEdit
    rename column data to name;


-- 제약 사항
drop table tblEdit;

create table tblEdit
(
    seq int,
    data varchar(20),
    color varchar(20)
);


-- PK 추가하기
alter table tblEdit
    add constraint tbledit_seq_pk primary key(seq);

insert into tblEdit values (1, '홍길동', '노랑');
-- [23505] ERROR: duplicate key value violates unique constraint "tbledit_seq_pk"
insert into tblEdit values (1, '홍길동', '노랑');

alter table tblEdit
    add constraint tbledit_color_ck check (color in ('노랑', '빨강', '파랑'));

-- [23514] ERROR: new row for relation "tbledit" violates check constraint "tbledit_color_ck"
insert into tblEdit values (2, '홍길동', '검정');
insert into tblEdit values (2, '홍길동', '파랑');

alter table tblEdit
    drop constraint tbledit_color_ck;

insert into tblEdit values (3, '홍길동', '검정');

















