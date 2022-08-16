package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02switch_main2 {

	public static void main(String[] args) throws IOException {
		// console text input을 다루는 법

		System.out.println("Hello"); // 함수,method,function 이라고 한다. java에서는 method라고 함

		// 2. java.io.BufferedReader

		Reader r = new InputStreamReader(System.in); // r 과 InputStreamReader는 상속관계
		BufferedReader br = new BufferedReader(r);
		System.out.println("Input your name: ");
		String name = br.readLine();
		System.out.println("name: " + name);

		System.out.println("Input your kor: ");
		String kor = br.readLine();
		System.out.println("kor: " + kor);

		System.out.println("Input your eng: ");
		String eng = br.readLine();
		System.out.println("eng: " + eng);

		System.out.println("Input your math: ");
		String math = br.readLine();
		System.out.println("math: " + math);

		int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);

		System.out.println("total: " + total);
		System.out.println("=====================");

		double avg = total / 3.0;
		System.out.println("avg: " + avg);
		
		String grade;
		if (100 >= avg && avg >=90 ) {
			grade = "A";
		} else if (70>=avg && avg>80) {
			grade = "B";
		}  

		switch ((int) avg) {
		case 90:
			if (avg >= 90) {
				grade = "A";
			}
			break;
		case 80:
			if (avg >= 80) {
				grade = "B";
			}
			break;
		case 70:
			if (avg >= 70) {
				grade = "C";
			}
			break;
		case 60:
			if (avg >= 60) {
				grade = "D";
			}
			break;

		default:
//			System.out.println(grade);
			break;
		}

		br.close();
		r.close();

	} // end main()

} // end class