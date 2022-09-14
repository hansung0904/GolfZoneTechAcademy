package com.golfzonacademy.model;

import java.util.List;

public interface DeptDAO {

    List<DeptVO> selectAll();

    List<Integer> selectMgrID();

    List<Integer> deptID();

}
