package test.com;

public class Test02Bus {

	// start1 x x 매개 변수, 리턴
	// start2 x o
	// start3 o x
	// start4 o o

	public void start1() {
		System.out.println("start1()...");
	}

	public int[] start2() {
		System.out.println("start2()...");
		return new int[] { 11, 22, 33 };
	}

	public void start3(String[] names) {
		System.out.println("start3()...");
		for (String name : names) {
			System.out.println(name);
		}

	}

	public Car[] start4(Car car) {
		System.out.println("start4()...");
		return new Car[] { new Car(), new Car(), new Car(), new Car() };

	}

	public void start5(int... sus) {
		System.out.println("start5()...");
		for (int i : sus) {
			System.out.println(i);
			if (i == 66)
				return;
		}
		System.out.println("end start5()...");
	}

	public int start6(int... sus) {
		System.out.println("start6()...");
		for (int i : sus) {
			System.out.println(i);
			if (i == 66)
				return 99;
		}
		System.out.println("end start6()...");
		return 0;
	}

	public int start6(String... sus) {
		System.out.println("start6()...");
		return 0;

	}

	public int start6(int x, int y) {
		System.out.println("start6()...");
		return 0;
	}

} // end main
