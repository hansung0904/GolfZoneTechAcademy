package test.com;

public class MemberMain {

	public static void main(String[] args) {
		System.out.println("Hello Member");
		
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPw("hi12345");
		vo.setName("Kim");
		vo.setTel("02");
		
		MemberProcess mp = new MemberProcess();
		int result = mp.insert(vo);
		System.out.println("result: " + result);
		
		
		result = mp.update(vo);
		System.out.println("result:" + result); // 1이 나오는지
		
		vo.setNum(88);
		vo.setId("admin99");
		result = mp.delete(vo);
		System.out.println("result: " + result); // 1
//		
		MemberVO[] vos = mp.selectAll();
		for (MemberVO x : vos) {
			System.out.println(x);
		}
//		
		vo.setNum(77);
		MemberVO vo2 = mp.selectOne(vo);
		// selectOne(MemberVO):MemberVO
		System.out.println(vo2);
		
//		MemberVO[] vos2 = mp.searchList("name","ki");
		MemberVO[] vos2	= mp.searchList("tel","010");
		
		for (MemberVO x : vos2) {
			System.out.println(x);
		}
		
	} // end main
	
	

} // end class
