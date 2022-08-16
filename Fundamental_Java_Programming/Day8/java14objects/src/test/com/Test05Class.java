package test.com;

public class Test05Class {
	public static void main(String[] args) {
		System.out.println("Hello Class...");

		try {
			Class<?> clazz = Class.forName("test.com.MemberVO");
			System.out.println("Class Found...");
			System.out.println(clazz.getName());
			System.out.println(clazz.getConstructors()[1]);
			System.out.println(clazz.getConstructors()[0]);
			System.out.println(clazz.getMethods()[0]);
			System.out.println(clazz.getMethods()[1]);
			System.out.println(clazz.getMethods()[2]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("=======================================");
		
		Class<?> clazz2 = MemberVO.class; // android에서 paging 할때 많이 쓰임. MemberVO안에 static으로 정의되어져있는 class를 사용
		System.out.println(clazz2.getName());
		
		System.out.println("=======================================");
		MemberVO vo = new MemberVO(); 
		Class<?> clazz3 = vo.getClass(); // 이미 객체가 생성되어있어서 변수이름에다가 사용하는 방식.
		System.out.println(clazz3.getName());
		
		
		
	} // end main

} // end class
