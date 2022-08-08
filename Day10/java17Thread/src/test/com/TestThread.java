package test.com;

public class TestThread {

	public void sleep_for(int firstValue, int lastValue, String msg, long time) { // synchronized�� thread�϶� thread safe�� ����ް� ������ ������.
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
