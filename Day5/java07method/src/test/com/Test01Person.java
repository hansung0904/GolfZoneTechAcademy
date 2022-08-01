package test.com;

public class Test01Person {

	// 잠자는 기능을 위한 메소드 sleep
	public void sleep1() {
		System.out.println("sleep1()");

	}

	public void sleep2(int price, String car_model) {
		System.out.println("sleep2(int price,String car_model)");
		System.out.println(price);
		System.out.println(car_model);
		// return;
	}

	public int sleep3() {
		System.out.println("sleep3()...");
		return 1;
	}
	
	public String sleep4(double avg_time, int count) {
		System.out.println("sleep4()...");
		System.out.println(avg_time);
		System.out.println(count);
		return "Good";
	}

}
