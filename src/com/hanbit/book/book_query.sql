-- �迬�ư� �� å��?
select b.bookname
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and c.name='�迬��';

-- �������� �� å�� ����?
select sum(b.price*o.count) total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and c.name='������';

-- ���ѹα��� �����ϴ� ������� �� å���� ������ ���ΰ���?
select sum(b.price*o.count)*0.1 tax
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and c.address like '%���ѹα�%';

-- �ø��ȿ��� �ݸ޴��� �� ������(�迬��, ��̶�)�� Ư�� ���ΰ��� 50%�� å���� �����ϰ� �ֽ��ϴ�.
-- �׷� ��� �� ������ �� ������ ���ΰ���?(��, 1000�� ���ϴ� �����ϼ���.)
select sum(b.price*o.count)*0.5 total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='�迬��' or c.name='��̶�');

select sum(b.price*o.count)+total totalsales
from CUSTOMER c, ORDERS o, BOOK b
where b.price in (select sum(b.price*o.count)*0.5 total
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='�迬��' or c.name='��̶�');
)

select distinct b.bookname, b.price
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='�迬��' or c.name='��̶�');

-- �� ���� ���ض� (10000�� ���� ����)
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

select sum(sum(o1.count*b1.price) t.total*-1)
from CUSTOMER c1, BOOK b1, ORDERS o1,
(select sum(b.price*o.count)*0.5 total, c.custid
from CUSTOMER c, ORDERS o, BOOK b
where c.custid=o.custid and b.bookid=o.bookid and (c.name='�迬��' or c.name='��̶�')) t
where c1.custid=o1.custid and b1.bookid=o1.bookid;

select trunc(sum(case when t.custid=2 then t.total/2 
when t.custid=3 then t.total/2 
else t.total end),-4) totalsales
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

select sum(o.count*b.price)
from CUSTOMER c, BOOK b, ORDERS o
where c.custid=o.custid and o.bookid=b.bookid;

