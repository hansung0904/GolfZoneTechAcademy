package test.com;

import java.util.ArrayList;
import java.util.List;

public class Test01main_list {
	public static void main(String[] args) {
		System.out.println("Hello Collection...");
		System.out.println("=====================================================");
		String[] strs = new String[] {"aaa","bbb"};
		
		//** 중복데이터 허용, 순서있음, null허용
		// set(수정), remove, add, get(검색) 가능
		List<Integer> list = new ArrayList<>(); // 우측에는 generic안에 생략가능 reference 타입 만 올 수 있음
		list.add(1000); // Integer
		list.add(1000); // Integer
//		list.add("kim"); // String
//		list.add("kim"); // String
//		list.add(3.14); // Double
		list.add(null); // null
		list.add(11); // null
		list.add(22); // null
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=====================================================");
		
		list.remove(0);
		list.set(1, 999);
		
		for (Integer x : list) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		System.out.println("=====================================================");
		
		List<MemberVO> vos = new ArrayList<MemberVO>(); // 주소가 다름 new 남발
		vos.add(new MemberVO());
		vos.add(new MemberVO());
		vos.add(new MemberVO(11,"admin","he1234","kim","010"));
		vos.add(new MemberVO(11,"admin","he1234","kim","010"));
		
		MemberVO vo = new MemberVO(); // data는 같지만 주소는 하나 
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		System.out.println(vos.size());
		
		
		
		
		
	} // end main

} // end class
