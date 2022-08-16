package test.com;

public class Test02throws2 {
	public static void main(String[] args) {
		System.out.println("Hello throws");
		// throws 처리 : 예외 전가
		// try~catch : 예외 처리
		
		try {
			test();
			System.out.println("Good Found...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end main...");
	} // end main

	private static void test() throws ClassNotFoundException {
		Class.forName("java.lang.String");
		
	}

} // end class
