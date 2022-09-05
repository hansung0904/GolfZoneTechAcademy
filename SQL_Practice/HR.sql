-- 모든 사원의 정보 출력
SELECT
    *
FROM
    employees;

-- 모든 사원의 정보 중 업무아이디만 출력 (오름차순)
SELECT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

-- DISTINCT는 중복제거
SELECT DISTINCT
    job_id
FROM
    employees
ORDER BY
    job_id ASC;

-- 사원의 정보 중 업무아이디만 출력
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

-- 모든 사원의 정보 중 업무 아이디와 급여 출력
-- 업무 아이디는 업무로, 급여는 월급으로 출력되도록
SELECT
    job_id  업무,
    salary  월급
FROM
    employees;

SELECT
    job_id  AS 업무,
    salary  AS 월급
FROM
    employees;

-- 월급 사이에 ($)  출력
SELECT
    job_id  AS 업무,
    salary  AS "월급($)"
FROM
    employees;

-- 모든 사원의 수를 출력
SELECT
    COUNT(*)
FROM
    employees;

-- 모든 회원 목록보기
SELECT
    *
FROM
    member;

-- 모든 회원 수 보기
SELECT
    COUNT(*) AS row_count
FROM
    member;

-- 모든 사원의 수를 출력
SELECT
    COUNT(*) emp_count
FROM
    employees;

-- 모든 사원의 이름을 출력(이름과 성을 하나의 컬럼으로 출력 공백하나 추가해서)
SELECT
    first_name
    || ' '
    || last_name
FROM
    employees;

-- 자바에서 가져오기 위해서 별칭 FULL_NAME을 줌
SELECT
    first_name
    || ' '
    || last_name "FULL_NAME"
FROM
    employees;

-- 10번 부서의 사원들의 사번과 부서코드 출력해봐
SELECT
    employee_id,
    department_id
FROM
    employees
WHERE
    department_id = 10;

-- 30번 부서의 사원의 급여와 사번 출력해봐
SELECT
    salary,
    department_id
FROM
    employees
WHERE
    department_id = 30;

-- 30번 부서의 사원들의 급여와 부서코드 출력
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

-- 30번 부서 이외의 부서사람들의 부서번호, 급여 출력
SELECT
    department_id  deptno,
    salary         sal
FROM
    employees
WHERE
    department_id != 30;

-- 59번째 문법과 같다.
SELECT
    department_id  deptno,
    salary         sal
FROM
    employees
WHERE
    NOT department_id = 30;

-- NULL이 들어가 있는 값을 찾으려면 IS 라는걸 써 주어야한다. = 연산자가 들어가게되면 NULL이라는 텍스트가 
-- 들어가져 있는지 체크한다.
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

-- 급여가 20000이상이거나 2100 이하인 사원들의 사원코드 급여 출력
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary >= 20000
    OR salary <= 2100;
-- 급여 2200미만인 애들 
SELECT
    employee_id,
    salary
FROM
    employees
WHERE
    salary < 2200;

-- 75 77 한꺼번에 출력해봐
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

-- 한꺼번에 출력할건데 중복 행 제거하고 뽑아봐
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

-- 한꺼번에 출력할건데 중복 행 만 출력해봐
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

-- 급여가 4000이상하면서 1000이하인 사원들 출력(사번,이름,급여)
SELECT
    employee_id,
    first_name,
    salary
FROM
    employees
WHERE
        salary >= 4000
    AND salary <= 10000;

-- BETWEEN으로 똑같이 처리할 수 있음 99번째 SQL문
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

-- 100, 110, 130, 140번 사원의 사번, 급여, 일사일자 출력
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

-- IN으로 코드를 깔끔하게 해줄 수 있다.
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

-- 8000, 12000, 20000 이라는 월급중 최고월급보다 적은 월급을 받는 사원정보가져와바
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

-- 사원명에 ev 단어가들어가는 사원이름들만 출력해볼래?
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

-- 사원들의 커미션 적용해서 출력해보기
SELECT
    employee_id,
    commission_pct
FROM
    employees;

-- 커미션이 null인 사원들이 커미션 5로 변경되어짐.
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