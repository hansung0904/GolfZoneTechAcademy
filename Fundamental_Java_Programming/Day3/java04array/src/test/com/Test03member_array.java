package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03member_array {

	public static void main(String[] args) throws IOException {
		// ȸ������ ���α׷� do~while ����� for + array
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
		String[] result = new String[3];

		for (int j = 0; j < result.length; j++) {
			System.out.println("num[" + (j + 1) + "] input ID: ");
			String id = br.readLine();

			System.out.println("num[" + (j + 1) + "] input pw: ");
			String pw = br.readLine();

			System.out.println("num[" + (j + 1) + "] input name: ");
			String name = br.readLine();

			System.out.println("num[" + (j + 1) + "] input tel: ");
			String tel = br.readLine();

			result[j] = "num[" + (j + 1) + "] " + id + " " + pw + " " + name + "" + tel;
		}
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("end main....");
	}
}