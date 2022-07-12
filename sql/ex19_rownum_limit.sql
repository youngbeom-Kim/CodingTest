/*

의사 컬럼, Pseudo Column
- 실제 컬럼이 아닌데 컬럼처럼 행동하는 객체
- limit
- row_number() over()
- 서브쿼리를 많이 의존해서 사용한다.
- 사용자가 정의하지 않아도 이미 테이블에 포함이 되어 있는 컬럼
- row_number()은 실행되는 시점 > from절 실행 시(**************************)

*/

select num, name, buseo as department, basicpay as salary from tblinsa;

-- FM
select * from tblInsa;
select tblinsa.* from tblinsa;
select i.* from tblinsa i;


select name, buseo, row_number() over () from tblinsa;
select name, buseo, row_number() over () as num from tblinsa where num = 1; -- null
select name, buseo, row_number() over () as num from tblinsa where num <= 10; -- null

select name, buseo, row_number() over () as num from tblinsa where num = 3; -- null
select name, buseo, row_number() over () as num from tblinsa where num >= 10 and num <= 10; -- null


-- order by를 했더니 번호가 뒤죽박죽 되는 이유??
select name, basicpay, row_number() over () as num from tblinsa order by basicpay desc;

select name, row_number() over () -- 2.
from tblinsa; -- 1. 이 때 row_number이 레코드에게 할당(적용)

select name, row_number() over () -- 2.
from tblinsa -- 1.
order by basicpay desc; -- 3. row_number은 order by 전에 이미 실행된다. order by에 의한 순서는 row_number에 반영이 안된다.


-- 내가 원하는대로 정렬하고, 그 상태에서 row_number을 할당하는 방법 > 서브쿼리 사용
select nbr.name, nbr.basicpay, nbr.rnum, row_number() over () as rownum-- 5.
from -- 4. from + rownum 실행
    (select name, basicpay, row_number() over () as rnum -- 2.
    from tblInsa i -- 1. from + rownum 실행
    order by basicpay desc) as nbr
        limit 3; -- 3.


select job, cnt from (select job, count(*) as cnt from tbladdressbook
    group by job
        order by count(*) desc) as jc;



select * from tblcomedian;
select c.*, row_number() over () from tblcomedian c order by weight desc;
select c.*, row_number() over (order by weight desc) from tblcomedian c;

-- rownum을 조건으로 사용 시 > 반드시 조건에 1이 포함되어야 한다.
select c2.*, row_number() over () from (select c.* from tblcomedian c order by weight desc) c2 limit 5;
select *, row_number() over (order by weight desc) from tblcomedian limit 5;

-- 급여를 3번째로 많이 받는 사람은?
select * from (select row_number() over (order by basicpay) as row, * from tblinsa limit 10) i where row = 3;













