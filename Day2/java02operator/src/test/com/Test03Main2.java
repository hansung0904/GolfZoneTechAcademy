package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03Main2 {

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

//		String grade = System.out.println(avg>=90 ? "A" : 
//			avg>=80 ? "B" : 
//				avg>=70 ? "C" : "D");

		double avg = total / 3.0;
		System.out.println("avg: " + avg);

		String grade = " ";
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			System.out.println("F");
		}
//		System.out.println("grade: " + grade);

		// 수학 math : String,
		// 평균 avg : Double
		// 등급 grade : String : 삼항연사자로 표현 - A B C D ... 이런식으로

		// 위에것을 한줄로 표현하면
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));

		// close 습관하 하도록 하자 java는 garbage collector에 의해서 메모리 누수를 자동적으로 관리해주지만 습관화~
		br.close();
		r.close();

	} // end main()

} // end class
