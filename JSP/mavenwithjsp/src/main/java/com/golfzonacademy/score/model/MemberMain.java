package com.golfzonacademy.score.model;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello jdbc...");

		MemberDAO dao = new MemberDAOimpl();
		MemberVO vo = new MemberVO();
		vo.setId("cc330");
		vo.setPw("cc33300");
		vo.setName("ccc330");
		vo.setTel("cc330");

//		int result = dao.insert(vo);
//		System.out.println("result: " + result);
		// ����˻�(���, �Ѱ� , �˻���) : DQL -> Data Query Language
//		vo = new MemberVO();
//		vo.setId("cc330");
//		vo.setPw("cc33300");
//		vo.setName("ccc330");
//		vo.setTel("cc330");
//		vo.setNum(2);
//		int result = dao.update(vo);
//		System.out.println("result: " + result);
		vo = new MemberVO();
		vo.setNum(3);
		int result = dao.delete(vo);
		System.out.println("result : " + result);

		List<MemberVO> vos = dao.selectAll();
		// for~
		for (MemberVO x : vos) {
			System.out.print(x.getNum() + " ");
			System.out.print(x.getId() + " ");
			System.out.print(x.getPw() + " ");
			System.out.print(x.getName() + " ");
			System.out.println(x.getTel());
		}
		
		System.out.println("=====================================");
		vo = new MemberVO();
		vo.setNum(2);
		MemberVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);
		System.out.println("=====================================");
		
		List<MemberVO> vos2 = dao.searchList("name", "kang");
//		List<MemberVO> vos2 = dao.searchList("tel", "20");
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
	} // end main

} // end class
