package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		ScoreDAO dao = new ScoreDAOimpl();
		ScoreVO vo = new ScoreVO();
		
		vo.setNum(1);
		vo.setEng(33);
		vo.setKor(44);
		vo.setMath(44);
		vo.setName("chs");

		int result = dao.insert(vo);
		System.out.println("result: " + result);
//		
		vo = new ScoreVO();
		vo.setNum(3);
		result = dao.update(vo);
		System.out.println("result: " + result);

		vo = new ScoreVO();
		vo.setKor(33);
		result = dao.delete(vo);
		System.out.println("result: " + result);
		
		// 4. selectOne
		vo = new ScoreVO();
		vo.setNum(1);
		ScoreVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		
		// 5. selectAll
		ScoreVO[] vos = dao.selectAll();
		for (ScoreVO x : vos) {
			System.out.println(x);
		}
		
		ScoreVO[] vos2 = dao.searchList("kor", "le");
		for (ScoreVO x : vos2) {
			System.out.println(x);
		}
		
	}

}
