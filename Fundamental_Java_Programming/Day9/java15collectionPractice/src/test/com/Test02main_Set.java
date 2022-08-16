package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import test.com.member.MemberVO;

public class Test02main_Set {

	public static void main(String[] args) {
		System.out.println("Hello Set...");

		// �������� �ߺ��� ������� ����.
		// �����Ͱ� �߰��Ǵ� ������ ����. �ε���������. set�� �ϻ��Ȱ�� ������ ���.
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
		System.out.println(s.contains("lee2")); // lee2�� �ִ��� ã�� boolean���� ��ȯ
		System.out.println(s.toArray()); // Object array ��ȯ
		Object[] strs = s.toArray(); // class cast exception �߻� s.toArray()�� ������
		System.out.println("=========================");
		for (Object x : strs) {
			System.out.println(x); // println�� object�� ����ϴ� ��� �����ϰ��־ Object Ÿ������ ���ָ� �ȴ�.
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
		for (MemberVO x : vos) {
			System.out.println(x); // �����Ͱ� ������ �����ɷ� �� �ּҰ� �ٸ��� �ٸ��ɷ� �� 
		}
		
	} // end main

} // end class
