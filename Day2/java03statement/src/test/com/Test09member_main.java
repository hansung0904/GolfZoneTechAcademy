package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test09member_main {

	public static void main(String[] args) throws IOException {
		// ȸ������ ���α׷�
		System.out.println("hello");
		// ��ȣ num : int( �ڵ���ȣ)
		// ���̵� id : String
		// ��й�ȣ pw : String
		// �̸� name : String
		// ����ȣ tel : String

		// ���� ��ºκ� - do~while �̿��Ұ�.
		// 1 admin hi1234 kim 010- xxxx -xxxx
		// 2 tester hi1234 kim 010- xxxx -xxxx
		// 3 yang2000 hi1234 kim 010- xxxx -xxxx

		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		int i = 0;
		String result = "";

		do {
			System.out.println("num["+(i+1)+"] input ID: ");
			String id = br.readLine();

			System.out.println("num["+(i+1)+"] input pw: ");
			String pw = br.readLine();

			System.out.println("num["+(i+1)+"] input name: ");
			String name = br.readLine();

			System.out.println("num["+(i+1)+"] input tel: ");
			String tel = br.readLine();

			result += "num[" + (i+1) + "] " + id + " " + pw + " " + name + "" + tel;
			result += "\n";
			i++;

			////////////////////////////////////
			System.out.println("����� x[����� �ƹ�Ű�� �����ּ���]: ");
			String x = br.readLine();
			if (x.equals("x")) {
				break;
			}

		} while (bool);

		System.out.println(result);

		System.out.println("end main....");

	} // end main()

} // end class