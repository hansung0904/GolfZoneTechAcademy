package test.com;

public class Test04multi_array3 {

	public static void main(String[] args) {
		// ���߹迭, �������迭
		// 2. �����迭

		int[][] suss = new int[3][4];
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				suss[x][i] = x+i;
			}
			System.out.println();
		}
		
		System.out.println("suss.length: " + suss.length);
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i] + " ");
			}
			System.out.println();
		}
		

	} // end main()

} // end class