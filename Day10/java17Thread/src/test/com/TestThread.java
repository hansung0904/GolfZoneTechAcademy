package test.com;

public class TestThread {

	public void sleep_for(int firstValue, int lastValue, String msg, long time) { // synchronized는 thread일때 thread safe를 보장받고 싶을때 쓰여짐.
		try {
			for (int i = firstValue; i < lastValue; i++) {
				System.out.println(msg+ i);
				Thread.sleep(time);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
