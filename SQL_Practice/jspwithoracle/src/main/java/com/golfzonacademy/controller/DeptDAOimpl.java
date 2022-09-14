package com.golfzonacademy.controller;


import com.model.DeptDAO;
import com.model.DeptVO;
import com.model.EmpDB_oracle;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOimpl implements DeptDAO {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public DeptDAOimpl() {
        try {
            Class.forName(EmpDB_oracle.DRIVER_NAME);
            System.out.println("Driver Successed...");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<DeptVO> selectAll() {
        System.out.println("selectAll()....");

        List<DeptVO> vos = new ArrayList<DeptVO>();

        try {
            conn = DriverManager.getConnection(EmpDB_oracle.URL, EmpDB_oracle.USER, EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(EmpDB_oracle.SQL_DEPT_SELECT_ALL);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                DeptVO vo = new DeptVO();
                vo.setDepartment_id(rs.getInt("department_id"));
                vo.setDepartment_name(rs.getString("department_name"));
                vo.setManager_id(rs.getInt("manager_id"));
                vo.setLocation_id(rs.getInt("location_id"));
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
    public int insert(DeptVO vo) {
        System.out.println("Dept insert()....");
        System.out.println(vo);

        int flag = 0;
        try {
            conn = DriverManager.getConnection(
                    EmpDB_oracle.URL,
                    EmpDB_oracle.USER,
                    EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    EmpDB_oracle.SQL_DEPT_INSERT);
            pstmt.setString(1, vo.getDepartment_name());
            pstmt.setInt(2, vo.getManager_id());
            pstmt.setInt(3, vo.getLocation_id());
            flag = pstmt.executeUpdate();
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

        return flag;
    }

    @Override
    public List<Integer> selectEmpID() {
        System.out.println("selectEmpID()....");
        List<Integer> emp_ids = new ArrayList<Integer>();

        try {
            conn = DriverManager.getConnection(
                    EmpDB_oracle.URL,
                    EmpDB_oracle.USER,
                    EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    EmpDB_oracle.SQL_EMP_ID);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                emp_ids.add(rs.getInt("employee_id"));
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

        return emp_ids;
    }

    @Override
    public List<Integer> selectLocID() {
        System.out.println("selectLocID()....");
        List<Integer> loc_ids = new ArrayList<Integer>();

        try {
            conn = DriverManager.getConnection(
                    EmpDB_oracle.URL,
                    EmpDB_oracle.USER,
                    EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    EmpDB_oracle.SQL_LOC_ID);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                loc_ids.add(rs.getInt("location_id"));
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

        return loc_ids;
    }

    @Override
    public List<DeptVO> dept_join_view() {
        System.out.println("selectAll()....");

        List<DeptVO> vos = new ArrayList<DeptVO>();

        try {
            conn = DriverManager.getConnection(EmpDB_oracle.URL, EmpDB_oracle.USER, EmpDB_oracle.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(EmpDB_oracle.SQL_EMP_DEPT_JOIN_VIEW);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                DeptVO vo = new DeptVO();
                vo.setDepartment_id(rs.getInt("department_id"));
                vo.setDepartment_name(rs.getString("department_name"));
                vo.setManager_id(rs.getInt("manager_id"));
                vo.setLocation_id(rs.getInt("location_id"));
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
}
