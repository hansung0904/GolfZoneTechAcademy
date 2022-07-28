package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test08score_do_while {

	public static void main(String[] args) throws IOException {
		// 반복문 while, do ~ while
		System.out.println("hello");
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		String x = "y";
		int i = 0;
		
		
		String result = "";
		// 최종입력구문
		// 1. kim 99 88 77 264 88.0 B
		// 2. lee 99 99 99 264 88.0 B
		// 3. yang 99 88 77 264 88.0 B

		do {
			// 성적처리로직
			x = br.readLine();
			System.out.println(i + "번 학생의 이름을 입력하세요");
			String name = br.readLine();
			System.out.println("name: " + name);

			System.out.println(i + "번 학생의 국어 점수를 입력하세요");
			String kor = br.readLine();
			System.out.println("kor: " + kor);

			System.out.println(i + "번 학생의 영어 점수를 입력하세요");
			String eng = br.readLine();
			System.out.println("eng: " + eng);

			System.out.println(i + "번 학생의 수학 점수를 입력하세요");
			String math = br.readLine();
			System.out.println("math: " + math);

			int total = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);

			System.out.println("total: " + total);
			System.out.println("=====================");

			double avg = total / 3.0;
			System.out.println("avg: " + avg);

			String grade = "A";
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
				break;
			}
			
			result += i + " " + name + " "+ kor +" " + math + " " + eng + " " + avg + " " + grade;
			result += "\n";
			if (x.equals("x"))
				break;
		} while (bool);
		
		System.out.println(result);
		i++;
		br.close();
		r.close();
		
		System.out.println("end main...");

	} // end main()

} // end class
