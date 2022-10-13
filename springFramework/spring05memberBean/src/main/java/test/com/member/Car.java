package test.com.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car {
	private static final Logger logger = 
			LoggerFactory.getLogger(Car.class);

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
	
	public void start() {
		logger.info("start()...");
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}

}
