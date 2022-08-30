package com.golfzonacademy.board.model;

import java.util.List;

public class BoardMain {
	public static void main(String[] args) {
		System.out.println("Hello Board");

		BoardDAO dao = new BoardDAOimpl();
		BoardVO vo = new BoardVO();
		vo.setContent("bb330");
		vo.setTitle("bb33300");
		vo.setWriter("bbb330");
//		
		int result =0;
		result = dao.insert(vo);
		System.out.println("result: " + result);
		
//		vo = new BoardVO();
//		vo.setContent("cc330");
//		vo.setTitle("cc33300");
//		vo.setWriter("ccc330");
//		vo.setNum(2);
//		result = dao.update(vo);
//		System.out.println("result:" + result);
		
//		vo = new BoardVO();
//		vo.setTitle("cc33300");
//		vo.setContent("cc330");
//		vo.setWriter("ccc330");
//		vo.setNum(2);
//		result = dao.delete(vo);
//		System.out.println("result: " + result);
		
		System.out.println("=======================================================");

		List<BoardVO> vos = dao.selectAll();
		for (BoardVO x : vos) {
			System.out.println(x);
		}
		System.out.println("=======================================================");
		
		BoardVO vo2 = dao.selectOne(vo);
		vo2.setNum(3);
		System.out.println(vo2);
		
		System.out.println("=======================================================");
		
		List<BoardVO> vos2 = dao.searchList("cc33", "cc33");

		for (BoardVO x : vos2) {
			System.out.println(x);
		}

	} // end main
} // end class
