package com.model;

public interface EmpDB_oracle {

    String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    String USER = "HR";
    String PASSWORD = "hi123456";
    String SQL_SELECT_ALL = "select * from temp_emp order by employee_id asc";
    String SQL_DEPT_ID = "select department_id from temp_dept";
    String SQL_JOB_ID = "select job_id from temp_job";


}
