SELECT
    *
FROM
    employees;

SELECT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

SELECT DISTINCT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

SELECT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

SELECT DISTINCT
    job_id,
    employee_id
FROM
    employees
ORDER BY
    job_id ASC;

SELECT
    job_id  ����,
    salary  ����
FROM
    employees;

SELECT
    job_id  AS ����,
    salary  AS ����
FROM
    employees;

SELECT
    job_id  AS ����,
    salary  AS "����($)"
FROM
    employees;

SELECT
    COUNT(*)
FROM
    employees;

SELECT
    *
FROM
    member;

SELECT
    COUNT(*) AS row_count
FROM
    member;

SELECT
    COUNT(*) emp_count
FROM
    employees;

SELECT
    first_name
    || ' '
    || last_name
FROM
    employees;

SELECT
    first_name
    || ' '
    || last_name "FULL_NAME"
FROM
    employees;

SELECT
    employee_id,
    department_id
FROM
    employees
WHERE
    department_id = 10;

SELECT
    salary,
    department_id
FROM
    employees
WHERE
    department_id = 30;

SELECT
    salary,
    employee_id
FROM
    employees
WHERE
    employee_id = 130;

SELECT
    first_name,
    last_name,
    salary * 1.1
FROM
    employees
WHERE
    department_id = 10;

SELECT
    first_name,
    last_name,
    salary
FROM
    employees
WHERE
    salary >= 3000;

SELECT
    first_name,
    last_name,
    salary
FROM
    employees
WHERE
    salary < 3000;

SELECT
    department_id,
    salary
FROM
    employees
WHERE
    department_id != 30;

-- 30�� �μ� �̿��� �μ��������? �μ���ȣ, �޿� ���?
SELECT
    department_id  deptno,
    salary         sal
FROM
    employees
WHERE
    department_id != 30;

-- 59��° ������ ����.
SELECT
    department_id  deptno,
    salary         sal
FROM
    employees
WHERE
    NOT department_id = 30;

-- NULL�� ���? �ִ� ���� ã������ IS ��°�? �� �־���Ѵ�?. = �����ڰ� ���ԵǸ�? NULL�̶��? �ؽ�Ʈ�� 
-- ����? �ִ��� üũ�Ѵ�.
SELECT
    department_id  deptno,
    salary         sal
FROM
    employees
WHERE
    department_id IS NULL;

SELECT
    COUNT(*)
FROM
    employees
WHERE
    department_id IS NOT NULL;

SELECT
    *
FROM
    employees;

SELECT
    department_id  deptno,
    first_name,
    salary         sal
FROM
    employees
WHERE
    department_id IS NOT NULL
    AND salary >= 20000;

SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary >= 20000
    OR salary <= 2100;
-- �޿� 2200�̸��� �ֵ� 
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary < 2200;

-- 75 77 �Ѳ����� ����غ�?
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary >= 20000
    OR salary <= 2100
UNION ALL
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary < 2200;

-- �Ѳ����� ����Ұǵ�? �ߺ� �� �����ϰ� �̾ƺ�
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary >= 20000
    OR salary <= 2100
UNION
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary < 2200;

-- �Ѳ����� ����Ұǵ�? �ߺ� �� �� ����غ�?
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary >= 20000
    OR salary <= 2100
INTERSECT
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary < 2200;

SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary >= 20000
    OR salary <= 2100
MINUS
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary < 2200;

-- �޿��� 4000�̻��ϸ鼭 1000������ �����? ���?(���?,�̸�,�޿�)
SELECT
    employee_id,
    first_name,
    salary
FROM
    employees
WHERE
        salary >= 4000
    AND salary <= 10000;

-- BETWEEN���� �Ȱ��� ó���� �� ���� 99��° SQL��
SELECT
    employee_id,
    first_name,
    salary
FROM
    employees
WHERE
    salary BETWEEN 1000 AND 10000
ORDER BY
    salary DESC;

-- 100, 110, 130, 140�� �����? ���?, �޿�, �ϻ����� ���?
SELECT
    employee_id,
    salary,
    hire_date
FROM
    employees
WHERE
    employee_id = 100
    OR employee_id = 110
    OR employee_id = 130
    OR employee_id = 140;

-- IN���� �ڵ带 ����ϰ�? ���� �� �ִ�.
SELECT
    employee_id,
    salary,
    hire_date
FROM
    employees
WHERE
    employee_id IN ( 100, 110, 130, 140 );

SELECT
    employee_id
FROM
    employees
WHERE
    department_id = 30;

-- 8000, 12000, 20000 �̶��? ������ �ְ����޺��� ���� ������ �޴� ������������͹�?
SELECT
    *
FROM
    employees
WHERE
    salary < ANY ( 8000,
                   12000,
                   20000 );

SELECT
    *
FROM
    employees
WHERE
    salary >= ALL ( 8000,
                    12000,
                    20000 );

-- �������? ev �ܾ����? ����̸���? ����غ���??
SELECT
    first_name,
    last_name
FROM
    employees
WHERE
    first_name LIKE '%ev%'
    OR last_name LIKE '%ev%';

SELECT
    *
FROM
    jobs
WHERE
    job_id LIKE '%D\_V%' ESCAPE '\';

SELECT
    first_name
    || ' '
    || last_name
FROM
    employees;

SELECT
    concat(first_name, last_name)
FROM
    employees;

SELECT
    concat(first_name, ' ')
FROM
    employees;

SELECT
    concat(concat(first_name, ' '), last_name)
FROM
    employees;

SELECT
    *
FROM
    employees;

SELECT
    salary
FROM
    employees;

SELECT
    first_name
FROM
    employees;

SELECT
    lpad(first_name, 20, ' ')
FROM
    employees;

SELECT
    employee_id,
    first_name,
    nvl2(department_id, 1, 0)
FROM
    employees;

-- �������? Ŀ�̼� �����ؼ� ����غ���?
SELECT
    employee_id,
    commission_pct
FROM
    employees;

-- Ŀ�̼��� null�� �������? Ŀ�̼� 5�� ����Ǿ���?.
SELECT
    employee_id,
    nvl(commission_pct, 5)
FROM
    employees;

SELECT
    hire_date,
    sysdate,
    months_between(sysdate, hire_date)
FROM
    employees
WHERE
    employee_id = 100;

SELECT
    next_day(systdate, 3)
FROM
    dual;

SELECT
    first_name,
    hire_date,
    next_day(hire_date, 2)
FROM
    employees;

SELECT
    sysdate,
    to_char(sysdate, 'D')
FROM
    dual;

SELECT
    sysdate,
    to_char(sysdate, 'DAY')
FROM
    dual;

SELECT
    sysdate,
    to_char(sysdate, 'DY')
FROM
    dual;

SELECT
    sysdate,
    to_char(sysdate, 'dd')
FROM
    dual;

SELECT
    *
FROM
    employees;

SELECT
    COUNT(*)
FROM
    employees;

SELECT
    COUNT(*)
FROM
    departments;

SELECT
    109 * 27
FROM
    dual;

SELECT
    *
FROM
    employees,
    departments;

-- 1 2 3 4 5
SELECT
    ( 1 - 1 ) * 10 + 1           startrow,
    ( 1 - 1 ) * 10 + 1 + 10 - 1  endrow
FROM
    dual;

SELECT
    *
FROM
    (
        SELECT
            ROWNUM         rnum,
            employee_id,
            first_name
            || ' '
            || last_name   emp_name,
            salary
        FROM
            employees
    )
WHERE
    rnum BETWEEN 6 AND 10;

SELECT
    employee_id,
    first_name
    || ' '
    || last_name emp_name,
    job_id,
    salary
FROM
    employees
WHERE
    ( job_id, salary ) IN (
        SELECT
            job_id, MIN(salary)
        FROM
            employees
        GROUP BY
            job_id
    );

CREATE TABLE temp_emp
    AS
        ( SELECT
            employee_id,
            first_name,
            last_name,
            salary,
            department_id,
            job_id
        FROM
            employees
        );

CREATE TABLE temp_dept
    AS
        ( SELECT
            *
        FROM
            departments
        );

CREATE TABLE temp_job
    AS
        ( SELECT
            *
        FROM
            jobs
        );

---1.temp_dept------------------------------------------------
CREATE TABLE temp_dept
    AS
        ( SELECT
            *
        FROM
            departments
        );

ALTER TABLE temp_dept MODIFY (
    department_id NOT NULL
);

ALTER TABLE temp_dept ADD CONSTRAINT temp_dept_pk PRIMARY KEY ( department_id ) ENABLE;

---2.temp_job------------------------------------------------
CREATE TABLE temp_job
    AS
        ( SELECT
            *
        FROM
            jobs
        );
--PK추�?
ALTER TABLE temp_job MODIFY (
    job_id NOT NULL
);

ALTER TABLE temp_job ADD CONSTRAINT temp_job_pk PRIMARY KEY ( job_id ) ENABLE;

---3.temp_emp------------------------------------------------
CREATE TABLE temp_emp
    AS
        ( SELECT
            employee_id,
            first_name,
            last_name,
            salary,
            department_id,
            job_id
        FROM
            employees
        );

ALTER TABLE temp_emp MODIFY (
    employee_id NOT NULL
);

ALTER TABLE temp_emp ADD CONSTRAINT temp_emp_pk PRIMARY KEY ( employee_id ) ENABLE;

ALTER TABLE temp_emp
    ADD CONSTRAINT temp_emp_fk1 FOREIGN KEY ( department_id )
        REFERENCES temp_dept ( department_id )
    ENABLE;

ALTER TABLE temp_emp
    ADD CONSTRAINT temp_emp_fk2 FOREIGN KEY ( job_id )
        REFERENCES temp_job ( job_id )
    ENABLE;
----------------------------------------------------------------

CREATE OR REPLACE VIEW join_emp_dept_view AS
    SELECT
        employee_id,
        first_name
        || ' '
        || last_name emp_name,
        salary,
        dept.department_name
    FROM
             temp_emp emp
        INNER JOIN temp_dept dept ON emp.department_id = dept.department_id;

SELECT
    department_id,
    job_id,
    SUM(salary)
FROM
    employees
WHERE
    department_id <= 40
GROUP BY
    ROLLUP(department_id,
           job_id)
ORDER BY
    department_id;

WITH e AS (
    SELECT
        employee_id,
        manager_id,
        salary,
        last_name
    FROM
        employees
    WHERE
        department_id = 50
), d AS (
    SELECT
        AVG(salary) avg_salary
    FROM
        employees
    WHERE
        department_id = 50
)
SELECT
    e.employee_id,
    e.last_name,
    e.salary
FROM
    e,
    d
WHERE
    e.salary < d.avg_salary;

SELECT
    *
FROM
    join_emp_dept_view;      
    
       SELECT
        employee_id,
        first_name
        || ' '
        || last_name emp_name,
        salary,
        dept.department_name
    FROM
             temp_emp emp
        INNER JOIN temp_dept dept ON emp.department_id = dept.department_id temp_job job ON job._jobid = job.job_title job_title;