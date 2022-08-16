package test.kosta;

public abstract class ScoreDAO {
	
	public ScoreDAO() {
 		super();
		System.out.println("ScoreDAOex()...");
	
	}
	public abstract int insert(ScoreVO vo);
	public abstract int update(ScoreVO vo);
	public abstract int delete(ScoreVO vo);
	public abstract ScoreVO selectOne(ScoreVO vo);
	public abstract ScoreVO[] selectAll();
	public abstract ScoreVO[] searchList(String searchKey, String searchWorld);

}
