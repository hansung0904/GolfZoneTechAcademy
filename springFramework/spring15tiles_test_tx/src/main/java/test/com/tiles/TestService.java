package test.com.tiles;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);

	@Autowired
	TestDAO dao;
	
	public TestService() {
		logger.info("MemberService().....");
	}
	
	public int insertOK(TestVO vo) {
		logger.info("insertOK().....");
		return dao.insertOK(vo);
	}
	
	
	public int updateOK(TestVO vo) {
		logger.info("updateOK()....");
		return dao.updateOK(vo);
	}

	
	public int deleteOK(TestVO vo) {
		logger.info("deleteOK()....");
		return dao.deleteOK(vo);
	}

	
	public TestVO selectOne(TestVO vo) {
		logger.info("selectOne()....");
		return dao.selectOne(vo);
	}

	
	public List<TestVO> selectAll() {
		logger.info("selectAll()....");
		return dao.selectAll();
	}

	
	public List<TestVO> searchList(
			String searchKey, String searchWord) {
		logger.info("searchList()....");
		return dao.searchList(searchKey, searchWord);
	}

}
