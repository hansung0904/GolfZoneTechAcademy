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
		
		result = mp.delete(vo);
		System.out.println("result: " + result); // 1
		
		MemberVO[] vos = mp.selectAll();
		System.out.println(mp.selectAll());
		
		MemberVO vo2 = mp.selectOne(vo);
		System.out.println(vo2);
		
		
	} // end main
	
	

} // end class
