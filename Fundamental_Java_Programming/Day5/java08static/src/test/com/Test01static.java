package test.com;

public class Test01static {

	int num1;
	static int num2;

	String name1;
	static String name2;

	static final String NAME_THREE = "hanseong!"; // static final 은 숫자까지 대문자로 적어주자 숫자 전에는 _ 으로 구분

	public static void run() {
		System.out.println("run()...");
	}
	
	public void start() {
		System.out.println("start()...");
		run();
		stop();
	}
	
	public static void sleep() {
		System.out.println("sleep()....");
		Test01static st= new Test01static(); // static method 에서 non-static method 를 call 할때는 객체 생성해서 call 해주도록 하자.
		st.stop();
		
	}
	
	public void stop() {
		System.out.println("stop()....");
		
	}
}
