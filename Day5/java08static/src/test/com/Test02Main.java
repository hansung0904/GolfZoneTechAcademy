package test.com;

public class Test02Main {

	public static void main(String[] args) {

		System.out.println("Hello SingleTon");
		
		
		
		Test02SingleTon singleTon1 = Test02SingleTon.getInstance();
		System.out.println(singleTon1);
		Test02SingleTon singleTon2 = Test02SingleTon.getInstance();
		System.out.println(singleTon2); // 아무리 많이 만들어도 주소는 같음 왜? new를 사용해서 만든게 아니라서~

//		new Test02SingleTon(); // 생성이 안됨 왜? private으로 막아놨기 때문에

	} // end main

} // end class
