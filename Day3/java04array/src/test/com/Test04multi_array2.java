package test.com;

import java.util.Iterator;

public class Test04multi_array2 {

	public static void main(String[] args) {

		// 다중배열, 다차원배열 ,,,
		String[][] strss = new String[][] {null,null};
		strss = new String[][] {
				new String[] {}, new String[] {}};
		
		strss = new String[][] {new String[] {"kim11","lee11"},
								new String[] {"kim22","lee22"},
								new String[] {"kosta","golfzon","Ori"}};
				System.out.println("strss.length: "+strss.length);
		
		// for~for로 출력해보세요
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i]+" ");
			}
			System.out.println();
		}
		System.out.println("=========================");
		
		//for each ~ for each
		for (String[] x : strss) {
			for (String i : x) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		String x= new String("kim");
		String y= new String("kim");
		System.out.println(x==y); // 참조타입에 대한 비교에서 false가 나옴
		System.out.println(x.equals(y)); // 문자열 비교는 equals를 사용하도록하자 return 값이 true
		System.out.println(x.compareTo(y)); // 반환값을 같으면 0 틀리면 1 return 값이 0
		System.out.println(x.compareTo(y)==0); // 43번째 줄을 true로 받고 싶다면
		

	} // end main()

} // end class