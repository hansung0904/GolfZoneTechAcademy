package com.golfzonacademy.dept.model;

import test.com.dept.model.DeptVO;

import java.util.List;

public interface DeptDAO {

	public int insert(test.com.dept.model.DeptVO vo);

	public List<DeptVO> selectAll();

	public List<Integer> json_st_id();

}
