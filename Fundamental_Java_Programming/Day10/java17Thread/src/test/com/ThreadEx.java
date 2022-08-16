package test.com;

public class ThreadEx extends Thread {
	public ThreadEx() {
		setName("Thread >> ThreadEX");
	}

	@Override
	public void run() {
		TestThread tt = new TestThread();
		tt.sleep_for(30, 40, "ThreadEx...run()...", 50);
	}
}
