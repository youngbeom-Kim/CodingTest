/*

집계 함수, Aggregation Function
- 처음 쉬움 -> 뒤로 어려움
1. count()
2. sum()
3. avg()
4. max()
5. min()

1. count()
- 결과셋의 레코드 갯수를 반환한다.
- number count(컬럼명)
- 값이 null인 레코드는 지외

*/

select name from tblcountry;
select count(name) from tblcountry;

select name from tblInsa;
select count(name) from tblInsa; -- 전직원수 : 60
select count(name) from tblInsa where buseo = '기획부'; -- 기획부 직원수 : 7
select count(name) from tblInsa where ssn like '%-2%'; -- 여자 직원수 : 29
select count(name) from tblInsa where city = '서울' and jikwi = '부장'; -- 서울 부장 직원수 : 3

-- 트랜잭션
-- insert, update, delete -> 최종 승인(commit, rollback)
-- 커밋 선택(항상)

-- delete from tblInsa where num = 1001; -- 보류(실행시 1001 홍길동 사라짐)
select * from tblInsa;

select * from tblCountry;
select name from tblcountry;
select count(name) from tblcountry; -- 14

select population from tblcountry;
select count(population) from tblcountry; -- 13 (null은 count 하지않음)

select * from tblcountry;
select count(*) from tblcountry; -- 14

-- select count(name, area) from tblcountry; -- 불가능(오류)


-- completedate -> O, X
select count(*) from tbltodo; -- 20
select count(*) from tbltodo where completedate is not null; -- 한일 개수 : 12
select count(*) from tbltodo where completedate is null; -- 안한일 개수 : 8

select
    count(*) as 전체개수,
    count(completedate) as 한일개수,
    count(*) - count(completedate) as 안한일개수
from tbltodo;

-- tblInsa. 총인원수?, 연락처 있는 사람? 연락처 없는 사람?
select
    count(*) as 총인원수,
    count(tel) as 연락처있는사람,
    count(*) - count(tel) as 연락처없는사람
from tblinsa;

-- tblInsa. 어떤 종류의 부서가 있습니까?
select count(distinct buseo) from tblinsa; -- 7

-- tblComedian. 남자 몇 명? 여자 몇 명?
select count(*) from tblcomedian where gender = 'm';
select count(*) from tblcomedian where gender = 'f';

-- 위의 질문에 대한 답을 1개의 결과셋으로 얻고 싶음.
select
    count(case
        when gender = 'm' then '남자'
    end) as 남자수,
    count(case
        when gender = 'f' then '여자'
    end) as 여자수
from tblcomedian;


-- 집계 함수 사용시 주의점!!!! -> 에러 발생!!!

-- 1.
-- 컬럼 리스트에서 집계함수와 일반 컬럼이 동시에 올 수 없다.
-- 개인의 값과 집합의 값을 동시에 한 레코드에 담을 수 없다.

select * from tblinsa;
select count(name) from tblinsa;
-- select count(name), name from tblinsa; (불가능)

select count(name) from tblinsa;
select name from tblinsa;

select count(*), sum(sudang), max(sudang) from tblinsa;


-- 2.
-- where절에는 절대로 집계 함수를 사용할 수 없다.
-- where절은 레코드 각각에 대한 질문(깨인에 대한 질문) -> 집계 함수 사용이 불가능

-- tblInsa. 평균 급여? -> 평균 급여보다 급여를 더 받는 사람들??
select basicpay from tblinsa;
select avg(basicpay) from tblinsa; -- 155만원

-- select * from tblinsa where basicpay > avg(basicpay); (불가능)



/*

2. sum()
- number sum(컬럼명)
- 해당 컬럼값들의 합을 구한다.
- 숫자형에만 적용 가능하다.(문자형X, 날짜형X)

*/

select weight from tblcomedian;
select sum(weight) from tblcomedian;

select first from tblcomedian;
-- select sum(first) from tblcomedian; (불가능)

select
    sum(basicpay), sum(sudang),
    sum(basicpay) + sum(sudang)
from tblinsa;

select
    sum(basicpay + sudang)
from tblinsa;



/*

3. avg()
- number avg(컬럼명)
- 해당 컬럼값들의 평균값을 반환한다.
- 숫자형만 가능하다.(문자형X, 날짜형X)

*/

select
    avg(basicpay),
    sum(basicpay) / count(*)
from tblinsa;

-- tblCountry내의 평균 인구수
select
    avg(population), -- 15588
    sum(population) / count(*), -- 14475
    sum(population) / count(population)
from tblcountry;

select
    count(*),
    count(population)
from tblcountry;


-- 회사 -> 연말 -> 성과급 지금
-- 14명 -> 1명 프로젝트 참여X
-- 1. 균등 지급 : 총지급액 / 모든 팀원수 = sum() / count(*)
-- 2. 차등 지급 : 총지급액 / 참여 팀원수 = sum() / count(참여인원) == avg()



/*

4. max()
- object max(컬럼명)
- 최댓값 반환
- 숫자형, 문자형, 날짜형 사용 가능

5. min()
- object min(컬럼명)
- 최솟값 반환
- 숫자형, 문자형, 날짜형 사용 가능

*/

select * from tblInsa;

select max(basicpay), min(basicpay) from tblinsa; -- 숫자
select max(name), min(name) from tblinsa; -- 문자
select max(ibsadate), min(ibsadate) from tblinsa;


-- sum()
-- 1. 유렵과 아프리카에 속한 나라의 인구 수 합? tblCountry > 14,198
select * from tblcountry;
select sum(population) from tblcountry where continent in ('EU', 'AF');

-- 2. 서울에 있는 직원들의 급여 합(급여 + 수당)? tblInsa > 33,812,400
select * from tblInsa;
select sum(basicpay + sudang) from tblInsa where city = '서울';

-- 3. 장급(부장 + 과장)들의 급여 합? tblInsa > 36,289,000
select * from tblInsa;
select sum(basicpay) from tblInsa where jikwi in ('부장', '과장');


-- avg()
-- 1. 아시아에 속한 국가의 평균 인구수? tblCountry > 39,165
select * from tblcountry;
select avg(population) from tblcountry where continent = 'AS';

-- 2. 장급(부장 + 과장)의 평균 급여? tblInsa > 2,419,266.66
select * from tblInsa;
select avg(basicpay) from tblInsa where jikwi in ('부장', '과장');

-- 3. 사원급(대리 + 사원)의 평균 급여? tblInsa > 1,268,946.66
select avg(basicpay) from tblInsa where jikwi in ('대리', '사원');

-- 4. 장급(부장, 과장)의 평균 급여와 사원급(대리, 사원)의 평균 급여의 차액? tblInsa > 1,150,320
select
    avg(case
        when jikwi in ('부장', '과장') then basicpay
    end) -
    avg(case
        when jikwi in ('대리', '사원') then basicpay
    end) as 평균차액
from tblinsa;


-- max(), min()
-- 1. 면적이 가장 넓은 나라의 면적은? tblCountry > 959
select * from tblcountry;
select max(area) from tblcountry;

-- 2. 급여(급여 + 수당)가 가장 적은 직원은 총 얼마를 받고 있는가? tblInsa > 988,000
select min(basicpay + sudang) from tblinsa;

-- count()
-- 1. 아시아(AS)와 유럽(EU)에 속한 나라의 개수?? tblCountry > 7
select count(continent) from tblcountry where continent in ('AS', 'EU');

-- 2. 인구수 7000 ~ 20000 사이인 나라의 개수?? tblCountry > 2
select count(*) from tblcountry where population between 7000 and 20000;

-- 3. tel. 010을 안쓰는 사람은 몇명(연락처가 없는 사람은 제외)?? tblInsa > 42
select
    count(tel)
    -
    count(case
        when tel like '010%' then tel
    end)
from tblinsa;
select count(*) from tblinsa where tel not like '010%';

-- 4. city. 서울, 경기, 인천 그 외 지역 인원수?? tblInsa > 18
select * from tblInsa;
select
    count(city)
    -
    count(case
        when city in ('서울', '경기', '인천') then city
    end) as 지역인원수
from tblinsa;
select count(*) from tblinsa where city not in ('서울', '경기', '인천');

-- 5. 80년대생 + 여자 직원 총 몇명?? tblInsa > 9명
select * from tblInsa;
select count(*) from tblinsa where ssn like '8%-2%';