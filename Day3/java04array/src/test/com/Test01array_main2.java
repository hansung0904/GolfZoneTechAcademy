package test.com;

public class Test01array_main2 {
	public static void main(String[] args) {
		// �迭
		System.out.println("Hello array");

		// 2. �迭�� �����Ҵ�
		// �迭�� ���̸� ���� ����
		// �迭�� �����Ҷ� �������� �Ҵ��Ұ���~ �������� �Ҵ��Ұ��� ������ �ؾ��Ѵ�~

		int[] sus = new int[5];
//		sus[0] = 100;
//		sus[1] = 1000;
//		sus[2] = 10000;
//		sus[3] = 100000;
//		sus[4] = 1000000;
// 		sus[-1] = 1000000; <-- java���� -1���� ���� �迭 ������ ����. arrayIndexOutofBounds exception �߻�

		for (int i = 0; i < sus.length; i++) {
			sus[i] = (int) (10 * Math.pow(10, i + 1));
		}

		System.out.println("sus.length: " + sus.length);

		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}

		System.out.println("===============================");

		double[] ds = new double[50];
		for (int i = 0; i < ds.length; i++) {
			if (i % 2 == 0) {
				ds[i] = Math.PI;
			}
		}
		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		}
		System.out.println("===============================");

		// boolean�����Ͱ� 3�� ����ִ� �迭�� ��������~
		boolean[] bb = new boolean[3];
		for (int i = 0; i < bb.length; i++) {
			bb[i] = true;
		}

		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]); // Ÿ���� �⺻���� false false false ���
		}
		System.out.println("===============================");
		// foreach�� Ȱ����1
		for (boolean b : bb) {
			System.out.println(b);
		}
		System.out.println("===============================");
		// �̸��� 3������ִ� ���ڿ� �迭�� �����غ�����~
		String[] name = new String[3]; // �⺻���� null, null, null �� �� �ִ�
		for (int i = 0; i < name.length; i++) {
			name[i] = "kim" + i;
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println("===============================");

		// foreach�� Ȱ����2 - ��� ���� : �� ��°�͸� ������ ��� �Ұ���.
		for (String x : name) {
			System.out.println(x);
		}
		System.out.println("===============================");
		
		String[][] namess = new String[2][];
		System.out.println(namess[0]);
		for (String[] names : namess) {
			for(String a:names) {
				System.out.println(a);
			}
		}

	} // end main()

} // end class