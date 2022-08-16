package test.com;

public class Car { // car 앞에서 final 선언 해버리면 상속 다 박살남. 만약에 Car class를 final 선언하게 될 경우에 새로 로직 짜야함.
	
	protected int price;
	protected String model_name;
	
	public Car() {
		System.out.println("car()...");
	}
	
	public int open() { // method에 final 들어가는 순간 Overriding 금지 즉 super것만 써라~
		System.out.println("Car open()...");
		return 4;
	}
	
	
}
