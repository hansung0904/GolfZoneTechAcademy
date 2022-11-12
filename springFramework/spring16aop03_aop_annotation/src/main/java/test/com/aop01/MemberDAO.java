package test.com.aop01;

import java.util.List;

public interface MemberDAO {

	public int insertOK(TestVO vo);

	public int updateOK(TestVO vo);

	public int deleteOK(TestVO vo);

	public TestVO selectOne(TestVO vo);

	public List<TestVO> selectAll();

	public List<TestVO> searchList(String searchKey,String searchWord);

}
