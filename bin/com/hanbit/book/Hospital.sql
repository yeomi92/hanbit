DROP TABLE Charts;
DROP TABLE Treatments;
DROP TABLE Patients;
DROP TABLE Nurses;
DROP TABLE Doctors;
CREATE TABLE Doctors(
	doc_id DECIMAL NOT NULL,
	major_treat VARCHAR2(25) NOT NULL,
	doc_name VARCHAR2(20) NOT NULL,
	doc_gen CHAR(1) NOT NULL,
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
	nur_position VARCHAR2(10) NOT NULL,
	PRIMARY KEY(nur_id)
);
CREATE TABLE Patients(
	pat_id DECIMAL NOT NULL,
	nur_id DECIMAL NOT NULL,
	doc_id DECIMAL NOT NULL,
	pat_name VARCHAR2(20) NOT NULL,
	pat_gen VARVHAR2(1) NOT NULL,
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
	treat_date DATE NOT NULL,
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
	char_contents VARCHAR2(1000) NOT NULL,
	PRIMARY KEY(chart_id),
	FOREIGN KEY(treat_id) REFERENCES Treatments(treat_id),
	FOREIGN KEY(doc_id) REFERENCES Doctors(doc_id),
	FOREIGN KEY(pat_id) REFERENCES Patients(pat_id),
	FOREIGN KEY(nur_id) REFERENCES Nurses(nur_id)
);
select * from Nurses;