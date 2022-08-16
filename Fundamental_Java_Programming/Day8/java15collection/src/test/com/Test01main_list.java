package test.com;

import java.util.ArrayList;
import java.util.List;

public class Test01main_list {
	public static void main(String[] args) {
		System.out.println("Hello Collection...");
		System.out.println("=====================================================");
		String[] strs = new String[] {"aaa","bbb"};
		
		//** �ߺ������� ���, ��������, null���
		// set(����), remove, add, get(�˻�) ����
		List<Integer> list = new ArrayList<>(); // �������� generic�ȿ� �������� reference Ÿ�� �� �� �� ����
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
		
		List<MemberVO> vos = new ArrayList<MemberVO>(); // �ּҰ� �ٸ� new ����
		vos.add(new MemberVO());
		vos.add(new MemberVO());
		vos.add(new MemberVO(11,"admin","he1234","kim","010"));
		vos.add(new MemberVO(11,"admin","he1234","kim","010"));
		
		MemberVO vo = new MemberVO(); // data�� ������ �ּҴ� �ϳ� 
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		System.out.println(vos.size());
		
		
		
		
		
	} // end main

} // end class
