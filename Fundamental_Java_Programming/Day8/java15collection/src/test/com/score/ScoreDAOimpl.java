package test.com.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreDAOimpl implements ScoreDAO {
	public ScoreDAOimpl() {
		System.out.println("ScoreDAOimpl()...");
	}

	@Override
	public int insert(ScoreVO vo) {
		System.out.println("insert()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int update(ScoreVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(ScoreVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public ScoreVO selectOne(ScoreVO vo) {
		System.out.println("selectOne()...");
		System.out.println(vo);

		ScoreVO vo2 = new ScoreVO();
		vo2.setNum(77);
		return vo2;
	}

	@Override
	public List<ScoreVO> selectAll() {
		System.out.println("selectAll()...");
		List<ScoreVO> vos = new ArrayList<ScoreVO>();

		for (int i = 0; i < 5; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(44 + i);
			vo.setEng(33 + i);
			vo.setKor(44 + i);
			vo.setMath(55 + i);
			vo.setName("Kim44" + i);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<ScoreVO> searchList(String searchKey, String searchWord) {
		System.out.println("searchOne()...");
		System.out.println(searchKey);
		System.out.println(searchWord);
		List<ScoreVO> vos = new ArrayList<ScoreVO>();
		for (int i = 0; i < 4; i++) {
			ScoreVO vo = new ScoreVO();
			vo.setNum(10 + i);
			vo.setEng(8 + i);
			vo.setKor(8 + i);
			vo.setMath(8 + i);
			vo.setName("Kim44" + i);
			vos.add(vo);
		}
		return vos;
	}
}
