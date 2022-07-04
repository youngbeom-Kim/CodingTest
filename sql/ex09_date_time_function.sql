/*

날짜 연산
1. 시각 - 시각 = 시간(일)
2. 시각 + 시각 = 시각
3. 시각 - 시간 = 시각

*/



-- tblInsa. 입사일 - 현재 > 근무 경력
select
    name,
    ibsadate,
    current_date - ibsadate,
    (current_date - ibsadate) / 365,
    current_date - ibsadate as 근무일수,
    (current_date - ibsadate) / 365 as 근무년수,
    (current_date - ibsadate) * 24 as 근무시수,
    (current_date - ibsadate) * 24 * 60 as 근무분수
from tblinsa;

-- 2. 시각 + 시간(일) = 시각
select current_date, current_date + 100, current_date - 100;
select now() + '2week';

-- 3. 시각 - 시간(일) = 시각
select now(), now()::time + '2hour'; -- 2시간 뒤
select now(), now()::time + '30minute'; -- 30분 뒤
