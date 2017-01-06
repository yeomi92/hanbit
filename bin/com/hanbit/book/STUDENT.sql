CREATE TABLE Subject(
	scode VARCHAR2(20),
	sname VARCHAR2(20),
	PRIMARY KEY(scode)
);
CREATE TABLE Student(
	name VARCHAR2(15) NOT NULL, --char array length==15, null �����
	sno VARCHAR2(15), --char array length==15, null �����(PK�� �ڵ����� NOT NULL�̴�.)
	scode VARCHAR2(20) NOT NULL, --char array length==20, null �����
	gender VARCHAR2(1), --char array length==1, null ���
	birth DECIMAL, --decimal(10���� ����) null ���   ex)��������� ��������
	PRIMARY KEY(sno), --PK  ex)����
	FOREIGN KEY(scode) REFERENCES Subject(scode) --major�� Subject�� scode�� ��ġ��Ŵ   ex)������ǥ
);
SELECT * FROM Subject;
SELECT * FROM Student;