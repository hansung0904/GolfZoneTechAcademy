package test.com;

import java.util.Scanner;
public class Test03Main {

	public static void main(String[] args) {
		// console text input을 다루는 법
		
		System.out.println("Hello"); // 함수,method,function 이라고 한다. java에서는 method라고 함
		
		// 1. java.util.Scanner
//		Scanner scanner = new Scanner(System.in); // 클래스의 이름과 동일하면서 ()를 붙이면 constructor 클래스의 이름과 다른데 () 동사형이면 메소드
//		String name = scanner.nextLine();
//		System.out.println("name: " + name);
//		scanner.close();
		
		Scanner scannerNumber = new Scanner(System.in); // 클래스의 이름과 동일하면서 ()를 붙이면 constructor 클래스의 이름과 다른데 () 동사형이면 메소드
		int score = scannerNumber.nextInt();
		System.out.println("score: " + score);
		scannerNumber.close();
		
		// 2. java.io.BufferedReader
		
		
		
	} // end main()

} // end class
