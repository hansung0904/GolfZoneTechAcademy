package test.com;

public class MemberOuter { // Ŭ������ ���� �����Ǵµ� �� ���� inner class�� ���� ������~
						  //  �ۿ� �ִ� �Լ������ ���������� ���� ������ ���� �Ҽӿ�(this) �־ ������ ��ü��
						 //	  �������� �ʰ� �̿��� �� �ִٴ� ������ �ֱ� ����..
						//    MemberOuter���� inner�Ÿ� ������ �� ������ ��ü�����ؼ� ���־����. 

	int su = 100;
	String name = "kim";

	public void test() {
		System.out.println("test()...");
		System.out.println(new Inner().num);
	}

	public class Inner { // static�� �������� class ������ static�� �������־���Ѵ�. interface & class ��ӵ� �����ϴ� �� ��¥ class�̴ϱ�
		int num = 99;
		String str = "Hello";

		public Inner() {
			System.out.println("MemberOuter Inner()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}

		public void sum() { // static�� �ƴ� �ֵ��� Member Inner�� �ǰ�, static�� ���� �� �ִ¾ֵ��� static Inner���ȴ�.
			System.out.println("sum() ...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}
	}

}
