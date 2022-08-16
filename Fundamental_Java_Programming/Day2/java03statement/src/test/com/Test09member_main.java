package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test09member_main {

	public static void main(String[] args) throws IOException {
		// 회원가입 프로그램
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
			System.out.println("종료시 x[계속은 아무키를 눌러주세요]: ");
			String x = br.readLine();
			if (x.equals("x")) {
				break;
			}

		} while (bool);

		System.out.println(result);

		System.out.println("end main....");

	} // end main()

} // end class