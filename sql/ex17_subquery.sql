/*

Main Query, 메인 쿼리
- 하나의 select(insert, update, delete)로만 구성된 쿼리

Sub Query, 서브 쿼리
- 메인 쿼리 + 1개 이상의 select를 추가된 쿼리
- 삽입 위치 : select절, from절, where절, order by절

*/

-- tblCountry. 인구수가 가장 많은 나라의 이름?
select * from tblCountry;

select max(population) from tblcountry;
select name from tblcountry where population = 120660;
-- select name from tblcountry where population = max(population); -- 불가능
select name from tblcountry where population = (select max(population) from tblcountry);

-- tblInsa. 급여가 가장 적은 사람의 이름은?
select min(basicpay) from tblinsa; -- 840,000
select name from tblinsa where basicpay = 840000;
select name from tblinsa where basicpay = (select min(basicpay) from tblinsa);

-- tblInsa. 급여가 가장 적은 기획부 사람의 이름은?
select min(basicpay) from tblinsa where buseo = '기획부'; -- 1,020,000
select name from tblinsa where basicpay = 1020000;
select name from tblinsa where basicpay = (select min(basicpay) from tblinsa where buseo = '기획부');

-- 나이 28세, 키 177cm 여자의 남자친구 키?
select * from tblwomen;
select name from tblwomen where age = 28 and height = 177;
select height from tblmen where couple = '장도연';
select height from tblmen where couple = (select name from tblwomen where age = 28 and height = 177);

-- tblInsa. 평균 급여보다 더 많이 받는 직원들?
select * from tblInsa where basicpay > (select floor(avg(basicpay)) from tblinsa);

-- tblInsa. '홍길동' 직원과 같은 부서에 근무하는 직원들?
select * from tblInsa where buseo = (select buseo from tblinsa where name = '홍길동') and name <> '홍길동';


/*

서브쿼리의 용도
1. 조건절에서 비교값으로 사용
    a. 반환값이 1행 1열 > 스칼라 쿼리 > 단일값 변환 > 연산자 사용
    b. 반환값이 N행 1열 > in 연산자 > 열거형 비교
    c. 반환값이 1행 N열
    d. 반환값이 N행 N열 > b + c 합친 방법을 사용

*/

-- 1.a
select * from tblInsa where basicpay = (select max(basicpay) from tblinsa);

-- 1.b
-- 급여를 250만원 이상 받는 사람이 근무하는 모든 직원 명단?
-- [21000] ERROR: more than one row returned by a subquery used as an expression
-- select * from tblinsa where buseo = (select buseo from tblinsa where basicpay >= 2550000); -- 오류
select * from tblinsa where buseo in (select buseo from tblinsa where basicpay >= 2550000);

-- 1.c
-- '홍길동'과 같은 지역에 거주 + 같은 부서 사람?
select * from tblInsa where name = '홍길동'; -- 서울, 기획부
select * from tblinsa
    where city = (select city from tblinsa where name = '홍길동')
        and buseo = (select buseo from tblinsa where name = '홍길동');

select * from tblinsa
    where (city, buseo) = (select city, buseo from tblinsa where name = '홍길동');

-- 1.d
select * from tblinsa
    where (city, buseo) in (select city, buseo from tblinsa where basicpay >= 2550000);



/*

서브쿼리의 용도
2. 컬럼리스트에서 사용
    a. 반드시 스칼라 쿼리를 사용한다. > 행이 1개, 열이 1개
    b. 컬럼 리스트에서 사용되는 서브쿼리의 종류
        1. 정적 쿼리(모든 행에 동일한 값이 반환)
        2. 상관 서브 쿼리(서브쿼리의 값과 바깥쪽 메인 쿼리간의 관계를 형성)**************

*/

select name, buseo, basicpay, (select floor(avg(basicpay)) from tblinsa) from tblinsa;

-- [21000] ERROR: more than one row returned by a subquery used as an expression
-- select name, buseo, (select name from tblinsa where buseo = '기획부') from tblinsa;

-- 42601] ERROR: subquery must return only one column
-- select name, buseo, (select name, buseo from tblinsa where num = 1001) from tblinsa;

select name, buseo, (select name from tblinsa where num = 1001) from tblinsa;




















