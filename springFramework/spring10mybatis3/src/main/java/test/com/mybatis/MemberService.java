package test.com.mybatis;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.mapper.TestMapper;

@Service
public class MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);
	// 즉, DAO,DAOimpl 이 없어도 동작한다.
	// 대신에 서비스에서 TestMapper를 DI해서 사용하게되는것이다.
	@Autowired
	private TestMapper mapper;

	public MemberService() {
		logger.info("MemberService().....");
	}

	public int insertOK(MemberVO vo) {
		logger.info("insertOK().....");
		return mapper.insertOK(vo);
	}

	public int updateOK(MemberVO vo) {
		logger.info("updateOK()....");
		return mapper.updateOK(vo);
	}

	public int deleteOK(MemberVO vo) {
		logger.info("deleteOK()....");
		return mapper.deleteOK(vo);
	}

	public MemberVO selectOne(MemberVO vo) {
		logger.info("selectOne()....");
		return mapper.selectOne(vo);
	}

	public List<MemberVO> selectAll() {
		logger.info("selectAll()....");
		return mapper.selectAll();
	}

	public List<MemberVO> searchList(Map<String, String> map) {
		logger.info("searchList()....");

		return mapper.searchList(map);
	}

}
