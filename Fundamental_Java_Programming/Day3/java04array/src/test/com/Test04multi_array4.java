package test.com;

public class Test04multi_array4 {

	public static void main(String[] args) {
		//���߹迭, �������迭
		
		// 2.�����迭
		String[][] strss = new String[2][3];
		
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				strss[x][i] = "hi";
			}
		}
		
		System.out.println("strss.length: "+ strss.length);
		
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i] + " ");
			}
			System.out.println();
		}

	} // end main()

} // end class