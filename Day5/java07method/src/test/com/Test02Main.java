package test.com;

public class Test02Main {

	public static void main(String[] args) {
		System.out.println("Hello Bus");

		Test02Bus b = new Test02Bus();
		b.start1();

		int[] sus = b.start2();
		for (int i = 0; i < sus.length; i++) {
			System.out.println(sus[i]);
		}

		b.start3(new String[] { "aaa", "bbb", "ccc" });

		Car[] cars = b.start4(new Car());
		for (Car car : cars) {
			System.out.println(car);
		}

		System.out.println("==========================================");

		b.start5(11,22,33,4,4);
		b.start5(new int[] {55,66,77});
		
		b.start6(3,3,3,3,66);
		b.start6("aa","bb","cc");
		
	} // end main()

} // end class
