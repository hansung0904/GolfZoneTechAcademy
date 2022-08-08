package test.com;

public class Test01Main {

	public class Inner extends Thread {

		public Inner() {
			System.out.println("Inner()...");
		}

		@Override
		public void run() {
			TestThread tt = new TestThread();
			tt.sleep_for(50, 60, "Inner run()...", 500);
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello Thread");
		TestThread tt = new TestThread();

		Thread main = Thread.currentThread();
		System.out.println("main: " + main.getName());

		// 1. Thread Ŭ������ ��ӹ޾� ����ó���ϱ�
		// �������̵� : run() method
		// ����������� : start() <<- ��ü�����Ѱſ��ٰ� .start()

		// 1-1.�͸���Ŭ������ ���ó��

		Thread t = new Thread() { // anonymous inner �� ���ó��
			@Override
			public void run() {
				tt.sleep_for(10, 20, "run()..", 500);
//				System.out.println("run()...");
			}
		};
		t.start(); // start�� �� ��� �� ������ call�̶� main �����Ŀ� ����
		t.setName("Thread 1-1");
		System.out.println("t: " + t.getName());

		// 1-2. extends Thread
		ThreadEx tex = new ThreadEx();
		tex.start(); // start �Ǿ����� Ÿ�̹������δ� �ƹ����� try catch���ź��ٴ� ���� �� �ۿ� ����.
		System.out.println("tex: " + tex.getName());
		// 1-3. Inner(inner class��) extends Thread implements runnable�� �� �� �ֱ��� �ٵ� �ؿ���
		// ����

		Inner inner = new Test01Main().new Inner();
		inner.start();

		// 2. Runnable �������̽��� ��ӹ޾� ������ ó���ϱ�.
		// �������̵� : run() method
		// ������ �������� ����. start() �޼ҵ� ���� x
		// Thread �����ڿ� parameter�� ���� ��
		// Thread ��ü�� ������ : start()

		// 2-1. anonymous inner class Runnable
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				tt.sleep_for(1000, 1010, "Anonymous run()...", 700);
			}
		});
		t3.start();
		// 2-2. implements Runnable
		Bus b = new Bus();
		Thread t2 = new Thread(b);
		t2.start();

		tt.sleep_for(0, 10, "", 1000);

		System.out.println("end main...");
	} // end main

} // end class
