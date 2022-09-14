package com.model;

import java.util.List;

public interface DeptDAO {

    List<DeptVO> selectAll();

    List<Integer> selectEmpID();

    List<Integer> selectLocID();

    int insert(DeptVO vo);

    List<DeptVO> dept_join_view();
}
