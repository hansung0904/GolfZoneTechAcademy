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

