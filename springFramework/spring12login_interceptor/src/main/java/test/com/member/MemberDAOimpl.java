package test.com.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);

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
	public List<MemberVO> selectAll() {
		logger.info("selectAll()...");
		List<MemberVO> vos = sqlSession.selectList("SQL_SELECT_ALL");

		return vos;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {

		MemberVO vo2 = sqlSession.selectOne("SQL_SELECT_ONE", vo);

		return vo2;
	}

	@Override
	public int insertOK(MemberVO vo) {
		logger.info("insert()...");
		logger.info("{}", vo);

		int flag = sqlSession.insert("SQL_INSERT", vo);

		return flag;
	}

	@Override
	public int updateOK(MemberVO vo) {
		logger.info("updateOK()...");
		logger.info("{}", vo);

		int flag = sqlSession.update("SQL_UPDATE", vo);

		return flag;
	}

	@Override
	public int deleteOK(MemberVO vo) {
		logger.info("deleteOK()...");
		logger.info("{}", vo);

		int flag = sqlSession.delete("SQL_DELETE", vo);

		return flag;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		logger.info("searchList()...");
		logger.info("searchKey:{}", searchKey);
		logger.info("searchWord:{}", searchWord);

//		Map<String, String> map = new HashMap<String, String>();
//		map.put("searchWord", "%"+searchWord+"%");
//		List<MemberVO> vos = null;
//		if(searchKey.equals("name")) {
//			vos = sqlSession.selectList("SQL_SEARCH_LIST_NAME",map);
//		}else if(searchKey.equals("tel")) {
//			vos = sqlSession.selectList("SQL_SEARCH_LIST_TEL",map);
//		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("searchKey", searchKey);
		map.put("searchWord", "%" + searchWord + "%");
		List<MemberVO> vos = sqlSession.selectList("SQL_SEARCH_LIST", map);

		return vos;
	}

	@Override
	public MemberVO loginOK(MemberVO vo) {
		logger.info("loginOK....");
		logger.info("{}",vo);
		MemberVO vo2 = sqlSession.selectOne("SQL_SELECT_LOGIN", vo);

		return vo2;
	}

}
