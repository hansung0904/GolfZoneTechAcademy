package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello Inheritance");

		// ��� : Ŭ���� ���� ��� ( ���ϻ�Ӹ��ȴ�) - �������� ���� ����
		// �������̽� ���� ���(���߻������)
		// Ŭ������ �������̽� ���� ���

		Person p = new Person(1000);
		System.out.println(p.weight);
		System.out.println(p.address);
		p.sleep();
		System.out.println("=========================");

		Student s = new Student();
		System.out.println(s.weight);
		System.out.println(s.address);
		System.out.println(s.num);
		System.out.println(s.school_name);
		s.sleep(); // @override ���ϸ� person.sleep() �̶�� ���~
		s.study();
		s.sleep(100);
	} // end main

} // end class
