package test.com;

public class MemberMain {
	public static void main(String[] args) {
		System.out.println("Hello abstract...");

		MemberDAO dao = new MemberDAOimpl();
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPw("hi12345");
		vo.setName("Kim");
		vo.setTel("02");

		int result = dao.insert(vo);
		System.out.println("result: " + result);

		result = dao.update(vo);
		System.out.println("result:" + result); // 1이 나오는지

		vo.setNum(88);
		vo.setId("admin99");
		result = dao.delete(vo);
		System.out.println("result: " + result); // 1
		
		MemberVO[] vos = dao.selectAll();
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		vo.setNum(77);
		MemberVO vo2 = dao.selectOne(vo);
		System.out.println(vo2);

		MemberVO[] vos2 = dao.searchList("tel", "010");

		for (MemberVO x : vos2) {
			System.out.println(x);
		}

	} // end main()

} // end class
