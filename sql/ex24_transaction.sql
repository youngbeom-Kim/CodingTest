/*

트랜잭션, Transaction(********************************************)
- 1개 이상의 명령어들을 하나의 논리 집합으로 묶어놓은 단위
- 트랜잭션 > 제어 > 트랜잭션 처리
- 트랜잭션에 포함되는 명령어 > insert, update, delete

트랜잭션 명령어
- DCL(TCL)
- 하나의 트랜잭션으로 묶여 있는 DML을 감시하다가 일부 DML이 문제를 발생하면 이전에 성공했던 DML을 없었던 일로 처리
- 하나의 트랜잭션으로 묶여 있는 DML을 감시하다가 모든 DML이 성공하면 모든 일을 데이터베이스에 반영
1. commit
2. rollback
3. savepoint

*** 동시간대에 트랜잭션은 유일하게 존재한다. 시간대별로 별도의 트랜잭션이 존재할 수 있다.

새로운 트랜잭션이 시작하는 경우
1. 클라이언트가 접속 직 후
2. commit 실행 직 후
3. rollback 실행 직 후

현재 트랜잭션이 끝나는 경우
1. commit 실행 > 현재 트랜잭션을 DB에 반영
2. rollback 실행 > 현재 트랜잭션을 DB에 반영 안함
3. 클라이언트가 접속 종류
    a. 정상적인 종료
        > 대부분의 툴이 질문? > commit or rollback
    b. 비정상적인 종료

*/

commit;

select * from tblInsa; -- A.

select * from tblInsa where buseo = '영업부'; -- B.

select * from tblInsa where buseo = '영업부' and name = '김정훈'; -- C.

delete from tblInsa where num = 1004; -- D. (이 구문만 Transaction의 감시 대상임) - delete

select * from tblInsa; -- E.

rollback; -- 트랜잭션이 시작된 시점으로 돌아가라(그 사이에 속한 모든 명령어들을(DML) 없었던 일로 해라)



select * from tblinsa; -- A.

update tblInsa set city = '판교' where num = 1001; -- B.

delete from tblInsa where num = 1004; -- C.

select * from tblInsa; -- D.

commit;

select * from tblInsa;

rollback;


delete from tblInsa where num = 1001;
select * from tblInsa;

















