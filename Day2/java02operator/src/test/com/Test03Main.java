package test.com;

import java.util.Scanner;
public class Test03Main {

	public static void main(String[] args) {
		// console text input�� �ٷ�� ��
		
		System.out.println("Hello"); // �Լ�,method,function �̶�� �Ѵ�. java������ method��� ��
		
		// 1. java.util.Scanner
//		Scanner scanner = new Scanner(System.in); // Ŭ������ �̸��� �����ϸ鼭 ()�� ���̸� constructor Ŭ������ �̸��� �ٸ��� () �������̸� �޼ҵ�
//		String name = scanner.nextLine();
//		System.out.println("name: " + name);
//		scanner.close();
		
		Scanner scannerNumber = new Scanner(System.in); // Ŭ������ �̸��� �����ϸ鼭 ()�� ���̸� constructor Ŭ������ �̸��� �ٸ��� () �������̸� �޼ҵ�
		int score = scannerNumber.nextInt();
		System.out.println("score: " + score);
		scannerNumber.close();
		
		// 2. java.io.BufferedReader
		
		
		
	} // end main()

} // end class
