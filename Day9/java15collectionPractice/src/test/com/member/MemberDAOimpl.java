package test.com.member;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	public MemberDAOimpl() {
		System.out.println("MemberDAOimpl()...");
	}

	@Override
	public int insert(MemberVO vo) {
//		System.out.println("insert()...");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
//		System.out.println("update()...");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
//		System.out.println("delete()...");
		System.out.println(vo);
		return 0;
	}

	@Override
	public List<MemberVO> selectAll() {
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 3; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(44 + i);
			vo.setId("admin44" + i);
			vo.setPw("hi12344" + i);
			vo.setName("Kim44" + i);
			vo.setTel("44" + i);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
//		System.out.println("selectOne()...");
		System.out.println();

		MemberVO vo2 = new MemberVO();
		vo2.setNum(77);
		vo2.setId("admin77");
		vo2.setPw("hi12377");
		vo2.setName("Kim77");
		vo2.setTel("77");

		return vo2;
	}

	@Override
	public List<MemberVO> searchList(String searchKey, String searchWord) {
//		System.out.println("searchList()...");
		System.out.println(searchKey);
		System.out.println(searchWord);

		List<MemberVO> vos = new ArrayList<MemberVO>();
		for (int i = 0; i < 4; i++) {
			MemberVO vo = new MemberVO();
			vo.setNum(55 + i);
			vo.setId("admin55" + i);
			vo.setPw("hi123555" + i);
			vo.setName("kim55" + i);
			vo.setTel("010" + i);
			vos.add(vo);
		}
		return vos;
	}

}
