-- 김연아가 산 책은?
select b.bookname
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and c.name='김연아';

-- 박지성이 산 책의 값은?
select sum(b.price*o.count) total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and c.name='박지성';

-- 대한민국에 거주하는 사람들이 산 책들의 세금은 얼마인가요?
select sum(b.price*o.count)*0.1 tax
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and c.address like '%대한민국%';

-- 올림픽에서 금메달을 딴 선수들(김연아, 장미란)은 특별 할인가로 50%에 책값을 공금하고 있습니다.
-- 그런 경우 이 서점의 총 매출은 얼마인가요?(단, 1000원 이하는 절삭하세요.)
select sum(b.price*o.count)*0.5 total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='김연아' or c.name='장미란');

select sum(b.price*o.count)+total totalsales
from CUSTOMER c, ORDERS o, BOOK b
where b.price in (select sum(b.price*o.count)*0.5 total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='김연아' or c.name='장미란');
)

select distinct b.bookname, b.price
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='김연아' or c.name='장미란');

-- 총 매출 구해라 (10000원 이하 절삭)
select floor(sum(b.price*o.count)/10000)*10000 total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid;

select trunc(sum(b.price*o.count),-4) total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid;

alter table orders rename column saleprice to count;
select * from ORDERS;
update orders set count=6 where orderid=1;
update orders set count=2 where orderid=2;
update orders set count=8 where orderid=3;s
update orders set count=6 where orderid=4;
update orders set count=2 where orderid=5;
update orders set count=12 where orderid=6;
update orders set count=13 where orderid=7;
update orders set count=12 where orderid=8;
update orders set count=7 where orderid=9;
update orders set count=13 where orderid=10;

select distinct t.custid, c1.name, t.total 
from customer c1,
(select distinct c.custid, nvl(sum(b.price*count),0) total
from orders o 
full outer join customer c
on c.custid=o.custid
full outer join book b
on o.bookid=b.bookid
where c.custid is not null
group by c.custid
order by custid asc) t
where c1.custid=t.custid
order by t.custid;