package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		// 1. �������
		System.out.println(10 + 3);
		System.out.println(10 - 3);
		System.out.println(10 * 3);
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		System.out.println("==============");

		// 2. ����,�Ҵ� �Ҵ翬���� ������ �����ʿ� �;��� ex) += �� =+�� ������� �ٸ� = �� ������ �����ʿ� �شٰ� ��������
		// =+ �ϸ� ������ ������ �ȳ� �� �ִµ� ������ ��.
		int su = 100;
		System.out.println(su);

		int result = su + 100;
		System.out.println(result);

		su = su + 1000;
		System.out.println(su);

		su += 1000;
		System.out.println(su);

		su += 1000;
		System.out.println(su);

		su -= 1;
		System.out.println(su);

		su = 10;
		su ^= 3;
		System.out.println(su);

		// &=, |=, <<=, >>= �̷��͵鵵 �����ϴ�

	}

}