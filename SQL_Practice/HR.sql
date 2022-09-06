-- ��� ����� ���� ���
SELECT
    *
FROM
    employees;

-- ��� ����� ���� �� �������̵� ��� (��������)
SELECT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

-- DISTINCT�� �ߺ�����
SELECT DISTINCT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

-- ����� ���� �� �������̵� ���
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

-- ��� ����� ���� �� ���� ���̵�� �޿� ���
-- ���� ���̵�� ������, �޿��� �������� ��µǵ���
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

-- ���� ���̿� ($)  ���
SELECT
    job_id  AS ����,
    salary  AS "����($)"
FROM
    employees;

-- ��� ����� ���� ���
SELECT
    COUNT(*)
FROM
    employees;

-- ��� ȸ�� ��Ϻ���
SELECT
    *
FROM
    member;

-- ��� ȸ�� �� ����
SELECT
    COUNT(*) AS row_count
FROM
    member;

-- ��� ����� ���� ���
SELECT
    COUNT(*) emp_count
FROM
    employees;

-- ��� ����� �̸��� ���(�̸��� ���� �ϳ��� �÷����� ��� �����ϳ� �߰��ؼ�)
SELECT
    first_name
    || ' '
    || last_name
FROM
    employees;

-- �ڹٿ��� �������� ���ؼ� ��Ī FULL_NAME�� ��
SELECT
    first_name
    || ' '
    || last_name "FULL_NAME"
FROM
    employees;

-- 10�� �μ��� ������� ����� �μ��ڵ� ����غ�
SELECT
    employee_id,
    department_id
FROM
    employees
WHERE
    department_id = 10;

-- 30�� �μ��� ����� �޿��� ��� ����غ�
SELECT
    salary,
    department_id
FROM
    employees
WHERE
    department_id = 30;

-- 30�� �μ��� ������� �޿��� �μ��ڵ� ���
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

-- 30�� �μ� �̿��� �μ�������� �μ���ȣ, �޿� ���
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

-- NULL�� �� �ִ� ���� ã������ IS ��°� �� �־���Ѵ�. = �����ڰ� ���ԵǸ� NULL�̶�� �ؽ�Ʈ�� 
-- ���� �ִ��� üũ�Ѵ�.
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

-- �޿��� 20000�̻��̰ų� 2100 ������ ������� ����ڵ� �޿� ���
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

-- 75 77 �Ѳ����� ����غ�
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

-- �Ѳ����� ����Ұǵ� �ߺ� �� �����ϰ� �̾ƺ�
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

-- �Ѳ����� ����Ұǵ� �ߺ� �� �� ����غ�
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

-- �޿��� 4000�̻��ϸ鼭 1000������ ����� ���(���,�̸�,�޿�)
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

-- 100, 110, 130, 140�� ����� ���, �޿�, �ϻ����� ���
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

-- IN���� �ڵ带 ����ϰ� ���� �� �ִ�.
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

-- 8000, 12000, 20000 �̶�� ������ �ְ����޺��� ���� ������ �޴� ������������͹�
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

-- ������� ev �ܾ���� ����̸��鸸 ����غ���?
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

-- ������� Ŀ�̼� �����ؼ� ����غ���
SELECT
    employee_id,
    commission_pct
FROM
    employees;

-- Ŀ�̼��� null�� ������� Ŀ�̼� 5�� ����Ǿ���.
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

    --이름이 'Steven'인 사원정보 출력시 사번,사원명,부서번호,부서명이 보이도록 할 것.
--단,부서명 출력시 'Executive','행정부,'Shipping','발송부'할것.
select employee_id,first_name||' '||last_name
,e.department_id ,
decode(department_name,'Executive','행정부',
                        'Shipping','발송부') department_name
from employees e left outer join departments d
on e.department_id = d.department_id
where e.first_name = 'Steven';

--view : 복잡한 쿼리문을 논리적인 테이블형식으로 보여줄수있다.
CREATE VIEW EMP_DEPT_JOIN_VIEW
( EMP_ID
, EMP_NAME
, DEPT_ID
, DEPT_NAME
)
AS select employee_id,first_name||' '||last_name
,e.department_id ,
decode(department_name,'Executive','행정부',
                        'Shipping','발송부') department_name
from employees e left outer join departments d
on e.department_id = d.department_id;

select * from EMP_DEPT_JOIN_VIEW
where emp_name like '%Steven%'
order by emp_id desc;


--검색결과표를 복제해서 별도의 테이블로 생성하기.
CREATE table EMP_DEPT_JOIN_TAB
( EMP_ID
, EMP_NAME
, DEPT_ID
, DEPT_NAME
)
AS (select employee_id,first_name||' '||last_name
,e.department_id ,
decode(department_name,'Executive','행정부',
                        'Shipping','발송부') department_name
from employees e left outer join departments d
on e.department_id = d.department_id);

create table temp_emp
as (select employee_id,first_name,last_name,salary,department_id,job_id from employees);

create table temp_dept
as (select * from departments);