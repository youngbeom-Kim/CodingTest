/*

뷰, View
- DB Object 중 하나(테이블, 시퀀스, 제약사항, 뷰..)
- 가상 테이블, 테이블 복사본
- 뷰 테이블 > 실제 테이블처럼 취급한다.
- 뷰를 사용하면.. 코드 비용 절약 + 가독성 향상 + 생산성 향상 : 개발자 입장
- 뷰를 사용하면.. 네트워크 트래픽 감소 + 서버 처리 일부 생략 + 비용 감소 + 시스템 처리 속도 향상 : 시스템 입장
- 자주 사용하는 select의 결과를 저장하는 용도
- 뷰는 결과셋의 복사본이 아니라 select 쿼리 자체를 저장하는 객체이다. (*********************************************)
- 뷰는 읽기 전용으로 사용한ㄷ. (************************************* select만 사용)

뷰 생성하기
create view 뷰이름
as
select문;

뷰 삭제하기
drop view 뷰이름;

뷰의 종류
1. 단순 뷰
    - 하나의 테이블을 사용해서 만든 뷰

2. 복합 뷰
    - 두개 이상의 테이블을 사용해서 만든 뷰
    - join, union, subquery

*/

create view vwInsa
as
select * from tblInsa;

-- 뷰 호출하기(사용하기)
select * from vwinsa;
select * from tblInsa;

-- [42P07] ERROR: relation "vwinsa" already exists
create view vwInsa
as
select * from tblInsa;

-- 기존에 있던 뷰를 수정
create or replace view vwInsa
as
select * from tblInsa where buseo = '기획부';

select * from vwInsa;
select * from tblinsa;

-- 누군가가 날마다 tblInsa 테이블로부터 기획부 직원만을 가져오는 일을 반복한다.
-- 1.
select * from tblInsa where buseo = '기획부';
-- 2.
select * from vwinsa;



-- 남자 직원 테이블
create or replace view vwMale
as
select * from tblinsa where substr(ssn, 8, 1) = '1';

-- 남자 직원
select * from vwMale;



create or replace view vwDailyCheck
as
select
    m.name as "회원명",
    v.name as "비디오제목",
    r.rentdate as "대여날짜",
    g.period as "대여기간",
    case
        when r.retdate is null then '반납안함'
        when r.retdate is not null then '반납함'
    end as "반납상태",

    --현재시각 - 반납날짜
    case
        when r.retdate is null then round(current_date - (r.rentdate + g.period))
        when r.retdate is not null then null
    end as "연체기간"

from tblMember m
    inner join tblRent r
        on m.seq = r.member
            inner join tblVideo v
                on v.seq = r.video
                    inner join tblGenre g
                        on v.genre = g.seq;

select * from vwdailycheck;



-- 뷰는 테이블의 실시간 상태를 반영한다.
select * from tblstaff; -- 5명

create or replace view vwStaff
as
select name, address from tblStaff;

select * from vwStaff; -- 5명
select * from (select name, address from tblStaff) as s; -- 서브쿼리(인라인 뷰) > 익명(1회용 뷰)

-- delete from tblStaff where seq = 6;



/*

뷰는 테이블처럼 취급한다.
1. select : O
2. insert : X or O > X 테이블에 직접 넣어라. (뷰에 어떤 컬림리스트가 있는지 항상 알 수 없기때문에 쓰지 않는것을 권장)
3. update : X or O > X 테이블에 직접 수정해라.
4. delete : X or O > X 테이블에 직접 삭제해라.
5. join : O
6. union : O

*/

select * from tblStaff;
select * from vwStaff;

select * from tblgenre g
    inner join tblvideo t
        on g.seq = t.genre;

create or replace view vwGenre
as
select seq, name, price from tblgenre;

create or replace view vwVideo
as
select name, genre from tblvideo;

select * from vwGenre g inner join vwVideo v on g.seq = v.genre;

select * from tblGenre g inner join vwVideo v on g.seq = v.genre;

select name from vwGenre
union
select name from vwVideo;




















