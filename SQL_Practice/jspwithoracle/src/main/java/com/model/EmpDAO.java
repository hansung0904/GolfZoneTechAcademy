package com.model;

import java.util.List;

public interface EmpDAO {
	
	public List<EmpVO> selectAll();

	public List<Integer> selectDeptID();

	public List<String> selectJobID();

}
