package test.com.createbean;

public class Car {

	private String model;
	private int price;

	public Car() {
		model = "OOOO";
		price = 3000;
	}

	public Car(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

}
