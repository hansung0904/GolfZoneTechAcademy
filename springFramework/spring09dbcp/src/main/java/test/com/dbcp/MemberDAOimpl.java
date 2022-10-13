package test.com.dbcp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOimpl implements MemberDAO{
	private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	

	@Override
	public List<MemberVO> selectAll() {
		logger.info("selectAll()...");
		List<MemberVO> vos = jdbcTemplate.query(
				MemberDB_oracle.SQL_SELECT_ALL, 
				new Object[] {}, 
				new RowMapper<MemberVO>() {

					@Override
					public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
						logger.info("mapRow()...{}",rowNum);
						MemberVO vo = new MemberVO();
						vo.setNum(rs.getInt("num"));
						vo.setId(rs.getString("id"));
						vo.setPw(rs.getString("pw"));
						vo.setName(rs.getString("name"));
						vo.setTel(rs.getString("tel"));
						return vo;
					}
				});
		
		return vos;
	}
	
	@Override
	public MemberVO selectOne(MemberVO vo) {
		
		MemberVO vo2 = jdbcTemplate.queryForObject(
				MemberDB_oracle.SQL_SELECT_ONE, 
				new Object[] {vo.getNum()}, 
				new RowMapper<MemberVO>() {
					@Override
					public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
						logger.info("mapRow()...{}",rowNum);
						MemberVO vo = new MemberVO();
						vo.setNum(rs.getInt("num"));
						vo.setId(rs.getString("id"));
						vo.setPw(rs.getString("pw"));
						vo.setName(rs.getString("name"));
						vo.setTel(rs.getString("tel"));
						return vo;
					}
				});
		
		return vo2;
	}

	@Override
	public int insertOK(MemberVO vo) {
		logger.info("insert()...");
		logger.info("{}",vo);
		
		int flag = jdbcTemplate.update(
				MemberDB_oracle.SQL_INSERT, 
				vo.getId(),vo.getPw(),vo.getName(),vo.getTel());
		
		return flag;
	}

	@Override
	public int updateOK(MemberVO vo) {
		logger.info("updateOK()...");
		logger.info("{}",vo);
		
		int flag = jdbcTemplate.update(
				MemberDB_oracle.SQL_UPDATE, 
				vo.getId(),vo.getPw(),vo.getName(),vo.getTel(),vo.getNum());
		
		return flag;
	}

	@Override
	public int deleteOK(MemberVO vo) {
		logger.info("deleteOK()...");
		logger.info("{}",vo);
		
		int flag = jdbcTemplate.update(
				MemberDB_oracle.SQL_DELETE, 
				vo.getNum());
		
		return flag;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		logger.info("searchList()...");
		logger.info("searchKey:{}",searchKey);
		logger.info("searchWord:{}",searchWord);
		String sql = null;
		if(searchKey.equals("name")) {
			sql = MemberDB_oracle.SQL_SEARCH_LIST_NAME;
		}else if(searchKey.equals("tel")) {
			sql = MemberDB_oracle.SQL_SEARCH_LIST_TEL;
		}
		List<MemberVO> vos = jdbcTemplate.query(
				sql, 
				new Object[] {"%"+searchWord+"%"}, 
				new RowMapper<MemberVO>() {

					@Override
					public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
						logger.info("mapRow()...{}",rowNum);
						MemberVO vo = new MemberVO();
						vo.setNum(rs.getInt("num"));
						vo.setId(rs.getString("id"));
						vo.setPw(rs.getString("pw"));
						vo.setName(rs.getString("name"));
						vo.setTel(rs.getString("tel"));
						return vo;
					}
				});
		
		return vos;
	}

}
