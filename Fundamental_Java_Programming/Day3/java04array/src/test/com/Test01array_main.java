package test.com;

public class Test01array_main {

	int[] su = { 1, 2, 3, 4, 5, 6 };

	public Test01array_main() {
		su = new int[] { 1, 2, 3, 4, 5, 6, 0 };
	}

	public static void main(String[] args) {
		// �迭Ÿ���� ����Ÿ�� ����Ÿ���� ��ü�� ������ �����ϴ� Ÿ�� �� �ּҸ� �����~��� ����� �����ִ� ���¿����� ������ �ȳ���.
		System.out.println("Hello array");
		// ��Ȯ�� �������� �ʿ��� ��쿡�� ������ 500������ ������־���Ѵ�. �Ʒ��� �ּ�ó��
//		String user_name = "kim";
//		String product_name = "ss_nb004";
//		String model_name = "car_911";
//		String store_name = "ms_app";

		// new �����ڸ� ���ؼ� Ÿ���� �������� �ʴ� ������ ������ ������ ���Ӱ� �ּҸ� �Ҵ翡�� ���� error �߻�
		// �׷��� new �����ڸ� ���ؼ� Ÿ���� �����ִ� ������ ������.
		// 1.�迭�� �����Ҵ�.

		String[] name = new String[] { "kim", "chs", "kim", "kim", null }; // new String[] �̷��� �����ִ°��� �����̳� ���ÿ��� ������ ����.
		System.out.println(name[0]);
		System.out.println(name[1]);
		int[] su = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(su[0]);
		System.out.println(su[5]);
		System.out.println(su.length - 1);
		System.out.println(su.length);

		double[] dd = new double[] { 0.1, 0.2, 0.3, 0.0 }; // 0.0�� �־�� �ϴ°��� primitive type���� null���� �� �� ����.
		dd = new double[] { 0.1, 0.2, 0.3, 0.0, 0.2, 0.3, 0.0 };
		for (int i = 0; i < dd.length; i++) {
			System.out.println(dd[i]);
		}
		boolean[] bb = new boolean[] { true, false }; // 0�� �ش��ϴ� false�� �⺻���̴�~
		bb = new boolean[] { true, true, false, true };
		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);
		}

		Test01array_main[] tm = new Test01array_main[] { null, new Test01array_main() }; // Ŭ������ Ÿ���̱� ������ �迭�� ����� �� �� �ִٴ� ���� ������.

		int[] scores = new int[] { 0, 0, 0, 0, 0 };

		// �ּҰ� ���� �ϰ� ������~ �����͸� �ְ������ 50��° ��ó�� �����͸� �Է����־���Ѵ�. (�����Ҵ��Ҷ�)
		int[] scores2 = null;
		scores2 = new int[] {11,22,33};

	} // end main()

} // end class