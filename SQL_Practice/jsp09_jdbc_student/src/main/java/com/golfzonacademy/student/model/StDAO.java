package com.golfzonacademy.student.model;

import test.com.student.model.StVO;

import java.util.List;

public interface StDAO {

	public int insert(test.com.student.model.StVO vo);

	public List<StVO> selectAll();

	public List<Integer> json_dept_id();

	public List<String> json_major_id();

}
