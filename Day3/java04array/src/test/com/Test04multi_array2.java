package test.com;

import java.util.Iterator;

public class Test04multi_array2 {

	public static void main(String[] args) {

		// ���߹迭, �������迭 ,,,
		String[][] strss = new String[][] {null,null};
		strss = new String[][] {
				new String[] {}, new String[] {}};
		
		strss = new String[][] {new String[] {"kim11","lee11"},
								new String[] {"kim22","lee22"},
								new String[] {"kosta","golfzon","Ori"}};
				System.out.println("strss.length: "+strss.length);
		
		// for~for�� ����غ�����
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
		System.out.println(x==y); // ����Ÿ�Կ� ���� �񱳿��� false�� ����
		System.out.println(x.equals(y)); // ���ڿ� �񱳴� equals�� ����ϵ������� return ���� true
		System.out.println(x.compareTo(y)); // ��ȯ���� ������ 0 Ʋ���� 1 return ���� 0
		System.out.println(x.compareTo(y)==0); // 43��° ���� true�� �ް� �ʹٸ�
		

	} // end main()

} // end class