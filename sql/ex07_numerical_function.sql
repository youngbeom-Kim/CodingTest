/*

수학 함수
- 자바의 Math 클래스

1. round()
- 반올림 함수
- number round(컬럼명) > 정수 반환
- number round(컬럼명, 소수이하자릿수) > 실수 반환

*/

select 100, '문자열' from tblcomedian;
select 100 / 3 from tblinsa;

select 100 as test; -- column 과 record 가 하나인 테이블(오라클에선 from dual)
select now(), 100/3 as test;

select
    10 / 3,
    round(10 / 3)
as test;

select
    12345.6789,
    round(12345.6789),
    round(12345.6789, 1),
    round(12345.6789, 2),
    round(12345.6789, 3)
as test;


select
    round(avg(basicpay)),
    round(avg(basicpay)) as 평균급여,
    round(avg(basicpay)) as "평균 급여", -- 권장하는 방법아님
    round(avg(basicpay)) as "select" -- 가능해도 졀대 하면 안됨
from tblInsa;


/*

2. floor(), trunc()
- 절삭 함수
- 무조건 내림 함수
- 현재 숫자와 근접한 정수 중 가장 큰 정수를 반환하는 함수
- number floor(컬럼명)
- number trunc(컬럼명 [, 소수이하자릿수])

*/

select
    5.678,
    floor(5.678),
    floor(5.99999999999),
    trunc(5.678),
    trunc(5.678, 1),
    trunc(5.678, 2)
as test;


/*

3. ceil()
- 무조건 올림 함수
- number ceil(컬럼명)
- 현재 숫자와 인접한 정수 중 가장 작은 정수를 반환

*/

select
    3.1,
    ceil(3.1),
    ceil(3.000000000000001)
as test;


/*

4. mod()
- 나머지 함수
- number mod(피제수, 제수)

*/

select mod(10, 3) as test;

select abs(-10), power(2, 8), sqrt(4) as test;











