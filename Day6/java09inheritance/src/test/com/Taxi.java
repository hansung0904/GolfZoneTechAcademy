package test.com;

public class Taxi extends Car {
	@Override
	public int open() {
		System.out.println("Taxi Open()...");
		return 3;
	}
}
