package com.golfzonacademy.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOimple implements StudentDAO {

    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public StudentDAOimple() {
        try {
            Class.forName(StudentDB.DRIVER_NAME);
            System.out.println("Driver success");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<StudentVO> selectAll() {
        System.out.println("selectAll...");
        List<StudentVO> vos = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(
                    StudentDB.URL, StudentDB.USER, StudentDB.PASSWORD);
            pstmt = conn.prepareStatement(
                    StudentDB.SQL_EMP_SELECT_ALL);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentVO vo = new StudentVO();
                vo.setStudentID(rs.getInt("studentID"));
                vo.setScore(rs.getInt("setScore"));
                vo.setDeptID(rs.getInt("DeptID"));
                vo.setMajorID(rs.getString("setMajorID"));
                vos.add(vo);
            }

            return vos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Integer> selectDeptId() {

        System.out.println("selectDeptId");
        List<Integer> dept_ids = new ArrayList<Integer>();

        try {
            conn = DriverManager.getConnection(
                    StudentDB.URL,
                    StudentDB.USER,
                    StudentDB.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    StudentDB.SQL_DEPT_ID);
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
    public List<String> selectMajorID() {
        System.out.println("selectDeptID()....");
        List<String> job_ids = new ArrayList<String>();

        try {
            conn = DriverManager.getConnection(
                    StudentDB.URL,
                    StudentDB.USER,
                    StudentDB.PASSWORD);
            System.out.println("conn Successed...");
            pstmt = conn.prepareStatement(
                    StudentDB.SQL_STUDENT_ID);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                job_ids.add(rs.getString("dept_ID"));
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