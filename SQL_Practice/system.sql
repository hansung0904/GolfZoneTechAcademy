-- USER SQL
CREATE USER "KOSTA" IDENTIFIED BY "hi123456"  ;

-- QUOTAS

-- ROLES
GRANT "CONNECT" TO "KOSTA" ;
GRANT "RESOURCE" TO "KOSTA" ;

-- SYSTEM PRIVILEGES
GRANT CREATE VIEW TO "KOSTA" ;

ALTER USER "HR" IDENTIFIED BY "hi123456" 
DEFAULT TABLESPACE "USERS"
TEMPORARY TABLESPACE "TEMP"
ACCOUNT UNLOCK ;

create table TEST1 (pnum number,p2num number,pcount number,price number);
insert into test1 values(1001,2001,100,5000);
insert into test1 values(1002,2002,100,3000);
insert into test1 values(1003,2003,100,2000);
create table TEST2 (pnum number,p2num number,pcount number,price number);
insert into test2 values(6001,7001,300,7000);
insert into test2 values(6002,7002,300,8000);
insert into test2 values(6003,7003,300,9000);
create table TEST_merge (pnum number,p2num number,pcount number,price
number);

MERGE INTO test_merge tm USING test1 t1 
ON (tm.pnum=t1.pnum)
WHEN MATCHED THEN
UPDATE SET tm.p2num=t1.p2num
WHEN NOT MATCHED THEN
INSERT VALUES(t1.pnum, t1.p2num, t1.pcount, t1.price);