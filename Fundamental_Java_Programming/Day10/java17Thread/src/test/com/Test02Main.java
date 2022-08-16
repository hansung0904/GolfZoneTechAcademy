package test.com;

public class Test02Main {
	public static void main(String[] args) {
		// 메소드동기화 synchronized
		System.out.println("Hello Synchronized");

		Calculator cal = new Calculator();

		User1 user1 = new User1();
		user1.setCal(cal);
		user1.start();
		User2 user2 = new User2();
		user2.setCal(cal);
		user2.start();

	} // end main

} // end class
