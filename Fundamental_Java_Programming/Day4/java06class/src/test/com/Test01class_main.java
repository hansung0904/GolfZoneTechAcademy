package test.com;

public class Test01class_main {

	public static void main(String[] args) {
		// ��ü�� ����(�Ӽ��� �ʱ�ȭ �� literal)�ϰ� ����ϴ� �Լ�.
		// ���� �ٸ�Ÿ���� �ѹ��� �ֱ� ���������� ������ �ִ°� Object Ÿ����.
		// �Ӽ��� ���� �͵鸸 ������ �ִ��� or ��ɿ� ���� �͵鸸 ������ �ִ��ķθ� ������ ����.

		String name = new String("kim"); // ��ü�� String�� �Ĵٺ��ٸ� String�� ������ ���� �غ� �Ǿ� �ִ�~
		System.out.println(name.length());

		Score s = new Score();
		System.out.println(s);
		s.num = 1;
		s.name = "kim";
		s.kor = 99;
		s.eng = 88;
		s.math = 77;
		System.out.println(s.num);
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.math);
	} // end main()

} // end class