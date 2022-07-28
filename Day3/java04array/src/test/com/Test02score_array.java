package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test02score_array {

	public static void main(String[] args) throws IOException {
		// for문 + 배열을 이용해서 3명 성적처리

		System.out.println("성적처리");

		// 시스템 구문
		// 1번 학생의 이름을 입력하세요.
		// 1번 학생의 국어 점수를 입력하세요.
		// 1번 학생의 영어 점수를 입력하세요.
		// 1번 학생의 수학 점수를 입력하세요.

		// 최종입력구문
		// 1. kim 99 88 77 264 88.0 B
		// 2. lee 99 99 99 264 88.0 B
		// 3. yang 99 88 77 264 88.0 B

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String[] result = new String[3];

		for (int i = 1; i < result.length; i++) {
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

//			System.out.println("total: " + total);
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
			result[i] = i + " " + name + " " + kor + " " + math + " " + eng + " " + avg + " " + grade;
			for (String x : result) {
				System.out.println(x);
			}
		}
		System.out.println(result);

		br.close();
		r.close();

	} // end main()

} // end class
