package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test07member_multi_array {

	public static void main(String[] args) throws IOException {
		// 2���� �迭�� �̿��� ȸ���������α׷�.
		Reader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		boolean bool = true;
		String[][] result = new String[3][5];

			for (int j = 0; j < result.length; j++) {
				System.out.println("num[" + (j + 1) + "] input ID: ");
				String id = br.readLine();

				System.out.println("num[" + (j + 1) + "] input pw: ");
				String pw = br.readLine();

				System.out.println("num[" + (j + 1) + "] input name: ");
				String name = br.readLine();

				System.out.println("num[" + (j + 1) + "] input tel: ");
				String tel = br.readLine();

//				"num[" + (j + 1) + "] " + id + " " + pw + " " + name + "" + tel
				
				// split ����ؼ� ó�� �� ���� ����.
				result[j] = new String[] {String.valueOf(j+1),id,pw,name,tel};

			}

		
		for (String[] x : result) {
			for (String i : x) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("end main....");

	} // end main()

} // end class
