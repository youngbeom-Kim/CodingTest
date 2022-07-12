-- 직원 + 프로젝트 테이블
drop table tblStaff;

create table tblStaff
(
    seq int primary key,            -- 직원 번호(PK)
    name varchar(30) not null,      -- 직원명
    salary int not null,            -- 급여
    address varchar(300) not null,  -- 거주지
    project varchar(300) not null   -- 담당 프로젝트
);

insert into tblStaff values (1, '홍길동', 300, '서울시', '홍콩 수출');
insert into tblStaff values (2, '아무개', 250, '인천시', 'TV 광고');
insert into tblStaff values (3, '하하하', 300, '의정부시', '매출 분석');

-- 홍길동 + 프로젝트 1건 추가
insert into tblStaff values (4, '홍길동', 300, '서울시', '고객 관리');

-- 호호호 + 프로젝트 2건
insert into tblStaff values (5, '호호호', 300, '서울시', '일본 수출, 대리점 개설');


/*

************************************************8
관계형 데이터베이스가 싫어하는 것!!!!!
1. null 상태의 셀. null 이 다량으로 발생하는 상태를 싫어한다.
2. 동일한 데이터가 2군데 이상 동시에 존재하는 것을 싫어한다. > 중복값
3. 하나의 셀에 분리가 가능 데이터가 들어있는 것을 싫어한다. > 원자화

*/

-- 홍콩 수출건을 담당하는 직원명?
select name from tblStaff where project = '홍콩 수출';

-- 일본 수출건을 담당하는 직원명?
select name from tblStaff where project = '일본 수출';
select name from tblStaff where position('일본 수출' in project) > 0;

select * from tblStaff;



-- 직원 테이블 + 프로젝트 테이블
drop table tblStaff;
drop table tblProject;

-- 직원 테이블 (부모 테이블)
create table tblStaff
(
    seq int primary key,            -- 직원 번호(PK)
    name varchar(30) not null,      -- 직원명
    salary int not null,            -- 급여
    address varchar(300) not null   -- 거주지
);

-- 프로젝트 테이블 (자식 테이블)
create table tblProject
(
    seq int primary key,                            -- 프로젝트 번호(PK)
    project varchar(300) not null,                  -- 담당 프로젝트
    staff int not null references tblStaff(seq)     -- 담당 직원 번호
);

insert into tblStaff values (1, '홍길동', 300, '서울시');
insert into tblStaff values (2, '아무개', 250, '인천시');
insert into tblStaff values (3, '하하하', 350, '부산시');

insert into tblproject values (1, '홍콩 수출', 1);
insert into tblproject values (2, 'TV 광고', 2);
insert into tblproject values (3, '매출 분석', 3);
insert into tblproject values (4, '대리점 분양', 1);
insert into tblproject values (5, '홈쇼핑 판매', 3);

select * from tblStaff;
select * from tblproject;


-- **
-- A. 신입 사원 입사 > 신규 프로젝트 담당
-- A.1 신입 사원 추가(O)
insert into tblStaff values (4, '호호호', 200, '성남시');

-- A.2 신규 프로젝트 추가(O)
insert into tblproject values (6, '자재 매입', 4);


-- B. 신입 사원 입사 > 신규 프로젝트 담당
-- B.1 문제 발생
-- [23503] ERROR: insert or update on table "tblproject" violates foreign key constraint "tblproject_staff_fkey"
-- insert into tblproject values (7, '고객 유치', 5);


-- C. '홍길동' 퇴사
commit;
rollback;

-- C.1 '홍길동' 삭제(O)
-- 문제 발생
-- [23503] ERROR: update or delete on table "tblstaff" violates foreign key constraint "tblproject_staff_fkey" on table "tblproject"
-- delete from tblStaff where name = '홍길동';


-- D. '홍길동' 퇴사
-- D.1 '홍길동'의 모든 업무 > 위임 //업무 인수 인계
update tblProject set staff = 2 where staff = 1; -- 담당자 교체(1 > 2)

-- D.2 '홍길동' 삭제
delete from tblStaff where name = '홍길동';



------------------------------------------------------------

-- 관계가 있는 부모/자식 테이블
-- 1. 생성 : 부모 > 자식
-- 2. 삭제 : 자식 > 부모

drop table tblUser;
drop table tblOrder;

-- 쇼핑몰. 고객
create table tblUser
(
    seq int primary key,            -- 고객번호(PK)
    name varchar(30) not null,      -- 고객명
    address varchar(300) not null   -- 주소(배송지)
);

-- 쇼핑몰. 주문
create table tblOrder
(
    seq int primary key,                        -- 주문번호(PK)
    price int not null,                         -- 주문액
    orderdate date not null,                    -- 주문날짜
    useq int not null references tblUser(seq)   -- 고객번호
);

insert into tblUser values (1, '홍길동', '서울시 강남구 역삼동');
insert into tblUser values (2, '아무개', '서울시 강남구 대치동');
insert into tblUser values (3, '하하하', '서울시 강동구 천호동');

insert into tblOrder values (1, 30000, '2020-10-01', 1); -- 홍길동
insert into tblOrder values (2, 50000, '2020-10-03', 2); -- 아무개
insert into tblOrder values (3, 100000, '2020-10-04', 1); -- 홍길동
-- [23503] ERROR: insert or update on table "tblorder" violates foreign key constraint "tblorder_useq_fkey"
-- insert into tblOrder values (4, 200000, '2020-10-05', 5); -- 5번 고객

update tblUser set name = ' ', address = ' ' where seq = 1; -- 회원탈퇴

select * from tblUser;
select * from tblOrder;
select * from tblUser where seq = 1;

/*

관계를 맺고 있는 2개의 테이블을 조작하면 발생하는 일
- 이 규칙이 깨지면 데이터 무결성(유효성)이 깨진다. > 데이터의 가치가 상실된다.

1. 부모 테이블 조작
    a. 행 추가(insert) : 아무 영향 없음
    b. 행 수정(update) : 아무 영향 없음
    c. 행 삭제(delete) : 자식 테이블에 자신을 참조하는 행이 존재하는지 반드시 사전 체크 > PK

2. 자식 테이블 조작
    a. 행 추가(insert) : 자신이 참조하는 대상이 실제로 존재하는 값인지 사전 체크 > FK
    b. 행 수정(update) : 수정할 컬럼이 FK가 아니면 아무 영향 없음. 수정할 컬럼이 FK이면 a와 동일
    c. 행 삭제(delete) : 아무 영향 없음

*/



------------------------------------------------------------

-- 고객 테이블
create table tblCustomer
(
    seq int primary key,            -- 고객번호(PK)
    name varchar(30) not null,      -- 고객명
    tel varchar(15) not null,       -- 연락처
    address varchar(100) not null   -- 주소
);

-- 판매 테이블
create table tblSales
(
    seq int primary key,                 -- 판매번호
    item varchar(50) not null,             -- 제품명
    qty int not null,                    -- 수량
    regdate date default current_date not null,  -- 판매날짜
    cseq int not null references tblCustomer(seq) -- 고객번호(FK)
);


-- 장르
create table tblGenre
(
    seq int primary key,             -- 장르번호(PK)
    name varchar(30) not null,         -- 장르명
    price int not null,              -- 대여가격(원)
    period int not null              -- 대여기간(일)
);

create sequence seqGenre;


-- 비디오
create table tblVideo
(
    seq int primary key,                         -- 비디오번호(PK)
    name varchar(100) not null,                     -- 제목
    qty int not null,                            -- 수량
    company varchar(50) null,                      -- 제작사
    director varchar(50) null,                     -- 감독
    major varchar(50) null,                        -- 주연배우
    genre int not null references tblGenre(seq)  -- 장르번호(FK)
);

create sequence seqVideo;

-- 회원
create table tblMember
(
    seq int primary key,                     -- 회원번호(PK)
    name varchar(30) not null,                 -- 회원명
    grade int not null,                   -- 회원등급(1,2,3)
    byear int not null,                   -- 생년
    tel varchar(15) not null,                  -- 연락처
    address varchar(300) null,                 -- 주소
    money int not null                       -- 예치금
);

create sequence seqMember;


-- 대여
create table tblRent
(
    seq int primary key,                             -- 대여번호(PK)
    member int not null references tblMember(seq),   -- 회원번호(FK)
    video int not null references tblVideo(seq),     -- 비디오번호(FK)
    rentdate date default current_date not null,             -- 대여날짜
    retdate date null,                                  -- 반납날짜
    remart varchar(500) null                           -- 비고
);

create sequence seqRent;



------------------------------------------------------------

/*

테이블(결과셋)을 합치는 기술
1. union : 세로 병합
2. join : 가로 병합

조인, join
- (서로 관계를 맺고 있는) 2개(1개) 이상의 테이블의 내용을 가져와서 1개의 결과셋으로 만드는 작업
- select 결과셋 + select 결과셋 = 결과셋

조인의 종류
1. 단순 조인, cross join, 카티션 곱(데카르트 곱)
2. 내부 조인, inner join
3. 외부 조인, outer join
4. 셀프 조인, self join
5. 전체 외부 조인, full outer join

*/

-- 1. 단순 조인, cross join, 카티션 곱(데카르트 곱)
-- 더미 생성용 (다량의 데이터를 만들기 위해서, 테스터 용)
select * from tblCustomer; -- 3명
select * from tblSales; -- 9건

select * from tblCustomer cross join tblSales; -- 27개
select * from tblSales cross join tblCustomer; -- 27개

-- [42702] ERROR: column reference "seq" is ambiguous
select name, item, seq from tblCustomer cross join tblSales;
select name, item, tblCustomer.seq, tblSales.seq from tblCustomer cross join tblSales;

-- 컬럼의 별칭, 테이블의 별칭
select name, item, c.seq, s.seq from tblCustomer c cross join tblSales s;

select name, item, c.seq, s.seq -- 2
from tblCustomer c cross join tblSales s; -- 1



/*

2. 내부 조인, inner join ************************
- 단순 조인에서 유효한 레코드만을 추출하는 조인 > 조인 결과셋을 유요하게 만든다.

select 컬럼리스트
    from 테이블A
        inner join 테이블B
            on 테이블A.컬럼 = 테이블B.컬럼; -- 유효한 레코드를 찾기 위한 조건

*/

-- 주문내역과 함께 고객 정보를 가져오시오.
select * from tblCustomer a
    inner join tblSales b
        on a.seq = b.cseq;


-- 직원 정보와 함께 그 직원이 담당하고 있는 프로젝트 정보를 함께 가져오시오.
-- 직원명(tblStaff)과 담당 프로젝트명(tblProject)을 가져오시오
select * from tblStaff; -- 3행
select * from tblProject; -- 6행

select * from tblStaff s
    inner join tblProject p
        on s.seq = p.staff; -- 6행

-- [21000] ERROR: more than one row returned by a subquery used as an expression
-- select seq, name, (select project from tblProject where staff = tblStaff.seq) from tblStaff;

select seq, project, staff from tblProject;

select project, (select name from tblStaff where seq = tblProject.staff) as name from tblProject;



-- 비디오 제목과 대여가격을 알고 싶습니다.
select * from tblGenre; -- 부모
select * from tblVideo; -- 자식

select v.name as vname, g.name as gname, g.price from tblGenre g
    inner join tblVideo v
        on g.seq = v.genre; -- 부모테이블.PK = 자식테이블.FK

select * from tblInsa;
select * from tblMen;


select * from tblInsa i
    inner join tblMen m
        on i.name = m.name;


-- 회원 + 대여
select
    m.name as 회원명,
    v.name as 비디오제목,
    r.rentdate as "대여날짜",
    g.period as "대여기간",
    case
        when r.rentdate is null then '반납안함'
        when r.rentdate is not null then '반납함'
    end as 반납상태,

    -- 현재시각 - 반납날짜
    case
        when r.retdate is null then round(current_date - (r.rentdate + g.period))
        when r.retdate is not null then null
    end as "연체기간"
from tblMember m                                    -- A
        inner join tblRent r                        -- + B
            on m.seq = r.member                     -- A & B 연결 조건
                inner join tblVideo v               -- + C
                    on v.seq = r.video              -- B & C 연결 조건
                        inner join tblGenre g       -- + D
                            on v.genre = g.seq;     -- C & D 연결 조건

select * from tblRent;
select * from tblGenre;



/*

3. 외부 조인, outer join **********************
- 내부 조인 + 부모 테이블
- 내부 조인의 결과셋 + 결과셋에 들어가지 않은 부모 테이블의 나머지 레코드도 포함

select 컬럼리스트
    from 테이블A
        left|right outer join 테이블B
            on 테이블A.컬럼 = 테이블B.컬럼

*/

insert into tblStaff values (5, '유재석', 400, '서울시');
insert into tblStaff values (6, '강호동', 450, '마산시');

select * from tblStaff; -- 5명
select * from tblProject; -- 6건

-- inner join : 두 테이블에 공통으로 있는 데이터만 가져온다.
-- 현재 프로젝트를 담당하고 있는 직원 명단과 프로젝트 정보를 가져와라.
select * from tblStaff s
    inner join tblProject p
        on s.seq = p.staff;

-- outer join : inner join + 조인되지 못한 부모테이블 나머지 행
-- 프로젝트를 담당O, 담당X > 모든 직원을 가져와라. 단 프로젝트 담당 중이면 프로젝트 정보도 같이 가져와라.
select * from tblStaff s
    left outer join tblProject p
        on s.seq = p.staff

-- 회원들 중 대여 기록이 있는 회원 정보만 가져와라.(+ 대여 정보)
select * from tblMember m
    inner join tblRent r
        on m.seq = r.member;

-- 대여 기록이 있던 없던 모든 회원 정보를 가져와라.
select * from tblMember m
    left outer join tblRent r
        on m.seq = r.member;



/*

4. 셀프 조인, self join
- 1개의 테이블을 사용해서 조인
- 단순 조인 + 셀프 조인
- 내부 조인 + 셀프 조인
- 외부 조인 + 셀프 조인
- 자기가 자기를 참조하는 외래키를 가진 테이블을 대상으로 한다.
- 자주 없음

*/

-- 직원 테이블
create table tblSelf
(
    seq        int primary key,                          -- 직원번호(PK)
    name       varchar(30) not null,                     -- 직원명
    department varchar(50) null,                         -- 부서
    super      int         null references tblSelf (seq) -- 상사번호(FK), 자기 참조
);

insert into tblSelf values (1, '홍사장', null, null);
insert into tblSelf values (2, '김부장', '영업부', 1);
insert into tblSelf values (3, '이과장', '영업부', 2);
insert into tblSelf values (4, '정대리', '영업부', 3);
insert into tblSelf values (5, '최사원', '영업부', 4);
insert into tblSelf values (6, '박부장', '개발부', 1);
insert into tblSelf values (7, '하과장', '개발부', 6);

select * from tblSelf;

-- 직원 명단을 가져오시오.
select
    s1.name as 직원명,
    s1.department as 부서명,
    s2.name as 상사명
from tblSelf s1                 -- 직원 테이블 역할
    left outer join tblSelf s2  -- 상사 테이블 역할
        on s1.super = s2.seq;











