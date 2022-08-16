package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello interface...");

		// �������̽� : ���߻���� �����Ѵ�.
		// �������̽����� ��� �Ǵ�
		// Ŭ������ �������̽����� ���
		// ��� ���������� public static final�̴�.
		// �����ڰ� ����.
		// �޼ҵ��� ���� : ������ abstract(��������),
		// ���ִ� default, static

		String str = "kim";
		CharSequence cs1 = "lee";
		CharSequence cs2 = new String("lee");

		System.out.println(Father.MAX_MONEY);
		System.out.println(new Me_class().work());
		System.out.println(new Me_class().drive());
		System.out.println(Father.drink());

		System.out.println("================================");

		Me_class me = new Me_class(); // Me_class�� ���� �� ��밡��
		System.out.println(me.work());
		System.out.println(me.drive());
		me.aaa();
		System.out.println("================================");

		Father father = new Me_class(); // father�� ���� �� ��밡��
		System.out.println(father.work());
		System.out.println(father.drive());
		// father.aaa(); �̷��Դ� ����� �� ����.
		System.out.println("================================");

		Father father2 = new Father() {

			@Override
			public int work() {
				System.out.println("anonymous inner");
				return 0;
			}
		};

		father2.work();

		System.out.println("===============================");
		test(new Father() {

			@Override
			public int work() {
				System.out.println("args workd()");
				return 0;
			}
		});

	} // end main

	public static Father test(Father me) {
		me.work();
		return new Me_class() {
		}; // {}�� �� �� ����
//		Me_class me = new Me_class();
	}

} // end class
