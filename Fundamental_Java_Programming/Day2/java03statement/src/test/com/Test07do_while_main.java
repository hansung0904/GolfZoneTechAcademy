package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test07do_while_main {

	public static void main(String[] args) throws IOException {
		// �ݺ��� while, do ~ while
		System.out.println("hello");
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		String x = "y";

		do {
			// ����ó������
			System.out.println("����� x�Է�[����ϰ������ �ƹ�Ű]");

//			x ="x";
			x = br.readLine();

			if (x.equals("x"))
				break;
		} while (bool);

		System.out.println("end main...");

	} // end main()

} // end class
