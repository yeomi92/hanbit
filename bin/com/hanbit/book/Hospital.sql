--Hospital.sql
DROP TABLE Charts;
DROP TABLE Treatments;
DROP TABLE Patients;
DROP TABLE Nurses;
DROP TABLE Doctors;
CREATE TABLE Doctors(
	doc_id DECIMAL NOT NULL,
	major_treat VARCHAR2(25) NOT NULL,
	doc_name VARCHAR2(20) NOT NULL,
	doc_gen VARCHAR2(1) NOT NULL,
	doc_phone VARCHAR2(15) NULL,
	doc_email VARCHAR2(50) NOT NULL,
	doc_position VARCHAR2(20) NOT NULL,
	PRIMARY KEY(doc_id)
);
CREATE TABLE Nurses(
	nur_id DECIMAL NOT NULL,
	major_job VARCHAR2(25) NOT NULL,
	nur_name VARCHAR2(20) NOT NULL,
	nur_gen VARCHAR2(1),
	nur_phone VARCHAR2(15),
	nur_email vARCHAR2(50),
	nur_position VARCHAR2(20) NOT NULL,
	PRIMARY KEY(nur_id)
);
CREATE TABLE Patients(
	pat_id DECIMAL NOT NULL,
	nur_id DECIMAL NOT NULL,
	doc_id DECIMAL NOT NULL,
	pat_name VARCHAR2(20) NOT NULL,
	pat_gen VARCHAR2(1) NOT NULL,
	pat_jumin VARCHAR2(14) NOT NULL,
	pat_addr VARCHAR2(100) NOT NULL,
	pat_phone VARCHAR2(15),
	pat_email VARCHAR2(50),
	pat_job VARCHAR2(20) NOT NULL,
	PRIMARY KEY(pat_id),
	FOREIGN KEY(nur_id) REFERENCES Nurses(nur_id),
	FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id)	
);
CREATE TABLE Treatments(
	treat_id DECIMAL NOT NULL,
	pat_id DECIMAL NOT NULL,
	doc_id DECIMAL NOT NULL,
	treat_contents VARCHAR2(1000) NOT NULL,
	treat_date VARCHAR2(15) NOT NULL,
	PRIMARY KEY(treat_id),
	FOREIGN KEY(pat_id) REFERENCES Patients(pat_id),
	FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id)
);
CREATE TABLE Charts(
	chart_id VARCHAR2(20) NOT NULL,
	treat_id DECIMAL NOT NULL,
	doc_id DECIMAL NOT NULL,
	pat_id DECIMAL NOT NULL,
	nur_id DECIMAL NOT NULL,
	chart_contents VARCHAR2(1000) NOT NULL,
	PRIMARY KEY(chart_id),
	FOREIGN KEY(treat_id) REFERENCES Treatments(treat_id),
	FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id),
	FOREIGN KEY(pat_id) REFERENCES Patients(pat_id),
	FOREIGN KEY(nur_id) REFERENCES Nurses(nur_id)
);
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(980312,'�Ҿư�','������','M','010-333-1340','ltj@hanbh.com','����');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(000601,'����','�ȼ���','M','011-222-0987','ask@hanbh.com','����');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(001208,'�ܰ�','�����','M','010-333-8743','kmj@hanbh.com','����');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(020403,'�Ǻΰ�','���¼�','M','019-777-3764','lts@hanbh.com','����');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(050900,'�Ҿư�','�迬��','F','010-555-3746','kya@hanbh.com','������');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(050101,'����','������','M','011-222-7643','cth@hanbh.com','������');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(062019,'�Ҿư�','������','F','010-999-1265','jjh@hanbh.com','������');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(070576,'�Ǻΰ�','ȫ�浿','M','016-333-7263','hgd@hanbh.com','������');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(080543,'��缱��','���缮','M','010-222-1263','yjs@hanbh.com','����');
INSERT INTO DOCTORS(doc_id,major_treat,doc_name,doc_gen,doc_phone,doc_email,doc_position)
VALUES(091001,'�ܰ�','�躴��','M','010-555-3542','kbm@hanbh.com','������');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(050302,'�Ҿư�','������','F','010-555-8751','key@hanbh.com','����ȣ��');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(050021,'����','������','F','016-333-8745','ysa@hanbh.com','����ȣ��');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(040089,'�Ǻΰ�','������','M','010-666-7646','sjw@hanbh.com','����');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(070605,'��缱��','����ȭ','F','010-333-4588','yjh@hanbh.com','����');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(070804,'����','���ϳ�','F','010-222-1340','nhn@hanbh.com','����');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(071018,'�Ҿư�','��ȭ��','F','019-888-4116','khk@hanbh.com','��ȣ��');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(100356,'�Ҿư�','�̼���','M','010-777-1234','lsy@hanbh.com','��ȣ��');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(104145,'�ܰ�','����','M','010-999-8520','kh@hanbh.com','��ȣ��');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(120309,'�Ǻΰ�','�ڼ���','M','010-777-4996','psw@hanbh.com','��ȣ��');
INSERT INTO NURSES(nur_id,major_job,nur_name,nur_gen,nur_phone,nur_email,nur_position)
VALUES(130211,'�ܰ�','�̼���','F','010-222-3214','lsy@hanbh.com','��ȣ��');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(2345,050302,980312,'�Ȼ��','M',232345,'����','010-555-7845','ask@ab.com','ȸ���');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(3545,040089,020403,'�輺��','M',543545,'����','010-333-7812','ksr@bb.com','�ڿ���');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(3424,070605,080543,'������','M',433424,'�λ�','019-888-4859','ljj@ab.com','ȸ���');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(7675,100356,050900,'�ֱ���','M',677675,'����','010-222-4847','cks@cc.com','ȸ���');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(4533,070804,000601,'���Ѱ�','M',744533,'����','010-777-9630','jhk@ab.com','����');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(5546,120309,070576,'������','M',765546,'�뱸','016-777-0214','ywh@cc.com','�ڿ���');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(4543,070804,050101,'������','M',454543,'�λ�','010-555-4187','cjj@bb.com','ȸ���');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(9768,130211,091001,'������','F',119768,'����','010-888-3675','ljh@ab.com','����');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(4234,130211,091001,'������','F',234234,'����','010-999-6541','onm@ab.com','�л�');
INSERT INTO PATIENTS(pat_id,nur_id,doc_id,pat_name,pat_gen,pat_jumin,pat_addr,pat_phone,pat_email,pat_job)
VALUES(7643,071018,062019,'�ۼ���','M',987643,'����','010-222-5874','ssm@ab.com','�л�');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(130516023,2345,980312,'����, ����','2013-05-16');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(130628100,3545,020403,'�Ǻ�, Ʈ���� ġ��','2013-06-28');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(131205056,3424,080543,'�� ��ũ�� MRI �Կ�','2013-12-05');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(131218024,7675,050900,'���̿�','2013-12-18');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(131224012,4533,000601,'�忰','2013-12-24');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(140103001,5546,070576,'���帧 ġ��','2014-01-03');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(140109026,4543,050101,'����','2014-01-09');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(140226102,9768,091001,'ȭ��ġ��','2014-02-26');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(140303003,4234,091001,'������ �ܻ�ġ��','2014-03-03');
INSERT INTO TREATMENTS(treat_id,pat_id,doc_id,treat_contents,treat_date)
VALUES(140308087,7643,062019,'�忰','2014-03-08');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('p_130516023',130516023,980312,2345,050302,'���� �ֻ� �� �� ó��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('d_130628100',130628100,020403,3545,040089,'�Ǻ� ���� ���� �ֻ�');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('r_131205056',131205056,080543,3424,070605,'�ֻ� ó��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('p_131218024',131218024,050900,7675,100356,'�Ӽ�û�� �� �� ó��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('i_131224012',131224012,000601,4533,070804,'�忰 �Կ�ġ��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('d_140103001',140103001,070576,5546,120309,'���帧 ġ��� ó��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('i_140109026',140109026,050101,4543,070804,'�����ð�');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('s_140226102',140226102,091001,9768,130211,'ȭ�� ũ���� ó��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('s_140303003',140303003,091001,4234,130211,'�Կ�ġ��');
INSERT INTO CHARTS(chart_id,treat_id,doc_id,pat_id,nur_id,chart_contents)
VALUES('s_140308087',140308087,062019,7643,071018,'�忰 �Կ�ġ��');