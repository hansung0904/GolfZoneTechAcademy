package test.com.employee.model;

import java.util.List;

public interface EmployeeDAO {

	public int insert(EmployeeVO vo);

	public int update(EmployeeVO vo);

	public int delete(EmployeeVO vo);

	List<EmployeeVO> selectAll();

	public EmployeeVO selectOne(EmployeeVO vo);

	public List<EmployeeVO> searchList(String searchKey, String searchWord);

}
