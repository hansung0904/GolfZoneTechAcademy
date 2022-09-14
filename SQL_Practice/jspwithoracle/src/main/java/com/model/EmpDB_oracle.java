package com.model;

public interface EmpDB_oracle {

    String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    String USER = "HR";
    String PASSWORD = "hi123456";
    String SQL_EMP_SELECT_ALL = "select * from temp_emp order by employee_id desc";
    String SQL_EMP_INSERT = "insert into temp_emp(employee_id,first_name,last_name,salary,job_id,department_id) "
            + "values(employees_seq.nextval,?,?,?,?,?)";
    String SQL_DEPT_ID = "select department_id from temp_dept";
    String SQL_JOB_ID = "select job_id from temp_job";

    String SQL_DEPT_SELECT_ALL = "select * from temp_dept order by department_id desc";
    String SQL_DEPT_INSERT = "insert into temp_dept(department_id,department_name,manager_id,location_id) "
            + "values(departments_seq.nextval,?,?,?)";
    String SQL_EMP_ID = "select employee_id from temp_emp";
    String SQL_LOC_ID = "select location_id from locations";
}
