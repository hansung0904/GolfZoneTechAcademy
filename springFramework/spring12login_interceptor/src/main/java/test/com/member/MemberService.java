package test.com.member;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

	@Autowired
	MemberDAO dao;
	
	public MemberService() {
		logger.info("MemberService().....");
	}
	
	public int insertOK(MemberVO vo) {
		logger.info("insertOK().....");
		return dao.insertOK(vo);
	}
	
	
	public int updateOK(MemberVO vo) {
		logger.info("updateOK()....");
		return dao.updateOK(vo);
	}

	
	public int deleteOK(MemberVO vo) {
		logger.info("deleteOK()....");
		return dao.deleteOK(vo);
	}

	
	public MemberVO selectOne(MemberVO vo) {
		logger.info("selectOne()....");
		return dao.selectOne(vo);
	}

	
	public List<MemberVO> selectAll() {
		logger.info("selectAll()....");
		return dao.selectAll();
	}

	
	public List<MemberVO> searchList(
			String searchKey, String searchWord) {
		logger.info("searchList()....");
		return dao.searchList(searchKey, searchWord);
	}

	public MemberVO loginOK(MemberVO vo) {
		logger.info("loginOK()....");
		return dao.loginOK(vo);
	}

}
