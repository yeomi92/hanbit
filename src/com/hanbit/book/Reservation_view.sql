CREATE VIEW Reservation_view
AS
SELECT 
r.res_seq,
r.res_date res_date,
m.multi_seq multi_seq,
c.con_no con_no,
r.seat_no seat_no,
m.multi_name multi_name,
m.loc loc,
t.title title,
t.price price,
t.seat_count seat_count,
c.name name,
c.addr addr
from Reservation r
full outer join Theater t
on r.theator_no=t.theator_no
full outer join Multiplex m
on r.multi_seq=m.multi_seq
full outer join Consumer c
on r.con_no=c.con_no;
where res_seq is not null;
select * from reservation_view;