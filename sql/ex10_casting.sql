/*

형변환 함수
1. to_char()    : 숫자 -> 문자 ***
2. to_char()    : 숫자 -> 문자 ****************
3. to_number()  : 문자 -> 숫자 x
4. to_date()    : 문자 -> 날짜 ****************


1. to char
- varchar to_char(컬럼명, 형식문자열)

형식 문자열 구성 요소
a. 9 : 숫자 1개를 문자 1개로 바꾸는 역할(빈자리는 버린다.)
b. 0 : 숫자 1개를 문자 1개로 바꾸는 역할(빈자리는 0으로 메꾼다.)
c. $ : 통화 기호 표시
d. L : 통화 기호 표시
e. . : 소수점 표시
f. , : 자릿수 표시

*/

-- SQL은 자바 이상의 암시적 형변환을 지원한다.

select
    100,                -- int
    '100',              -- char
    100 + 100,          -- int + int
    '100' || '100',     -- char + char(|| 연산자가 문자열 연결 지원)
    100 + '100',        -- number + char (암시적 형변환 지원)
    '100' + 100,        -- char + number (암시적 형변환 지원)
    200 as aaaaaaaa,    -- 숫자는 우측 정렬
    '200' as bbbbbbb;   -- 문자열은 좌측 정렬


select
    100,
    '@' || to_char(100, '999') || '#', -- 100을 3자리 문자열로 바꿔라. 맨앞자리 1자리를 부호 자리로 사용한다. (실제 + 가 숨어있음)
    '@' || to_char(10, '999') || '#',
    '@' || to_char(1, '999') || '#',
    '@' || to_char(1000, '999') || '#', -- 불가능
    ltrim(to_char(80, '999')) || '점',
    '@' || to_char(100, '000') || '#',
    '@' || to_char(10, '000') || '#',
    '@' || to_char(1, '000') || '#';

select
    100,
    to_char(100, '$999'),
    -- to_char(100, '999원')
    to_char(100, '999') || '원',
    to_char(100, 'L999'); -- locale

select
    345.678,
    to_char(345.678, '999.999'),
    to_char(345.678, '999.99'),
    to_char(345.678, '999.9'),
    to_char(345.678, '999'),
    to_char(345.678, '999.9999999'),
    to_char(345.678, '99');

-- 123456789 : 숫자
-- 123,456,789 : 문자열

select
    123456789,
    to_char(123456789, '999,999,999'); -- %,d


/*

2. to_char()
- char to_char(컬럼명, '형식 문자열')

형식 문자열 구성 요소
a. yyyy
b. yy
c. month
d. mon
e. mm
f. day
g. dy
h. ddd, dd, d
i. hh, hh24
j. mi
k. ss
l. am(pm)

*/

select now();

select to_char(now(), 'yyyy');      -- 2022, 년(4자리) ****
select to_char(now(), 'yy');        -- 22, 년(2자리)

select to_char(now(), 'month');     -- july, 월(풀네임)
select to_char(now(), 'mon');       -- jul, 월(약어)
select to_char(now(), 'mm');        -- 07, 월(2자리 숫자) ****

select to_char(now(), 'day');       -- monday, 요일(풀네임) ****
select to_char(now(), 'dy');        -- mon, 요일(약어) *****

select to_char(now(), 'ddd');       -- 185, 일(올해의 며칠?)
select to_char(now(), 'dd');        -- 04, 일(이번달의 며칠?) ****
select to_char(now(), 'd');         -- 2, 일(이번주의 며칠? == 요일) ****

select to_char(now(), 'hh');        -- 08, 시(12시) ****
select to_char(now(), 'hh24');      -- 08, 시(24시) ****

select to_char(now(), 'mi');        -- 49, 분 ****
select to_char(now(), 'ss');        -- 00, 초 ****
select to_char(now(), 'am');        -- 오전
select to_char(now(), 'pm');        -- 오후


select
    to_char(now(), 'yyyy-mm-dd'),
    to_char(now(), 'yyyy.mm.dd'),
    to_char(now(), 'yyyy/mm/dd'),
    to_char(now(), 'yyyy년 mm월 dd일'),
    to_char(now(), 'yyyy') || '년 ' || to_char(now(), 'mm') || '월 ' || to_char(now(), 'dd') || '일',
    to_char(now(), 'hh24:mi:ss'),
    to_char(now(), 'day am hh:mi:ss'),
    to_char(now(), 'yyyy-mm-dd hh24:mi:ss');


/*

to_char() 위치
1. 컬럼 리스트에서 사용
2. 조건절에서 사용
3. 정렬

*/

-- 1. 컬럼리스트에서 사용
select name, ibsadate, to_char(ibsadate, 'yyyy-mm-dd') from tblinsa;

-- 2. 조건절에서 사용
-- 2010년 입사??
select name, to_char(ibsadate, 'yyyy-mm-dd') from tblinsa
    -- where ibsadate >= '2010-01-01' and ibsadate <= '2010-12-31';
    -- where ibsadate between '2010-01-01' and '2010-12-31'; -- 2010 12 31 13:30:00
    -- where to_char(ibsadate, 'yyyy') = '2010';
    -- where to_char(ibsadate, 'd') = 5;

-- 암시적 형변환 발생
select '2010-01-01'; -- '2010-01-01' > 문자열O 날짜X
select * from tblInsa where ibsadate > '2010-01-01'; -- '2010-01-01' > 문자열X, 날짜O

-- 3. 정렬
select name, to_char(ibsadate, 'yyyy-mm-dd day') from tblinsa
    -- order by ibsadate desc;
    -- order by to_char(ibsadate, 'mm') asc;
    order by to_char(ibsadate, 'd') asc; -- 요일(숫자)
    -- order by to_char(ibsadate, 'day') asc; -- 요일(한글)


/*

3. to_number() : 문자 -> 숫자X
- int to_number(컬럼명)
- 잘 사용 안함

*/

select
    123 as aaaaaaaaaa,
    '123' as bbbbbbbbbb,
    to_number('123', '999') as cccccccccc,
    '123' + 100, -- 암시정 형변환
    to_number('123', '000') + 100, -- FM
    '123' * 3;


/*

4. to_date() : 문자 -> 날자 ************
- date to_date(컬럼명, '형식 문자열')
- 형식 문자열은 to_char()와 동일

*/

select
    now(),                                  -- date
    '2022-07-04',                           -- char
    to_date('2022-07-04', 'yyyy-mm-dd'),    -- date
    to_char(to_date('2022-07-04', 'yyyy-mm-dd'), 'yyyy-mm-dd hh24:mi:ss'),
    to_date('2022-07-04 18:18:40', 'yyyy-mm-dd hh24:mi:ss'),
    to_char(to_date('2022-07-04 18:18:40', 'yyyy-mm-dd hh24:mi:ss'), 'yyyy-mm-dd hh24:mi:ss');

/*

기본 : 문자열 상수 > 년-월-일(암시적 형변환 O)
    : 문자열 상수 > 시-분-초(암시정 형변환 X)
    : 문자열 상수 > 년-월-일 시-분-초(암시정 형변환 X)

*/

select * from tblInsa
    -- where ibsadate > '2010-01-01 12:30:30';
    where ibsadate > to_date('2010-01-01 12:30:00', 'yyyy-mm-dd hh24:mi:ss');















