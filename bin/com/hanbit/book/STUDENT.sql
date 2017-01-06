CREATE TABLE Subject(
	scode VARCHAR2(20),
	sname VARCHAR2(20),
	PRIMARY KEY(scode)
);
CREATE TABLE Student(
	name VARCHAR2(15) NOT NULL, --char array length==15, null 비허용
	sno VARCHAR2(15), --char array length==15, null 비허용(PK면 자동으로 NOT NULL이다.)
	scode VARCHAR2(20) NOT NULL, --char array length==20, null 비허용
	gender VARCHAR2(1), --char array length==1, null 허용
	birth DECIMAL, --decimal(10진수 정수) null 허용   ex)여기까지는 팀원구성
	PRIMARY KEY(sno), --PK  ex)반장
	FOREIGN KEY(scode) REFERENCES Subject(scode) --major는 Subject의 scode와 일치시킴   ex)원내대표
);
SELECT * FROM Subject;
SELECT * FROM Student;