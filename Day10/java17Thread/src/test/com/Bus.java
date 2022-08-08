package test.com;

public class Bus extends Car implements Runnable {

	@Override
	public void run() {
		TestThread tt = new TestThread();
		tt.sleep_for(100, 110, "Bus...run()...", 500);
		
	}

}
