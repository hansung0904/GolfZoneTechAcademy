package test.com.score.model;

import java.util.List;

public interface ScoreDAO {
	public int insert(ScoreVO vo);

	public int update(ScoreVO vo);

	public int delete(ScoreVO vo);

	public ScoreVO selectOne(ScoreVO vo);

//	public ScoreVO[] selectAll();
	
	public List<ScoreVO> selectAll();

//	public ScoreVO[] searchList(String searchKey, String searchWorld);
	

	List<ScoreVO> searchList(String searchKey, String searchWord);

}
