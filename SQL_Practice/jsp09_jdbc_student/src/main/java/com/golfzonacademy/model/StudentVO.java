package com.golfzonacademy.model;

import java.io.Serializable;

public class StudentVO implements Serializable {

    private int studentID;

    private String studentName;

    private int score;

    private String majorID;

    private int deptID;


    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setMajorID(String majorID) {
        this.majorID = majorID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getScore() {
        return score;
    }

    public String getMajorID() {
        return majorID;
    }

    public int getDeptID() {
        return deptID;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", score=" + score +
                ", majorID='" + majorID + '\'' +
                ", deptID=" + deptID +
                '}';
    }


}
