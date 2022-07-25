package test.com.hello;

public class Test02type_variable {
	
	/* final */ byte b = 0; // 전역변수 - 전역변수 일때는 기본값으로 알아서 할당
			// 전역변수에 상수가 아닐때는 초기화하지 않으면 기본값이할당됨.
			// 주의 : final선언시는 반드시 초기화 해줘야함.

	public static void main(String[] args) {
		// 타입과 변수
		// 타입종류 : 기본타입(primitive type) ,참조타입(reference type 객체, 배열)
		// 변수 : 소문자로 시작하는 명사 권장.
		//		: 전역변수, 지역변수
		// 메인 메서드 밖에 있는 변수는 전역 변수
		// 메인 메서드 안에 있는 변수는 지역 변수
		// final 표기시 상수가된다.(불변의 값을 가짐) , readonly 상태 (읽기전용을 의미)
		// 기본타입 : 
		// 1.정수(byte,short,char,int,long) 기본값 = 0
		
		/*final*/ byte b = 0; // 지역변수 = 로컬변수 (선언 + 초기화)
		System.out.println(b);
		// 사용 = 값변경(초기화), 
		b = 10; // 1바이트 용량 1byte == 8bit : 0000 0000
		System.out.println(b); // 값 확인
		System.out.println(Byte.MIN_VALUE+" ~ "+ Byte.MAX_VALUE);
		
		short s = 100; // 2byte
		System.out.println(Short.MIN_VALUE+" ~ "+ Short.MAX_VALUE);
		
		char c = 100; // 2byte, 0 or 양의 정수
		System.out.println((int)Character.MIN_VALUE+" ~ "+(int)Character.MAX_VALUE);
		
		char c2 = 'A'; //
		c2 = (char) 70000; // 얘는 down casting이 된다 
		System.out.println(Character.MIN_VALUE+" ~ "+ Character.MAX_VALUE);
		
		int su = 100; // 4byte
		System.out.println(Integer.MIN_VALUE+" ~ "+ Integer.MAX_VALUE);
		
		long ll = 300L; // 8byte
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		
		
		
		// 2. 실수(float, double) 기본값 = 0.0

		float f = (float)3.14; // 3.14f 라고 표기해도 됨. 실수는 정밀도를 표기한다~ (많은 양을 표기한다기보다)
		System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		
		double d = 3.14;
		System.out.println(Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
		
		// 3. 참,거짓(boolean) 비트단위의 값인 0,1 에서 나오는데 숫자 0 과 1 에서 0이 기본값
		
		boolean bool = false; // true
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		
		// 그래서 false 가 기본값임 
		// 참조타입 기본값은 = null(주소가 할당되지 않았다)
		// 1. 문자열(String)
		String name = "kim";
		name = "lee";
		System.out.println(name);
		
		String name2 = new String(new char[] {'A'});
		System.out.println(name2);
		
		String name3 = new String("A");
		System.out.println(name3);
		
		
		
		// 2. 배열(Array [],{} 사용, 연산자는 new 사용, 모든타입에 []사용)
		// 3. 객체(Object new를 사용 첫글자 대문자 ex)Cxxxxxx 클래스)
		
	} // end main()
	

} // end class
