package com.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAOimpl implements EmpDAO {

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public EmpDAOimpl() {
        try {
            Class.forName(EmpDB_oracle.DRIVER_NAME);
            System.out.println("Driver Successed...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<EmpVO> selectAll() {
        System.out.println("selectAll()....");

        List<EmpVO> vos = new ArrayList<EmpVO>();

        try {
            conn = DriverManager.getConnection(
                    EmpDB_oracle.URL,
                    EmpDB_oracle.USER,
                    EmpDB_oracle.PASSWORD);
            System.out.println("Conn Successed ...");
            pstmt = conn.prepareStatement(
                    EmpDB_oracle.SQL_SELECT_ALL);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                EmpVO vo = new EmpVO();
                vo.setEmployee_id(rs.getInt("employee_id"));
                vo.setFirst_name(rs.getString("first_name"));
                vo.setLast_name(rs.getString("last_name"));
                vo.setSalary(rs.getInt("salary"));
                vo.setJob_id(rs.getString("job_id"));
                vo.setDepartment_id(rs.getString("department_id"));
                vos.add(vo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vos;
    }

    @Override
    public List<Integer> selectDeptID() {
        System.out.println("selectDeptID()....");
        List<Integer> dept_ids = new ArrayList<Integer>();

        try {
            conn = DriverManager.getConnection(
                    EmpDB_oracle.URL,
                    EmpDB_oracle.USER,
                    EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    EmpDB_oracle.SQL_DEPT_ID);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                dept_ids.add(rs.getInt("department_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return dept_ids;
    }

    @Override
    public List<String> selectJobID() {
        System.out.println("selectDeptID()....");
        List<String> job_ids = new ArrayList<String>();

        try {
            conn = DriverManager.getConnection(
                    EmpDB_oracle.URL,
                    EmpDB_oracle.USER,
                    EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    EmpDB_oracle.SQL_JOB_ID);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                job_ids.add(rs.getString("job_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return job_ids;
    }

}
