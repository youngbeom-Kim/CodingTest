/*

-- 문자열 함수

1. length()
- 문자열 길이
- number length(컬럼명)

*/

select name, length(name) from tblcountry; -- 컬럼 리스트에서 사용

select name, length(name) from tblcountry where length(name) > 4; -- where절에서 사용

select name, length(name) from tblcountry order by length(name);


/*

2. upper(), lower(), initcap()
- varchar upper(컬럼명)

*/

select
    first_name,
    upper(first_name),
    lower(first_name)
from employees;

select initcap('abc') as test;

-- 검색율 향상
select
    first_name
from employees
where first_name like '%de%' or first_name like '%DE%' or first_name like '%De%' or first_name like '%dE%';

select
    first_name
from employees
where lower(first_name) like '%de%';


/*

3. substr()
- 문자열 추출함수
- varchar substr(컬럼명, 시작위치, 가져올 문자 갯수)
- varchar substr(컬럼명, 시작위치)
- *** 서수를 1부터 시작

*/

select
    '가나다라마바사아자차카타파하',
    substr('가나다라마바사아자차카타파하', 3, 6),
    substr('가나다라마바사아자차카타파하', 3);

-- tblInsa, 남자직원 명단?
select * from tblinsa;
select count(*) from tblInsa where ssn like '%-1%';
select count(*) from tblInsa where substr(ssn, 8, 1) = '1';
select count(*) from tblInsa where substr(ssn, 8, 1) = '1' or substr(ssn, 8, 1) = '3';
select count(*) from tblInsa where substr(ssn, 8, 1) in ('1', '3');

-- 직원들의 생년?
select name, '19' || substr(ssn, 1, 2) from tblinsa;

-- 장급(과장, 부장)들은 어떤 성(family name)을 가지고 있는지?
select
    distinct substr(name, 1, 1)
from tblinsa
where jikwi in ('과장', '부장')
order by substr(name, 1, 1);

-- 직원 60명 성씨별 몇 명?
select
    distinct substr(name, 1, 1)
from tblinsa;

select
    count(case
        when substr(name, 1, 1) = '김' then 1 -- name에서 첫번째 자리의 한개를 가져오는데 그게 1이면 (1을 반환해라) 괄호는 then의 의미)
    end) as "김씨",
    count(case
        when substr(name, 1, 1) = '이' then 1
    end) as "이씨",
    count(case
        when substr(name, 1, 1) = '박' then 1
    end) as "박씨",
    count(case
        when substr(name, 1, 1) = '정' then 1
    end) as "정씨",
    count(case
        when substr(name, 1, 1) = '최' then 1
    end) as "최씨",
    count(case
        when substr(name, 1, 1) in ('김', '이', '박', '정', '최') then 1
    end) as "김이박정최",
    count(case
        when substr(name, 1, 1) not in ('김', '이', '박', '정', '최')  then 1
    end) as "나머지"
from tblInsa;


/*

4. position()
- 검색함수(indexOf())
- int instr(컬럼명 in 검색어)

*/

select
    '안녕하세요 홍길동님' as c1,
    position('홍길동' in '안녕하세요. 홍길동님') as c2,
    position('홍길동' in '안녕하세요. 홍길동님. 잘가세요. 홍길동님.') as c3;


/*

5. trim(), ltrim(), rtrim()
- varchar trim(컬럼명)

*/

select
    '     홍    길동    ',
    trim('     홍    길동    '),
    ltrim('     홍    길동    '),
    rtrim('     홍    길동    ');


/*

6. lpad(), rpad()
- left padding
- right padding
- varchar lpad(컬럼명, 개수, 문자)
- varchar rpad(컬럼명, 개수, 문자)

*/

select
    '1',
    lpad('1', 3, '0'),
    rpad('1', 3, '0'),
    lpad('홍길동', 10, '*'),
    lpad('ABC', 10, '*'),
    lpad('1234', 3, '*');

select
    name,
    lpad(name, 20, '@'),
    lpad(name, 10, '@'),
    lpad(name, length(name) + 10, '@')
from tblcountry;


/*

7. replace()
- 문자열 치환
- varchar replace(컬럼명, 찾을 문자열, 바꿀 문자열)

*/

select
    replace('홍길동', '홍', '김'),
    replace('홍길동', '이', '김');

-- 직원명, 주민번호, 성별(남자|여자)
select name, ssn, substr(ssn, 8, 1) from tblinsa;

select name, ssn,
    case
        when substr(ssn, 8, 1) = '1' then '남자'
        when substr(ssn, 8, 1) = '2' then '여자'
    end as gender,
    substr(ssn, 8, 1),
    replace(substr(ssn, 8, 1), '1', '남자'),
    replace(substr(ssn, 8, 1), '2', '여자'),
    replace(replace(substr(ssn, 8, 1), '1', '남자'), '2', '여자')
from tblinsa;

select
    name,
    continent,
    case
        when continent = 'AS' then '아시아'
        when continent = 'AF' then '아프라카'
        when continent = 'EU' then '유럽'
        when continent = 'SA' then '아메리카'
        when continent = 'AU' then '호주'
    end as continent2,
    replace(replace(replace(replace(replace(continent, 'AS', '아시아'), 'AF', '아프리카'), 'EU', '유럽'), 'SA', '아메리카'), 'AU', '호주')
from tblcountry;


















