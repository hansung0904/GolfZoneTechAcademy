package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import test.com.member.MemberVO;

public class Test02main_Set {

	public static void main(String[] args) {
		System.out.println("Hello Set...");

		// 데이터의 중복을 허용하지 않음.
		// 데이터가 추가되는 순서가 없다. 인덱스가없다. set은 일상생활의 덮어쓰기와 비슷.
		Set<String> s = new HashSet<String>();
		s.add("kim");
		s.add("kim");
		s.add("kim2");
		s.add("kim2");
		s.add(null);
		s.add(null);
		System.out.println(s.size());
		for (String x : s) {
			System.out.println(x);
		}
		System.out.println("=========================");
		s.remove("kim2");
		s.clear();
		for (String x : s) {
			System.out.println(x);
		}
		System.out.println("=========================");
		s.add("lee1");
		s.add("lee2");
		s.add("lee2");
		s.add("lee3");
		s.add("lee4");
		for (String x : s) {
			System.out.println(x);
		}
		System.out.println("=========================");
		System.out.println(s.contains("lee2")); // lee2가 있는지 찾아 boolean으로 반환
		System.out.println(s.toArray()); // Object array 반환
		Object[] strs = s.toArray(); // class cast exception 발생 s.toArray()로 했을때
		System.out.println("=========================");
		for (Object x : strs) {
			System.out.println(x); // println이 object로 출력하는 기능 내포하고있어서 Object 타입으로 해주면 된다.
		}
		System.out.println("=========================");

//		for (Iterator iterator = s.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			
//		}
//		
//		while (s.iterator().hasNext()) {
//			String string = (String) s.iterator().next();
//			
//		}
		System.out.println("=========================");

		Set<MemberVO> vos = new HashSet<MemberVO>();
		vos.add(new MemberVO());
		vos.add(new MemberVO());
		vos.add(new MemberVO(11, "admin", "he1234", "kim", "010"));
		vos.add(new MemberVO(11, "admin", "he1234", "kim", "010"));

		MemberVO vo = new MemberVO(); // data는 같지만 주소는 하나
		vo.setNum(1);
		vo.setId("tester");
		vo.setPw("hi2424");
		vo.setName("lee");
		vo.setTel("02");
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);

		System.out.println(vos.size());
		for (MemberVO x : vos) {
			System.out.println(x); // 데이터가 같으면 같은걸로 봄 주소가 다르면 다른걸로 봄 
		}
		
	} // end main

} // end class
