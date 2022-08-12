package test.com.board;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoardDAOimpl implements BoardDAO {
	public BoardDAOimpl() {
		System.out.println("Hello BoardDAOimpl()...");
	}

	@Override
	public int insert(BoardVO vo) {
		System.out.println("Hello insert...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("Hello update...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("Hello delete...");
		System.out.println(vo);
		return 1;
	}

	@Override
	public List<BoardVO> selectAll() {
		List<BoardVO> vos = new ArrayList<BoardVO>();
		for (int i = 0; i < 5; i++) {
			BoardVO vo = new BoardVO();
			Date ud = new Date();
			vo.setNum(1 + i);
			vo.setWriter("Chs");
			vo.setTitle("Board과제입니다.");
			vo.setContent("안녕하세요");
			vo.setWdate(ud);
			vos.add(vo);

		}
		return vos;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		BoardVO vo2 = new BoardVO();
		Date ud2 = new Date();
		vo.setNum(55);
		return vo2;
	}

	@Override
	public List<BoardVO> searchList(String searchKey, String searchWord) {
		System.out.println(searchKey);
		System.out.println(searchWord);
		List<BoardVO> vos = new ArrayList<BoardVO>();
		for (int i = 0; i < 5; i++) {
			BoardVO vo = new BoardVO();
			Date ud = new Date();
			vo.setNum(1 + i);
			vo.setWriter("Chs");
			vo.setTitle("Board과제입니다.");
			vo.setContent("안녕하세요");
			vo.setWdate(ud);
			vos.add(vo);
		}
		return vos;

	}
}