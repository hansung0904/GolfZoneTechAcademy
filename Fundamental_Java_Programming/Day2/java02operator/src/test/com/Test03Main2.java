package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03Main2 {

	public static void main(String[] args) throws IOException {
		// console text input�� �ٷ�� ��

		System.out.println("Hello"); // �Լ�,method,function �̶�� �Ѵ�. java������ method��� ��

		// 2. java.io.BufferedReader

		Reader r = new InputStreamReader(System.in); // r �� InputStreamReader�� ��Ӱ���
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

		// ���� math : String,
		// ��� avg : Double
		// ��� grade : String : ���׿����ڷ� ǥ�� - A B C D ... �̷�������

		// �������� ���ٷ� ǥ���ϸ�
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));

		// close ������ �ϵ��� ���� java�� garbage collector�� ���ؼ� �޸� ������ �ڵ������� ������������ ����ȭ~
		br.close();
		r.close();

	} // end main()

} // end class