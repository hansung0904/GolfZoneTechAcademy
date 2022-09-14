package test.com.model;

import java.util.List;

public interface DeptDAO {
	
	public List<DeptVO> selectAll();

	public List<Integer> selectEmpID();

	public List<Integer> selectLocID();

	public int insert(DeptVO vo);

}
