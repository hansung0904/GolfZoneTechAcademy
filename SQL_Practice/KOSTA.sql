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
