package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello Method");
		System.out.println(args);
		System.out.println(args.length);
		
		for (String x : args) {
			System.out.println(x);
		}
		
		// void : 반환값이 없다. --> 당연히 반환타입도 없다.
		System.out.println(System.currentTimeMillis());
		System.out.println();
//		return; ->> 이게 생략되어 있음 왜 ? void이기 때문에 void가 아니면 return을 무조건 붙여줘야한다.
		
		Test01Person p = new Test01Person();
		p.sleep1();
		p.sleep2(30000000,"KN_K9");
		
		int sleep_time = p.sleep3();
		System.out.println(sleep_time);
		
		String result = p.sleep4(3.14,3);
		System.out.println(result);
		
		
	} // end main()

} // end class
