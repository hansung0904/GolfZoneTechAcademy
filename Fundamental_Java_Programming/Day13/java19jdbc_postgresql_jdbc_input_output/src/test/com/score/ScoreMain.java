package test.com.score;

import java.util.List;

import test.com.score.model.ScoreDAO;
import test.com.score.model.ScoreDAOimpl;
import test.com.score.model.ScoreVO;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreDAO dao = new ScoreDAOimpl();
		ScoreVO vo = new ScoreVO();

		vo.setName("chs1");
		vo.setEng(77);
		vo.setKor(77);
		vo.setMath(44);
		int result = dao.insert(vo);
		System.out.println("result: " + result);

		vo.setNum(8);
		vo.setEng(33);
		result = dao.update(vo);
		System.out.println("result: " + result);

		vo = new ScoreVO();
		vo.setNum(32);
		result = dao.delete(vo);
		System.out.println("result: " + result);

		// 4. selectOne
		ScoreVO vo2 = new ScoreVO();
		vo.setNum(7);
		vo2 = dao.selectOne(vo);
		System.out.println(vo2);

		System.out.println("=================================================================");

		// 5. selectAll
		List<ScoreVO> vos = dao.selectAll();
		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		System.out.println("=================================================================");
		// 6. searchList
		List<ScoreVO> vos2 = dao.searchList("name", "chs");
		for (ScoreVO x : vos2) {
			System.out.println(x);
		}
	}

}
