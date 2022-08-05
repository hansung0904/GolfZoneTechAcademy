package test.com.board;

import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		System.out.println("Hello Board");
		
		// BoardVO - num,title,content,writer,wdate(날짜)
		// BoardDAO - interface(입력,수정,삭제,올검색,하나검색,검색어검색
		// BoardDAOimpl - BoardDAO를 상속받아 구현하세요..
		// BoardMain - 객체생성,함수호출,출력...
		
		BoardDAO dao = new BoardDAOimpl();
		BoardVO vo = new BoardVO();
		
		int result = dao.insert(vo);
		System.out.println("result: " + result);

		result = dao.update(vo);
		System.out.println("result:" + result); 
		
		result = dao.delete(vo);
		System.out.println("result: " + result); 
		
		List<BoardVO> vos = dao.selectAll();
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		vo.setNum(77);
		BoardVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);

		List<BoardVO> vos2 = dao.searchList("1", "chs");

		for (BoardVO x : vos2) {
			System.out.println(x);
		}
		
		
		
	} // end main
} // end class
