package test.com.aop01;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);

	@Override
	public List<TestVO> selectAll() {
		logger.info("selectAll()...");
		List<TestVO> vos = null;

		return vos;
	}

	@Override
	public TestVO selectOne(TestVO vo) {

		TestVO vo2 = null;

		return vo2;
	}

	@Override
	public int insertOK(TestVO vo) {
		logger.info("insert()...");
		logger.info("{}", vo);

		int flag = 0;

		return flag;
	}

	@Override
	public int updateOK(TestVO vo) {
		logger.info("updateOK()...");
		logger.info("{}", vo);

		int flag = 0;

		return flag;
	}

	@Override
	public int deleteOK(TestVO vo) {
		logger.info("deleteOK()...");
		logger.info("{}", vo);

		int flag = 0;

		return flag;
	}

	@Override
	public List<TestVO> searchList(String searchKey, String searchWord) {
		logger.info("searchList()...");
		logger.info("searchKey:{}", searchKey);
		logger.info("searchWord:{}", searchWord);

		List<TestVO> vos = null;

		return vos;
	}

}
