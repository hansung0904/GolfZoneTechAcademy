package test.com;

public class Car { // car �տ��� final ���� �ع����� ��� �� �ڻ쳲. ���࿡ Car class�� final �����ϰ� �� ��쿡 ���� ���� ¥����.
	
	protected int price;
	protected String model_name;
	
	public Car() {
		System.out.println("car()...");
	}
	
	public int open() { // method�� final ���� ���� Overriding ���� �� super�͸� ���~
		System.out.println("Car open()...");
		return 4;
	}
	
	
}
