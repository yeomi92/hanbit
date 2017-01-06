-- DROP
DROP SEQUENCE multi_seq;
DROP SEQUENCE theartor_seq;
DROP SEQUENCE res_seq;
DROP TABLE Reservation;
DROP TABLE Consumer;
DROP TABLE Theater;
DROP TABLE Multiplex;
CREATE SEQUENCE multi_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 CREATE SEQUENCE theartor_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 CREATE SEQUENCE res_seq
 START WITH     1000
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
CREATE TABLE Multiplex(
	multi_seq DECIMAL,
	multi_name VARCHAR2(10) NOT NULL,
	loc VARCHAR2(10) NOT NULL,
	PRIMARY KEY(multi_seq)
);
CREATE TABLE Theater(
	multi_seq DECIMAL,
	theator_no DECIMAL,
	title VARCHAR2(20) NOT NULL,
	price DECIMAL NOT NULL,
	seat_count DECIMAL NOT NULL,
	PRIMARY KEY(theator_no),
	FOREIGN KEY(multi_seq) REFERENCES Multiplex(multi_seq)
);
CREATE TABLE Consumer(
	con_no DECIMAL,
	name VARCHAR2(20) NOT NULL,
	addr VARCHAR2(40) NOT NULL,
	PRIMARY KEY(con_no)
);
CREATE TABLE Reservation(
	res_seq DECIMAL,
	multi_seq DECIMAL,
	theator_no DECIMAL,
	con_no DECIMAL,
	seat_no VARCHAR2(10) NOT NULL,
	res_date VARCHAR2(20),
	PRIMARY KEY(res_seq),
	FOREIGN KEY(multi_seq) REFERENCES Multiplex(multi_seq),
	FOREIGN KEY(theator_no) REFERENCES Theater(theator_no),
	FOREIGN KEY(con_no) REFERENCES Consumer(con_no)
);
INSERT INTO Multiplex(multi_seq,multi_name,loc)
VALUES(multi_seq.nextval,'롯데','잠실');
INSERT INTO Multiplex(multi_seq,multi_name,loc)
VALUES(multi_seq.nextval,'롯데','신촌');
INSERT INTO Theater(multi_seq,theator_no,title,price,seat_count)
VALUES(1000,1,'마스터','100000','100');
INSERT INTO Theater(multi_seq,theator_no,title,price,seat_count)
VALUES(1000,2,'로그원','120000','200');
INSERT INTO Consumer(con_no,name,addr)
VALUES(12345,'홍길동','면목동');
INSERT INTO Consumer(con_no,name,addr)
VALUES(67891,'이순신','대치동');
INSERT INTO Reservation(res_seq,multi_seq,theator_no,con_no,seat_no,res_date)
VALUES(res_seq.nextval,1000,1,12345,'F-10','2017-01-07');
INSERT INTO Reservation(res_seq,multi_seq,theator_no,con_no,seat_no,res_date)
VALUES(res_seq.nextval,1000,1,67891,'G-10','2017-01-07');
SELECT * from Reservation;



SELECT * FROM Reservation_view;

