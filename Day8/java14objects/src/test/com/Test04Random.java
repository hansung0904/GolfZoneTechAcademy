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
//		ran.nextBytes(new byte[] {11,22,33}); // call �� ���� Ȯ�� �Ұ�
		System.out.println(ran.nextInt(3)); // 0 1 2 ���̿��� ���� ���� ���� ��� �Ķ���ͷ� ���� ������ ������ �� �ִ�.
		
		
		
	} // end main

} // end class
