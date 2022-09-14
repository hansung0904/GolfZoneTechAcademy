package com.golfzonacademy.model;

public class DeptVO {

    private int deptID;

    private String deptName;

    private int mgrID;

    public int getDeptID() {
        return deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public int getMgrID() {
        return mgrID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setMgrID(int mgrID) {
        this.mgrID = mgrID;
    }

    @Override
    public String toString() {
        return "DeptVO{" +
                "deptID=" + deptID +
                ", deptName='" + deptName + '\'' +
                ", mgrID=" + mgrID +
                '}';
    }
}
