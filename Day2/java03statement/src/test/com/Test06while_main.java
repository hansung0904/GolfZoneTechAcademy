package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test06while_main {

	public static void main(String[] args) throws IOException {
		// �ݺ��� while, do ~ while
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("hello");

		boolean bool = true;
		String x = "y";
		while (bool) {
			// ����ó������
			System.out.println("����� x�Է�[����ϰ������ �ƹ�Ű]");
			
//			x ="x";
			x = br.readLine();
			
			if (x.equals("x")) break;

		} // end while

		System.out.println("end main...");

	} // end main()

} // end class
