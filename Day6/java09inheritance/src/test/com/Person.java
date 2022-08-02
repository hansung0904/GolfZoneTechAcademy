package test.com;

/* import java.lang.Object; *임포트를 안해도 사용가능* */

public class Person /*extends Objects*/ {

	double weight = 50;
	String address;

	public Person() {
		System.out.println("Person()...");
	}

	public void sleep() {
		System.out.println("Person sleep()...");
	}
	
	public Person(double weight) {
		System.out.println("Person(double weight");
		this.weight = weight;
	}

}
