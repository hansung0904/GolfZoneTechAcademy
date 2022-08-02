package test.com;

public class Bus extends Car { // class에 final 붙이면 상속안할거야~

	public int station_count;
	protected String com_name;

	public Bus() {
		System.out.println("Bus()...");
	}

	public String autoDoorOpen() {
		System.out.println("autoDoorOpen()...");
		System.out.println(station_count);
		System.out.println(com_name);
		System.out.println(price);
		System.out.println(model_name);
		open();
		return "back door";
	}

	@Override
	public int open() {
		System.out.println("Bus override Open()...");
		return 2;
	}
}
