package test.com;

public class Test01RuntimeException {
	public static void main(String[] args) {
		System.out.println("Hello Exception");

		// 1. NullPointerException
		String data = "";
		System.out.println(data.length());
		data = test();

		if (data != null) { // 이런것도 일종의 예외처리이다. try catch 뿐만 아니라
			System.out.println(data.length());
		}

		System.out.println("==============================");

		data = test();
		try {
			System.out.println("1");
			System.out.println(data.length()); // 오류가 발생하면 continue 같이 실행안하고 catch문으로 바로 점프함. 2를 찍지않음
			System.out.println("2");
		} catch (NullPointerException e) {
			System.out.println("3");
			System.out.println("NullPointerException");
		} finally { // try 문에서 오류가나든 catch문에서 오류가 나지 않든 반드시 실행해야할 로직이있다 finally에서 실행됨
			System.out.println("4");
			data = "";
		}

		System.out.println("==============================");
//		if(data.length()>0)System.out.println(); <-- 이것도 일종의 Exception 처리 Exception Object로 처리하느는게 아니라 개발자가 직접 처리

		try {
			System.out.println(data.charAt(0));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
			data = " ";
		}

		System.out.println(data.charAt(0));
		// 2. ArrayIndexOutOfBoundsException
		int[] sus = new int[3]; // 0, 0, 0,

		try {
			System.out.println(sus[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(sus[sus.length - 1]);
		}

		// 3. NumberFormatException
		String su = "l00";
		try {
			System.out.println(Integer.parseInt(su) + 100);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
			su = "0";

		}
		System.out.println(Integer.parseInt(su) + 1000);

		System.out.println("==============================");

		// 4. by zero 100/0

		int su2 = 0;
		try {
			su2 = 100 / test2();
			System.out.println(su2);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		System.out.println("su2:" + su2);

		System.out.println("==============================");
	
		// 5. ClassCastException

		Object obj = new Test01RuntimeException();
//		if (obj instanceof String) {
//			String str = (String) obj;
//		}
		
		try {
			String str = (String) obj;
		} catch (ClassCastException e) {
			 System.out.println("ClassCastException");
		}
		System.out.println("end main...");
	} // end main

	private static int test2() {

		return 0;
	}

	private static String test() {
		return null;
	}

} // end class
