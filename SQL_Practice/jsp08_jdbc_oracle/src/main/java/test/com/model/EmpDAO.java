package test.com.model;

import java.util.List;

public interface EmpDAO {
	
	public List<EmpVO> selectAll();

	public List<Integer> selectDeptID();

	public List<String> selectJobID();

	public int insert(EmpVO vo);

}
