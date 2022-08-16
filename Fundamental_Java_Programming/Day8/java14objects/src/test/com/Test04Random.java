package test.com;

import java.util.Random;

public class Test04Random {
	public static void main(String[] args) {
		System.out.println("Hello Random");
		
		Random ran = new Random();
		System.out.println(ran.nextInt()); // 4 byte
		System.out.println(ran.nextLong()); // 8 byte
		System.out.println(ran.nextFloat()); // 4 byte
		System.out.println(ran.nextDouble()); // 8 byte
//		ran.nextBytes(new byte[] {11,22,33}); // call 만 가능 확인 불가
		System.out.println(ran.nextInt(3)); // 0 1 2 사이에서 랜덤 제일 자주 사용 파라미터로 값을 범위를 정해줄 수 있다.
		
		
		
	} // end main

} // end class
