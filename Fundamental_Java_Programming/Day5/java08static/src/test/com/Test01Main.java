package test.com;

public class Test01Main {
	
	static String model = "KN";
	String model2 = "KN2";
	
	public void eat() {
		System.out.println("eat()...");
		
	}

	public static void main(String[] args) {
		
		
		System.out.println("Hello static");

		Test01static st = new Test01static();
		System.out.println(st.num1);
		System.out.println(Test01static.num2); // static은 클래스이름으로 접근하도록 하자.

		st.num1 = 100;
		Test01static.num2 = 200;
		System.out.println(st.num1);
		System.out.println(Test01static.num2);
		
		System.out.println("==============================");
		
		System.out.println(st.name1);
		System.out.println(Test01static.name2);
		
		st.name1 = "chs";
		Test01static.name2 = "hanseong";
		System.out.println(st.name1);
		System.out.println(Test01static.name2); // 여기도 10번째줄과 마찬가지
		
		System.out.println("==============================");
		System.out.println(Test01static.NAME_THREE);
		
		// Test01static.NAME_THREE = "Kim"; // readonly 이다~
		
		// Test01static.run();
		
		st.start();
		Test01static.sleep();
		
		System.out.println("==============================");
		
		Test01Main main = new Test01Main(); // main이 스태틱이라서 객체 생성 해주어야 동작함.
		main.eat();
		System.out.println(main.model2);
		System.out.println(model);
		
		

	} // end main

} // end class
