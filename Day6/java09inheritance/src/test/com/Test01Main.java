package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello Inheritance");

		// 상속 : 클래스 간의 상속 ( 단일상속만된다) - 의존도가 가장 강함
		// 인터페이스 간의 상속(다중상속지원)
		// 클래스와 인터페이스 간의 상속

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
		s.sleep(); // @override 안하면 person.sleep() 이라고 뜬다~
		s.study();
		s.sleep(100);
	} // end main

} // end class
