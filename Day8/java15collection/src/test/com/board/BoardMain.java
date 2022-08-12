package test.com.board;

import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		System.out.println("Hello Board");
		
		// BoardVO - num,title,content,writer,wdate(��¥)
		// BoardDAO - interface(�Է�,����,����,�ð˻�,�ϳ��˻�,�˻���˻�
		// BoardDAOimpl - BoardDAO�� ��ӹ޾� �����ϼ���..
		// BoardMain - ��ü����,�Լ�ȣ��,���...
		
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
