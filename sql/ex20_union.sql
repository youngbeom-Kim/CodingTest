/*

union, 유니온
- 테이블을 합치는 기술
- union
- union all
- intersect
- minus
- 수학 집합 개념(교집합, 합집합, 차집합 등..)

*/

select name, age from tblMen;
select name, age from tblwomen;

select name, age from tblMen union select name, age from tblwomen;

select name, age from tblmen
union
select name, age from tblWomen;


-- [42804] ERROR: UNION types character varying and integer cannot be matched
-- 1. 각 컬럼의 순서에 맞게 자료형이 일치해야 한다.
select name, age from tblmen
union
select age, name from tblwomen;

-- 2. 컬럼의 자료형이 일치하더라도 + 데이터 성격(의미)까지 일치해야 한다.
select name, age from tblmen
union
select name, height from tblwomen;

-- [42601] ERROR: each UNION query must have the same number of columns
-- 3. 모든 select의 컬럼수는 일치해야 한다.
select name, age from tblmen
union
select name, age, height from tblwomen;



create table tblUnionA (
    name varchar(20) not null
);

create table tblUnionB (
    name varchar(20) not null
);

insert into tblUnionA values ('강아지');
insert into tblUnionA values ('고양이');
insert into tblUnionA values ('병아리');
insert into tblUnionA values ('송아지');
insert into tblUnionA values ('거북이');
insert into tblUnionA values ('늑대');
insert into tblUnionA values ('여우');

insert into tblUnionB values ('뱀');
insert into tblUnionB values ('타조');
insert into tblUnionB values ('비둘기');
insert into tblUnionB values ('강아지');
insert into tblUnionB values ('햄스터');
insert into tblUnionB values ('토끼');
insert into tblUnionB values ('고양이');

select * from tblUnionA;
select * from tblUnionB;

-- union : 두 테이블을 합쳤을 때 중복되는 행은 자동으로 제거
select * from tblunionA
union
select * from tblunionb;

-- union all : 두 테이블을 합쳤을 때 중복되는 행은 그대로 유지
select * from tblUnionA
union all
select * from tblunionb;

-- intersect : 두 테이블을 합쳤을 때 중복되는 행만 가져오기
select * from tblUnionA
intersect
select * from tblunionb;

-- except  : 차집합(A-B)
select * from tblUnionA
except
select * from tblUnionB;

select * from tblUnionB
except
select * from tblUnionA;
















