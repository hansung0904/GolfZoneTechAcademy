package test.com;

public class Student extends Person {

	int num;
	String school_name;
	double weight = 100;

	public Student() {
		super(10000);
		System.out.println("Student()...");
		System.out.println(super.weight); // 50 -->10000
		System.out.println(this.weight);
		// 100
		/* super.�� �����Ǿ��ִ�. */sleep(); // Person�� sleep()�� �ִ�.
		super.sleep();
		this.sleep();
	}
	// ����Ŭ���� �Լ��� ������ �ߴ� >> �������̵�

	@Override
	public void sleep() {
		System.out.println("Student sleep()...");
	}
	
	// �����ε�..
	public void sleep(int x) {
		System.out.println("Student sleep()...");
	}

	public void study() {
		System.out.println("study()...");
	}
}
