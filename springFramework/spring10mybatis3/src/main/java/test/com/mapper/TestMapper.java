package test.com.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import test.com.mybatis.MemberVO;

@Mapper
public interface TestMapper {

	//sqlMapper_member.xml 문서에서의 (id="insertOK")와 insertOK()메소드 명이 같아짐으로 인해서
	//@Repository 컴포넌트가 필요없어지게된다.
	//즉, DAO,DAOimpl 이 없어도 동작한다.
	
	
	public int insertOK(MemberVO vo);

	public int updateOK(MemberVO vo);

	public int deleteOK(MemberVO vo);

	public MemberVO selectOne(MemberVO vo);

	public List<MemberVO> selectAll();

	public List<MemberVO> searchList(Map<String, String> map);

}
