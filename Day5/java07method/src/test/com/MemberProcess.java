package test.com;

public class MemberProcess {

	public int insert(MemberVO vo) {
		System.out.println("intsert()...");
		System.out.println(vo);
		return 0;
	}
	
	public int update(MemberVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	
	public int delete(MemberVO vo) {
		System.out.println("delete()...");
		System.out.println(vo);
		return 1;
	}

	public MemberVO[] selectAll() {
		System.out.println("selectAll()...");
		return selectAll();
	}

	public MemberVO selectOne(MemberVO vo) {
		System.out.println("MemberVo()...");
		return selectOne(vo);
	}
}
