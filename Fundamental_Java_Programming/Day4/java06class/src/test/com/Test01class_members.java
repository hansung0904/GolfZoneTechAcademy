package test.com;

public class Test01class_members {

	// 1. fields - 전역변수, 상수, static or instance = (non static)
	public String name; // null이 들어가 있음.

	// 2. constructors
	public Test01class_members() {
		// init fields : 속성초기화가 주 목적.
		name = "kim";
	}

	// 3. methods : 함수, function
	// static or instance
	public void start() {
		// 기능
	}

	public static void stop() {
		//기능.
	}
	
	// 4. class(inner class-instance,static,local,anonymous)
	public class Inner {
		
	}

}