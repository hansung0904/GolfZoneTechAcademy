package test.com.component;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO {

	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);

	public MemberDAOimpl() {
		logger.info("MemberDAOimpl()....");
	}

	@Override
	public int insertOK(MemberVO vo) {
		logger.info("insertOK()....");
		logger.info("{}", vo);

		return 1;
	}

	@Override
	public int updateOK(MemberVO vo) {
		logger.info("updateOK()....");
		logger.info("{}", vo);

		return 1;
	}

	@Override
	public int deleteOK(MemberVO vo) {
		logger.info("deleteOK()....");
		logger.info("{}", vo);

		return 1;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		logger.info("selectOne()....");
		logger.info("{}", vo);

		return new MemberVO(11, "admin11", "pw1111", "kim11", "011");
	}

	@Override
	public List<MemberVO> selectAll() {
		logger.info("selectAll()....");

		List<MemberVO> vos = new ArrayList<MemberVO>();
		vos.add(new MemberVO(11, "admin11", "pw1111", "kim11", "011"));
		vos.add(new MemberVO(12, "admin11", "pw1111", "kim11", "011"));
		vos.add(new MemberVO(13, "admin11", "pw1111", "kim11", "011"));
		vos.add(new MemberVO(14, "admin11", "pw1111", "kim11", "011"));
		vos.add(new MemberVO(15, "admin11", "pw1111", "kim11", "011"));

		return vos;
	}

	@Override
	public List<MemberVO> searchList(
			String searchKey, String searchWord) {
		logger.info("searchList()....");
		logger.info("searchKey:{}",searchKey);
		logger.info("searchWord:{}",searchWord);

		List<MemberVO> vos = new ArrayList<MemberVO>();
		vos.add(new MemberVO(11, "admin11", "pw1111", "kim11", "011"));
		vos.add(new MemberVO(12, "admin11", "pw1111", "kim11", "011"));
		vos.add(new MemberVO(13, "admin11", "pw1111", "kim11", "011"));

		return vos;
	}

}
