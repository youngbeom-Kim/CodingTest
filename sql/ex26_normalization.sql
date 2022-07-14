/*

정규화, Normalization
- 자료의 손실이나 불필요한 정보를 없애고, 데이터의 일관성을 유지하고, 데이터의 종속을 최소화하기 위해 자료구조(ERD)를 수정하는 작업
- 우리가 만든 테이블(비정형, 비정규화 상태) > 정규화 > 정규화된 구조
- 제 1 정규화 > 제 2 정규화 > 제 3 정규화
- 1 ~ 3 정규화 + 역정규화

관계형 데이터베이스 시스템이 지향하는 데이터베이스의 상태
1. 최대한 null 상태의 셀을 가지지 않는다.
2. 중복값을 저장하지 않는다.
3. 하나의 셀 > 단일값 저장(분리될 수 없는 원자값)

정규화 목적
1. null 제거
2. 중복값 제거
3. 자료 삽입, 갱신, 삭제에 따른 이상 현상 제거 > 데이터 무결성 보장

이상 현상
1. 삽입 이상(Insertion Anormaly)
- 특정 테이블에 데이터를 삽입할 때 원하지 않는 데이터까지 같이 넣어야 하는 상황

2. 갱신 이상(Update Anormaly)
- 동일한 데이터가 2개 이상의 테이블에 존재 > 그 중 1개는 수정했지만, 다른 1개를 수정 못했을 때
    > 두 데이터간의 이상 오류가 발생 > 2개 데이터 중 어떤 데이터가 올바른 데이터인지 구분 못하는 상황

3. 삭제 이상(Deletion Anormaly)
- 특정 테이블에서 데이터를 삭제할 때 원하지 않는 데이터까지 같이 지워야 하는 상황


함수 종속(Functional Dependency)
- 하나의 테이블내 컬럼끼리의 관계를 표현
- 정규화는 '부분 함수 종속'이나 '이행 함수 종속'을 모두 없애고, 모든 컬럼의 관계를 '완전 함수 종속'으로 만드는 작업이다.
1. 완전 함수 종속, Full Functional Dependency
2. 부분 함수 종속, Partial Functional Dependency
    - 일부 컬럼이 복합키 모두에게 종속되는 것이 아니라, 복합키 일부에게만 종속
3. 이행 함수 종속, Transitive Functional Dependency


정규화
- 1NF ~ 3NF (Normal Form)
- 1개 테이블 > (정규화) > 2개 이상의 테이블

제 1 정규화, 1NF
- 모든 컬럼(속성)의 원자값을 가진다.
- 여러개로 분리 가능한 값을 1개의 컬럼안에 넣지 말것

제 2 정규화, 2NF
- 기본 키가 아닌 모든 컬럼은 기본키에 완전 함수 종속이어야 한다.
- 부분 함수 종속을 발견해서 부분 함수 종속을 제거한다. (2NF)
- 복합키를 사용할 때 사용

제 3 정규화, 3NF
- 기본 키가 아닌 모든 컬럼은 기본키에 완전 함수 종속이어야 한다.
- 이행 함수 종속을 발견해서 이행 함수 종속을 제거한다. (3NF)

역정규화
- 정규화된 결과를 다시 원래대로 되돌리는 작업
- 2개 테이블 > 1개 테이블
- 논란이 많은 정규화
- 역정규화는 사용하지 말것


1. ERD 작성 중 발생하는 사례
2. 복합키 생성하는 방법

*/

create table tblScore
(
    num int primary key,                -- 학번
    subject varchar(50) primary key,    -- 과목
    name varchar(50),                   -- 이름
    score varchar(2)                    -- 성적
);

create table tblScore
(
    num int,                -- 학번
    subject varchar(50),    -- 과목
    name varchar(50),       -- 이름
    score varchar(2),       -- 성적

    constraint tblScore_num_subject_pk primary key(num, subject) -- 복합키(Composite Key)
);

create table tblReview
(
    seq int primary key,                -- PK
    cmt varchar(1000) not null,         -- 후기
    pnum int not null,                  -- FK
    psubject varchar(50) not null,      -- FK

    constraint tblreview_pnum_psubject_fk foreign key(pnum, psubject) references tblScore(num, subject)
);

insert into tblScore values (1001, '자바', '홍길동', 'A');
insert into tblScore values (1001, '오라클', '홍길동', 'B');
insert into tblScore values (1002, '자바', '아무개', 'B+');

select * from tblScore;


-- '홍길동'의 자바 점수?
select score from tblScore where num = 1001; -- 점수(score)는 복합키(num, subject)에 완전 종속이기 때문에
select score from tblScore where subject = '자바';
select score from tblScore where num = 1001 and subject = '자바'; -- PK를 조건으로 사용
select score from tblScore where name = '홍길동'; -- 사용 금지 : 동명이인


-- 리뷰 작성
insert into tblReview (seq, cmt, pnum, psubject) values (1, '복습을 더 열심히 해야겠다.', 1001, '자바');
insert into tblReview (seq, cmt, pnum, psubject) values (2, '미리 준비하자.', 1001, '오라클');

select * from tblReview;

select * from tblScore s
    inner join tblReview r
        on s.num = r.pnum and s.subject = r.psubject;











