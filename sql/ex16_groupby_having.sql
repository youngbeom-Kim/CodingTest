/*

group by절
- 레코드들을 특정 컬럼값 (1개 or 그이상)을 기준으로 그룹을 나누는 역할
- 그룹을 왜 나누는지?
    > 나눠진 그룹을 대상 > 각각의 그룹 > 집계 함수를 적용하기 위해서(count, sum, avg, max, min)

select 컬럼리스트
from 테이블
where 조건
group by 그룹조건
order by 정렬조건

1. from 테이블
2. where 조건
3. group by 그룹조건
4. select 컬럼리스트
5. order by 정렬조건

*/

-- tblInsa. 부서별로 평균 급여가 얼마인가?
select * from tblinsa;

select floor(avg(basicpay)) from tblinsa; -- 1,556,526

select distinct buseo from tblInsa;

select floor(avg(basicpay)) from tblInsa where buseo = '총무부'; -- 1,714,857
select floor(avg(basicpay)) from tblInsa where buseo = '개발부'; -- 1,387,857
select floor(avg(basicpay)) from tblInsa where buseo = '영업부'; -- 1,601,512
select floor(avg(basicpay)) from tblInsa where buseo = '기획부'; -- 1,855,714
select floor(avg(basicpay)) from tblInsa where buseo = '인사부'; -- 1,533,000
select floor(avg(basicpay)) from tblInsa where buseo = '자재부'; -- 1,416,733
select floor(avg(basicpay)) from tblInsa where buseo = '홍보부'; -- 1,451,833

-- group by
-- group by 사용시 컬럼리스트에는 집계함수만 올 수 있다.(******)
select buseo, floor(avg(basicpay))
    from tblinsa
        group by buseo;


-- 부서별 인원수?
select buseo, count(*) from tblinsa group by buseo;

-- 직위별 인원수?
select jikwi, count(*) from tblinsa group by jikwi;

select jikwi, count(*) from tblinsa group by jikwi order by jikwi;
select jikwi, count(*) from tblinsa group by jikwi order by count(*);

-- 남자 직원 수?, 여자 직원 수?
-- 세로로 출력
select
    count(case
        when substr(ssn, 8, 1) = '1' then 1
    end) as 남자직원,
    count(case
        when substr(ssn, 8, 1) = '2' then 1
    end) as 여자직원
from tblinsa;

-- 가로로 출력
select
    substr(ssn, 8, 1),
    count(*)
from tblinsa
    group by substr(ssn, 8, 1); -- 그룹의 기준은 컬럼자체가 아니어도 가능. 연산, 함수의 결과도 가능

-- 년도별 입사인원수?
select
    to_char(ibsadate, 'yyyy'),
    count(*)
from tblinsa
    group by to_char(ibsadate, 'yyyy')
        order by to_char(ibsadate, 'yyyy') asc;

-- tblInsa. 급여별 그룹 > 인원수?
-- 100만원 미만, 100~200만원 미만, 200만원 이상
select
    ceil(basicpay / 1000000),
    count(*)
from tblinsa
    group by ceil(basicpay / 1000000);


select -- 4
    jikwi,
    count(*)
from tblinsa -- 1
where buseo = '기획부' -- 2
group by jikwi -- 3
order by jikwi; -- 5



/*

having 절
-- 조건절

select 컬럼리스트
from 테이블
where 조건
group by 그룹조건
having 조건
order by 정렬조건

1. from 테이블
2. where 조건
3. group by 그룹조건
4. having 조건
5. select 컬럼리스트
6. order by 정렬조건

*** 기억
1. from > where절 : 개인에 대한 조건(주로 컬럼값에 대한 조건)
2. group by절 > having절 : 그룹에 대한 조건(주로 집계함수 결과값에 대한 조

*/


-- 부서별 인원수?
select
    buseo,
    count(*) as 인원수
from tblinsa
where city = '서울' -- 개인에 대한 질문(레코드 하나 하나에 대한 개별적인 질문)
group by buseo
having count(*) > 10; -- 그룹에 대한 질문(그룹을 통해서 산출된 값에 대한 질문. 집계 함수값에 대한 질문)


-- tblCountry. 대륙별로 최대 인구수, 최소 인구수, 평균 인구수?
select
    continent,
    max(population),
    min(population),
    avg(population),
    sum(population),
    count(*)
from tblcountry
group by continent;

-- 직업별 인원수?
select job_id, count(*) from employees group by job_id;

-- 성별 인원수?
select * from tbladdressbook;

select
    case
        when gender = 'm' then '남자'
        when gender = 'f' then '여자'
    end as gender,
    count(*)
from tbladdressbook
group by gender;

-- 몸무게별(10kg 단위) 인원수
select
    floor(weight / 10) * 10 || 'kg',
    count(*)
from tbladdressbook
group by floor(weight / 10)
order by floor(weight / 10) asc;\















