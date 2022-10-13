package test.com.dbcp;

import java.util.List;

public interface MemberDAO {

	public int insertOK(MemberVO vo);

	public int updateOK(MemberVO vo);

	public int deleteOK(MemberVO vo);

	public MemberVO selectOne(MemberVO vo);

	public List<MemberVO> selectAll();

	public List<MemberVO> searchList(String searchKey,String searchWord);

}
