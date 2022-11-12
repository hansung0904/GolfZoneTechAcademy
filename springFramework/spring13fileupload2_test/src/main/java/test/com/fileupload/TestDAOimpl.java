package test.com.fileupload;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAOimpl implements TestDAO {
	private static final Logger logger = LoggerFactory.getLogger(TestDAOimpl.class);

	@Autowired
	SqlSession sqlSession;

	/**
	 * log4j.xml 디버그 로그설정으로 마이바티스 쿼리문 로그확인가능. <logger name="java.sql.*">
	 * <level value="debug" /> </logger>
	 * 
	 * <!-- Root Logger --> <root> <priority value="debug" />
	 * <appender-ref ref="console" /> </root>
	 * 
	 */

	@Override
	public List<TestVO> selectAll() {
		logger.info("selectAll()...");
		List<TestVO> vos = sqlSession.selectList("SQL_SELECT_ALL");

		return vos;
	}

	@Override
	public TestVO selectOne(TestVO vo) {

		TestVO vo2 = sqlSession.selectOne("SQL_SELECT_ONE", vo);

		return vo2;
	}

	@Override
	public int insertOK(TestVO vo) {
		logger.info("insert()...");
		logger.info("{}", vo);

		int flag = sqlSession.insert("SQL_INSERT", vo);

		return flag;
	}

	@Override
	public int updateOK(TestVO vo) {
		logger.info("updateOK()...");
		logger.info("{}", vo);

		int flag = sqlSession.update("SQL_UPDATE", vo);

		return flag;
	}

	@Override
	public int deleteOK(TestVO vo) {
		logger.info("deleteOK()...");
		logger.info("{}", vo);

		int flag = sqlSession.delete("SQL_DELETE", vo);

		return flag;
	}

	@Override
	public List<TestVO> searchList(String searchKey, String searchWord) {
		logger.info("searchList()...");
		logger.info("searchKey:{}", searchKey);
		logger.info("searchWord:{}", searchWord);

		Map<String, String> map = new HashMap<String, String>();
		map.put("searchKey", searchKey);
		map.put("searchWord", searchKey.equals("name") ? "%" + searchWord + "%" : searchWord);
		List<TestVO> vos = sqlSession.selectList("SQL_SEARCH_LIST", map);

		return vos;
	}

}
