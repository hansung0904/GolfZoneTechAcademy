CREATE TABLE member
(

    num integer NOT NULL,
    id character varying(10) NOT NULL, // 셀에 데이터가 없다~ -> 셀을 빈칸으로 두지 않겠다~
    pw character varying(10) NOT NULL,
    name character varying(10) NOT NULL,
    tel character varying(10) NOT NULL,
    PRIMARY KEY (num)

);