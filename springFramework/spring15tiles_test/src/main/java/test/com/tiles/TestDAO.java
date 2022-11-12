package test.com.tiles;

import java.util.List;

public interface TestDAO {

	public int insertOK(TestVO vo);

	public int updateOK(TestVO vo);

	public int deleteOK(TestVO vo);

	public TestVO selectOne(TestVO vo);

	public List<TestVO> selectAll();

	public List<TestVO> searchList(String searchKey,String searchWord);

}
