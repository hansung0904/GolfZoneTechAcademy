SELECT
    *
FROM
    tab;

/*?뀒?씠釉? ?깮?꽦*/
CREATE TABLE member (
    num       NUMBER NOT NULL,
    id        VARCHAR2(20) NOT NULL,
    pw        VARCHAR2(20) NOT NULL,
    name      VARCHAR2(20) NOT NULL,
    tel       VARCHAR2(20) NOT NULL,
    img_name  VARCHAR2(50) DEFAULT 'img_0001.png',
    CONSTRAINT member_pk PRIMARY KEY ( num ) ENABLE
);

/*?뀒?씠釉? ?닔?젙*/
ALTER TABLE member ADD CONSTRAINT member_uk1 UNIQUE ( id ) ENABLE;

/*?뀒?씠釉? ?궘?젣*/
DROP TABLE "KOSTA"."MEMBER";

--selectAll
SELECT
    *
FROM
    member
ORDER BY
    num DESC;

--searchList
SELECT
    *
FROM
    member
WHERE
    name LIKE '%ki%'
ORDER BY
    num DESC;

SELECT
    *
FROM
    member
WHERE
    name LIKE '_ki%';

SELECT
    *
FROM
    member
WHERE
    name LIKE '__ki%';

SELECT
    *
FROM
    member
WHERE
    name LIKE 'k_';

SELECT
    *
FROM
    member
WHERE
    name LIKE 'k__';


--selectOne
SELECT
    *
FROM
    member
WHERE
    num = 12;

--login
SELECT
    *
FROM
    member
WHERE
        id = 'ADMIN4'
    AND pw = 'AA1212';

--idCheck
SELECT
    *
FROM
    member
WHERE
    id = 'ADMIN4';

INSERT INTO member (
    num,
    id,
    pw,
    name,
    tel,
    img_name
) VALUES (
    seq_member.NEXTVAL,
    'admin4',
    'aaaa1212',
    'KIM',
    '011',
    'admin_img_0002.png'
);

UPDATE member
SET
    pw = 'aa1212',
    name = 'lee',
    tel = '02',
    img_name = 'admin4_img_0003.png'
WHERE
    num = 12;

DELETE FROM member
WHERE
    num = 10;

DROP TABLE test2;

CREATE TABLE test2 (
    fname VARCHAR2(20)
);

INSERT INTO test2 VALUES ( 'S1234' );

INSERT INTO test2 VALUES ( '1234S_1234' );

INSERT INTO test2 VALUES ( '1234Sa1234' );

INSERT INTO test2 VALUES ( '1234Sb1234' );

INSERT INTO test2 VALUES ( '$S_1234' );

INSERT INTO test2 VALUES ( 'sssS_1234' );

INSERT INTO test2 VALUES ( 'THE X\_Y' );

INSERT INTO test2 VALUES ( 'THE1 X_Y' );

INSERT INTO test2 VALUES ( 'THE X\&Y' );

INSERT INTO test2 VALUES ( 'THE X&Y' );

INSERT INTO test2 VALUES ( 'THE2 X_Y' );

-- _는 1글자 역할을 한다. s다음 _가 들어있는 애들 다 뿌림
SELECT
    *
FROM
    test2
WHERE
    fname LIKE '%S_1%';

SELECT
    *
FROM
    test2
WHERE
    fname LIKE '%S\_1%' ESCAPE '\';

SELECT
    *
FROM
    test2
WHERE
    fnmae LIKE '%&Y' ESCAPE '\';

TRUNCATE TABLE test2;

-- dummy table 을 이용한 출력하기.
SELECT
    *
FROM
    dual;

SELECT
    25 * 25
FROM
    dual;

SELECT
    25 * 25
FROM
    test2;

SELECT
    CHR(65)
FROM
    dual;

SELECT
    sysdate
FROM
    test2;


--initcap
SELECT
    initcap(name)
FROM
    member;

SELECT
    *
FROM
    member;
-- lower
SELECT
    lower(id)
FROM
    member;

-- upper
SELECT
    upper(id)
FROM
    member;

SELECT
    lpad('yangssem', 13, '*#')
FROM
    dual;

SELECT
    lpad('\20000', 13, '')
FROM
    dual;

SELECT
    rpad('yangssem', 13, '@')
FROM
    dual;

SELECT
    ltrim('aa123456aa', 'aa')
FROM
    dual;

SELECT
    rtrim('aa123456', 'aa')
FROM
    dual;

SELECT
    'yang and sam'
FROM
    dual;

SELECT
    replace('yang and sam', 'sa', 'sse')
FROM
    dual;

SELECT
    replace(name, 'hanseong')
FROM
    member;
-- replace
SELECT
    name
FROM
    member;
    
    
select replace(name,'ki','lee') from member;

select substr('ABCDEFG', 2, 1) from dual;


-- 전공, 학과, 학생
-- 전공 - MAJOR_ID, MAJOR_NAME , MIN_SCORE, MAX_SCORE
-- 학과 - DEPARTMENT_ID, DEPARTMENT_NAME,  과대번호
-- 학생 - STUDENT_ID, STUDENT_NAME, MAJOR_ID, MAJOR_NUM, SCORE(INT)
-- 사원목록2 사원추가 부서목록 부서추가 전공목록 전공추가
CREATE TABLE MAJOR (
    major_id       NUMBER NOT NULL,
    major_name     varchar2(20) NOT NULL,
    min_score      number NOT NULL,
    max_score      number NoT NUll,
    CONSTRAINT major_pk primary key (major_id)
);

create table department (
    department_id number not null,
    department_name varchar(20) not null,
    department_leader_tel varchar(20) not null,
    CONSTRAINT department_pk primary key (department_id)
);

create table student (
    student_id number not null,
    student_name varchar(20) not null,
    major_id number not null,
    student_score number not null,
    CONSTRAINT student_pk primary key (student_id),
    CONSTRAINT fk_major_id foreign key(major_id) references major(major_id)
);

create sequence seq_major;
create sequence seq_deparment;
create sequence seq_student;

INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '기계과', 10,50);
INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '컴퓨터공학과', 30,100);
INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '경영학과', 40,90);
INSERT INTO MAJOR VALUES (seq_major.NEXTVAL, '소방학과', 30,80);
INSERT INTO MAJOR VALUES (1,'기계과',10, 40);

SELECT * FROM MAJOR;

drop table MAJOR;
drop table member;
drop table student;
----------------------------
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

select * from major;
insert into major values ('100516', '기계자동차공학과', 10, 50);
insert into major values ('100517', '컴퓨터공학과', 30, 100);
insert into major values ('100518', '경영학과', 40, 60);
insert into major values ('hanseong4', '수학과', 20, 70);

select * from student;
insert into student values (333,'최한성1',100,'hanseong1',333);
insert into student values (44405959,'최한성2',100,'hanseong2',44405959);
insert into student values (112305959,'최한성3',100,'hanseong3',112305959);
insert into student values (10555959,'최한성4',100,'hanseong4',10555959);

select * from dept;
insert into dept values (333, '기계자동차공학부1',4);
insert into dept values (44405959, '기계자동차공학부2',5);
insert into dept values (112305959, '기계자동차공학부3',6);
insert into dept values (10555959, '기계자동차공학부4',7);

CREATE SEQUENCE SEQ_DEPT INCREMENT BY 10 START WITH 10;
CREATE SEQUENCE SEQ_STUDENT INCREMENT BY 1 START WITH 100;
