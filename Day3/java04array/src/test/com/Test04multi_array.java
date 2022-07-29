package test.com;

public class Test04multi_array {

	public static void main(String[] args) {

		// 다중배열, 다차원배열 ,,,

		// 1. 동적배열
//		int[][] suss = new int[][] {null,null}; // 가장 기본적인건 null, null 이렇게 넣어주는방법 
//		int[][] suss = new int[][] {new int[] {}, new int[] {}};
		int[][] suss = new int[][] {new int[] {11,22,33}, 
									 new int[] {44,55,66,77}};
		System.out.println("suss.length: " + suss.length);
		System.out.println("suss.length: " + suss[0].length);
		System.out.println("suss.length: " + suss[1].length);
		System.out.print(suss[0][0]+" ");
		System.out.print(suss[0][1]+" ");
		System.out.println(suss[0][2]+" ");
		System.out.print(suss[1][0]+" ");
		System.out.print(suss[1][1]+" ");
		System.out.print(suss[1][2]+" ");
		System.out.println(suss[1][3]);
		System.out.println("=============");
		for (int i = 0; i < suss.length; i++) {
			System.out.println(suss[i]);
		}
		for (int i = 0; i < suss[0].length; i++) {
			System.out.print(suss[0][i]+" ");
		}
		System.out.println();
		for (int i = 0; i < suss[1].length; i++) {
			System.out.print(suss[1][i]+" ");
		}
		System.out.println();
		System.out.println("=============");
		
		for (int x = 0; x < suss.length; x++) {
			for (int i = 0; i < suss[x].length; i++) {
				System.out.print(suss[x][i]+" ");
			}
			System.out.println();
		}

	} // end main()

} // end class