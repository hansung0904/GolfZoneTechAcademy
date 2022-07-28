package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test03member_array {

	public static void main(String[] args) throws IOException {
		// 회원가입 프로그램 do~while 지우고 for + array
		System.out.println("hello");
		// 번호 num : int( 자동번호)
		// 아이디 id : String
		// 비밀번호 pw : String
		// 이름 name : String
		// 폰번호 tel : String

		// 최종 출력부분 - do~while 이용할것.
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