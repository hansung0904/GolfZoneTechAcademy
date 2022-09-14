package com.golfzonacademy.model;

import java.util.List;

public interface StudentDAO {
    List<StudentVO> selectAll();

    List<Integer> selectDeptId();

    List<String> selectMajorID();
}
