CREATE TABLE MAJOR (
    major_id       NUMBER NOT NULL,
    major_name     varchar2(20) NOT NULL,
    min_score      number NOT NULL,
    max_score      number NoT NUll,
    CONSTRAINT major_pk primary key (major_id)
);

create table department (
    department_id, number not null,
    department_name varchar(20) not null,
    department_leader_tel varchar(20) not null,
    CONSTRAINT department_pk primary key (department_id)
);

create table student (
    student_id, number not null,
    student_name varchar(20) not null,
    student_score number not null,
    CONSTRAINT student_pk primary key (student_id);
    CONSTRAINT fk_major_id foreign key(major_id) references major(major_id)
);

create sequence seq_major;
create sequence seq_deparment;
create sequence seq_student;

INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '기계자동차공학과', 10,50);
INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '컴퓨터공학과', 30,100);
INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '경영학과', 40,90);
INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '소방학과', 30,80);





--전공,학과,학생
--전공-전공아이디,전공명,최소학점,최대학점
--학과-학과번호,학과명,과대번호
--학생-학생번호,학생명,학점,전공아이디,학과번호
--사원목록2 사원추가 부서목록 부서추가 전공목록 전공추가

CREATE TABLE DEPT 
(
  DEPT_ID NUMBER NOT NULL 
, DEPT_NAME VARCHAR2(50) 
, MGR_ID NUMBER 
, CONSTRAINT DEPARTMENTS_PK PRIMARY KEY 
  (
    DEPT_ID 
  )
  ENABLE 
);

CREATE TABLE MAJOR 
(
  MAJOR_ID VARCHAR2(20) NOT NULL 
, MAJOR_TITLE VARCHAR2(50) 
, MIN_SCORE NUMBER 
, MAX_SCORE NUMBER 
, CONSTRAINT TABLE1_PK PRIMARY KEY 
  (
    MAJOR_ID 
  )
  ENABLE 
);


CREATE TABLE STUDENT 
(
  ST_ID NUMBER NOT NULL 
, ST_NAME VARCHAR2(50) NOT NULL 
, SCORE NUMBER NOT NULL 
, MAJOR_ID VARCHAR2(20) 
, DEPT_ID NUMBER
, CONSTRAINT STUDENT_PK PRIMARY KEY 
  (
    ST_ID 
  )
  ENABLE 
);

ALTER TABLE STUDENT
ADD CONSTRAINT STUDENT_FK1 FOREIGN KEY
(
  DEPT_ID 
)
REFERENCES DEPT
(
  DEPT_ID 
)
ENABLE;

ALTER TABLE STUDENT
ADD CONSTRAINT STUDENT_FK2 FOREIGN KEY
(
  MAJOR_ID 
)
REFERENCES MAJOR
(
  MAJOR_ID 
)
ENABLE;