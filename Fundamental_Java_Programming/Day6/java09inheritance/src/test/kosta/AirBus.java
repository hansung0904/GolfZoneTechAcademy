package test.kosta;

import test.com.Bus;

public class AirBus extends Bus {
	
	public int wing_count;
	public String staff_count;
	
	public AirBus() {
		System.out.println("AirBus()...");
	}
	
	public double fly() {
		System.out.println("fly()...");
		System.out.println(wing_count);
		System.out.println(station_count);
		return 45.3;
	}
	
	@Override
	public String autoDoorOpen() {
		System.out.println("AirBus autoDoorOpen()...");
		return "side door";
	}
	
	@Override
	public int open() {
		System.out.println("AirBus override open()...");
		return 2;
	}

}
