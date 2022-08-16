package test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import test.com.member.MemberVO;

public class Test01main_list {
	public static void main(String[] args) {
		System.out.println("Hello Collection...");
		System.out.println("=====================================================");
		String[] strs = new String[] { "aaa", "bbb" };

		// ** �ߺ������� ���, ��������, null���
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
		list.add(0, 9999); // insert ���� ����..
		Object[] objs = list.toArray(); // �Ҵ��ϸ� �� �� �ִ�.
//		System.out.println(list.get(0));d
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("=====================================================");

		list.remove(0);
		list.set(1, 999);

		for (Integer x : list) {
			System.out.print(x + " ");
		}

		System.out.println();

		System.out.println("=====================================================");

		List<MemberVO> vos = new ArrayList<MemberVO>(); // �ּҰ� �ٸ� new ����
		vos.add(new MemberVO());
		vos.add(new MemberVO());
		vos.add(new MemberVO(11, "admin", "he1234", "kim", "010"));
		vos.add(new MemberVO(11, "admin", "he1234", "kim", "010"));

		MemberVO vo = new MemberVO(); // data�� ������ �ּҴ� �ϳ�
		vo.setNum(1);
		vo.setId("tester");
		vo.setPw("hi2424");
		vo.setName("lee");
		vo.setTel("02");
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);

		System.out.println(vos.size());

		System.out.println("=====================================================");

		for (int i = 0; i < vos.size(); i++) {
			MemberVO x = vos.get(i);
			System.out.print(x.getNum() + " ");
			System.out.print(x.getId() + " ");
			System.out.print(x.getPw() + " ");
			System.out.print(x.getName() + " ");
			System.out.println(x.getTel() + " ");
		}

		System.out.println("=====================================================");
		vos.clear(); // �� �� ������~
		for (MemberVO x : vos) {
			System.out.print(x.getNum() + " ");
			System.out.print(x.getId() + " ");
			System.out.print(x.getPw() + " ");
			System.out.print(x.getName() + " ");
			System.out.println(x.getTel() + " ");
		}
		System.out.println("=====================================================");
		
//		for (Iterator iterator = vos.iterator(); iterator.hasNext();) { // �̰� �ϴ� �����Ѱ� for each �����̴�. java5������ �̷��� �����
//			MemberVO memberVO = (MemberVO) iterator.next();
//			
//		}
//		
//		while (vos.iterator().hasNext()) { // while�� �����ڸ�~ for each for ���� �ֱ⶧���� ���� ������� �ʴ´�. 
//			MemberVO x = (MemberVO) vos.iterator().next();
//			
//		}
		
		System.out.println("=====================================================");
		
		
		
	} // end main

} // end class
