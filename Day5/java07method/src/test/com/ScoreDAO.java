package test.com;

public class ScoreDAO {

	// 立辟力茄 :+(public), insert(ScoreVO) : int
	// 立辟力茄 :+(update), insert(ScoreVO) : int
	// 立辟力茄 :+(delete), insert(ScoreVO) : int
	// 立辟力茄 :+(selectOne(ScoreVO))
	// 立辟力茄 :+(selectAll()), ScoreVO[]
	// 立辟力茄 :+searchList(String,String) : ScoreVO[]

	public ScoreDAO() {
		System.out.println("ScoreDAO()...");
	}

	public int insert(ScoreVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		return 1;
	}

	public int update(ScoreVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	public int delete(ScoreVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	public ScoreVO[] selectAll() {
		System.out.println("selectAll()...");
		ScoreVO[] vos = new ScoreVO[3];

		for (int i = 0; i < vos.length; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(44 + i);
			vo.setEng(33 + i);
			vo.setKor(44 + i);
			vo.setMath(55 + i);
			vo.setName("Kim44" + i);
			vos[i] = vo;
		}

		return vos;
	}

	public ScoreVO[] serchList(String searchKey, String searchWord) {
		System.out.println("searchOne()...");
		System.out.println(searchKey);
		System.out.println(searchWord);
		ScoreVO[] vos = new ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(10 + i);
			vo.setEng(8 + i);
			vo.setKor(8 + i);
			vo.setMath(8 + i);
			vo.setName("Kim44" + i);
			vos[i] = vo;
		}

		return vos;
	}

	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);
		
		ScoreVO vo2 = new ScoreVO();
		vo2.setNum(77);
		return vo2;
	}
	
	

}