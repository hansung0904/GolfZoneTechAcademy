package test.com.member;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello jdbc...");

		// table 생성,삭제,내용제거,수정 : DDL -> Data Definition Language
		MemberDAO dao = new MemberDAOimpl();
		// 내용수정, 삭제,입력 : DML -> Data Manipulation Language
		MemberVO vo = new MemberVO();
		vo.setId("cc330");
		vo.setPw("cc33300");
		vo.setName("ccc330");
		vo.setTel("cc330");

//		int result = dao.insert(vo);
//		System.out.println("result: " + result);
		// 내용검색(모두, 한개 , 검색어) : DQL -> Data Query Language
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
